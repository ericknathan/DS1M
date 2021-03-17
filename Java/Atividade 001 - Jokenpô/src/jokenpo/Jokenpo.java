package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
	
	/*
	 * 1 = PEDRA
	 * 2 = PAPEL
	 * 3 = TESOURA
	 */

    public static void main(String[] args) {
    	
        Random escolha = new Random();
        Scanner leitor = new Scanner(System.in);
        
        String nomeJogador;
        String escolhaJogador;
        int escolhaComputador;
        
        System.out.print("Insira seu nome: ");
        nomeJogador = leitor.nextLine().split(" ")[0];
        
        escolhaComputador = escolha.nextInt(3)+1;
        System.out.println("\n______________________________________________");
        System.out.println("|                                            |");
        System.out.println("|                  JOKENPÔ                   |");
        System.out.println("|____________________________________________|");
        System.out.print("\nEscolha uma opçao entre\n - PEDRA\n - PAPEL\n - TESOURA\n\nDigite sua escolha: ");
        escolhaJogador = leitor.next();
        System.out.println("______________________________________________");
        
        if(!escolhaJogador.equalsIgnoreCase("pedra") && !escolhaJogador.equalsIgnoreCase("papel") && !escolhaJogador.equalsIgnoreCase("tesoura")) {
        	System.out.println("\n ERRO: Você não inseriu uma opção válida!");
        } else {
        	if(escolhaJogador.equalsIgnoreCase("pedra")) {
            	if(escolhaComputador == 1) {
            		System.out.println("\n"+ nomeJogador +": PEDRA - VS - Computador: PEDRA\n*EMPATE* - Pedra não quebra pedra!");
            	} else if(escolhaComputador == 2) {
            		System.out.println("\n"+ nomeJogador +": PEDRA - VS - Computador: PAPEL\n*DERROTA* - Pedra é embrulhada por papel!");
            	} else {
            		System.out.println("\n"+ nomeJogador +": PEDRA - VS - Computador: TESOURA\n*VITÓRIA* - Pedra quebra tesoura!");
            	}
            } else if(escolhaJogador.equalsIgnoreCase("papel")) {
            	if(escolhaComputador == 1) {
            		System.out.println("\n"+ nomeJogador +": PAPEL - VS - Computador: PEDRA\n*VITÓRIA* - Papel cobre a pedra!");
            	} else if(escolhaComputador == 2) {
            		System.out.println("\n"+ nomeJogador +": PAPEL - VS - Computador: PAPEL\n*EMPATE* - Papel não rasga papel!");
            	} else {
            		System.out.println("\n"+ nomeJogador +": PAPEL - VS - Computador: TESOURA\n*DERROTA* - Papel é cortado por tesoura!");
            	}
            } else {
            	if(escolhaComputador == 3) {
            		System.out.println("\n"+ nomeJogador +": TESOURA - VS - Computador: PEDRA\n*DERROTA* - Tesoura é destruida por pedra!");
            	} else if(escolhaComputador == 2) {
            		System.out.println("\n"+ nomeJogador +": TESOURA - VS - Computador: PAPEL\n*VITÓRIA* - Tesoura rasgou o papel!");
            	} else {
            		System.out.println("\n"+ nomeJogador +": TESOURA - VS - Computador: TESOURA\n*EMPATE* - Tesoura não corta tesoura!");
            	}
            }	
        }
        
    }
	
}
