package br.com.academia.gui;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ImcCalculatorGUI {

    public void drawFrame() {

        Color backgroundColor = new Color(20, 20, 20);
        Color greenColor = new Color(3, 234, 3);
        Color whiteColor = new Color(234, 234, 234);

        Font fontTitle = new Font("IBM Plex Mono Bold", Font.BOLD, 48);
        Font fontSubtitle = new Font("IBM Plex Mono", Font.PLAIN, 18);
        Font fontLabel = new Font("IBM Plex Mono", Font.PLAIN, 16);
        Font fontButton = new Font("IBM Plex Mono Bold", Font.BOLD, 16);

        JFrame imcFrame = new JFrame();
        imcFrame.setSize(480, 415);
        imcFrame.setTitle("Calculadora de IMC");
        imcFrame.getContentPane().setBackground(backgroundColor);
        imcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imcFrame.setLayout(null);

        JLabel imcTitle = new JLabel();
        imcTitle.setBounds(25, 22, 120, 70);
        imcTitle.setFont(fontTitle);
        imcTitle.setText("IMC_");
        imcTitle.setForeground(greenColor);

        JLabel imcSubtitle = new JLabel();
        imcSubtitle.setBounds(25, 85, 280, 25);
        imcSubtitle.setFont(fontSubtitle);
        imcSubtitle.setText("Índice de massa corporal");
        imcSubtitle.setForeground(greenColor);

        JLabel weightLabel = new JLabel();
        weightLabel.setBounds(25, 135, 180, 25);
        weightLabel.setFont(fontLabel);
        weightLabel.setText("Qual o seu peso?");
        weightLabel.setForeground(greenColor);

        JTextField weightField = new JTextField();
        weightField.setBounds(25, 165, 180, 30);
        weightField.setHorizontalAlignment(JTextField.RIGHT);

        JLabel heightLabel = new JLabel();
        heightLabel.setBounds(25, 220, 180, 25);
        heightLabel.setFont(fontLabel);
        heightLabel.setText("Qual a sua altura?");
        heightLabel.setForeground(greenColor);

        JTextField heightField = new JTextField();
        heightField.setBounds(25, 250, 180, 30);
        heightField.setHorizontalAlignment(JTextField.RIGHT);

        JButton calculateButton = new JButton();
        calculateButton.setBounds(25, 310, 180, 30);
        calculateButton.setText("Calcular");
        calculateButton.setFont(fontButton);
        calculateButton.setBackground(backgroundColor);
        calculateButton.setForeground(whiteColor);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(230, 135, 200, 45);
        resultLabel.setText("Resultado:");
        resultLabel.setForeground(whiteColor);
        resultLabel.setFont(new Font("IBM Plex Mono", Font.PLAIN, 32));

        JLabel calculatedResultLabel = new JLabel();
        calculatedResultLabel.setBounds(235, 160, 250, 100);
        calculatedResultLabel.setText("");
        calculatedResultLabel.setForeground(greenColor);
        calculatedResultLabel.setFont(new Font("IBM Plex Mono Bold", Font.BOLD, 72));

        JLabel statusLabel = new JLabel();
        statusLabel.setBounds(230, 250, 100, 25);
        statusLabel.setText("Status: ");
        statusLabel.setForeground(whiteColor);
        statusLabel.setFont(new Font("IBM Plex Mono Bold", Font.BOLD, 18));

        JLabel calculatedStatusLabel = new JLabel();
        calculatedStatusLabel.setBounds(310, 250, 170, 25);
        calculatedStatusLabel.setText("");
        calculatedStatusLabel.setForeground(greenColor);
        calculatedStatusLabel.setFont(new Font("IBM Plex Mono", Font.PLAIN, 18));

        imcFrame.getContentPane().add(imcTitle);
        imcFrame.getContentPane().add(imcSubtitle);
        imcFrame.getContentPane().add(weightLabel);
        imcFrame.getContentPane().add(weightField);
        imcFrame.getContentPane().add(heightLabel);
        imcFrame.getContentPane().add(heightField);
        imcFrame.getContentPane().add(calculateButton);
        imcFrame.getContentPane().add(resultLabel);
        imcFrame.getContentPane().add(calculatedResultLabel);
        imcFrame.getContentPane().add(statusLabel);
        imcFrame.getContentPane().add(calculatedStatusLabel);

        imcFrame.setVisible(true);

        /* Ouvintes de eventos:
        *    -> LISTENER = OUVINTE
        */
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double imc = calculateImc(weight, height);

                calculatedResultLabel.setText(String.format("%.1f",imc));

                if(imc <= 18.5) { calculatedStatusLabel.setText("Abaixo do peso"); }
                else if(imc < 25) { calculatedStatusLabel.setText("Peso ideal"); }
                else if(imc < 30) { calculatedStatusLabel.setText("Acima do peso"); }
                else if(imc < 35) { calculatedStatusLabel.setText("Obesidade I"); }
                else if(imc < 40) { calculatedStatusLabel.setText("Obesidade II"); }
                else { calculatedStatusLabel.setText("Obesidade III"); }
            }
        });

        weightField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10) {
                    heightField.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { }
        });

        heightField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {

                int x = heightField.getX();
                int y = heightField.getY();

                if(e.getKeyCode() == 39) {
                    heightField.setBounds(x + 5, y, 180, 30);
                } else if(e.getKeyCode() == 37) {
                    x = heightField.getX();
                    y = heightField.getY();
                    heightField.setBounds(x - 5, y, 180, 30);
                }
                /* if(e.getKeyCode() == 10) {
                    calculateButton.doClick();
                } */
            }

            @Override
            public void keyReleased(KeyEvent e) { }
        });

    }

    private double calculateImc(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

}
