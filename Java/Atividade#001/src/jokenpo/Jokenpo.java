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

        String escolhaJogador;
        int escolhaComputador;
        
        escolhaComputador = escolha.nextInt(3)+1;
        System.out.println("______________________________________________");
        System.out.println("|                                            |");
        System.out.println("|                  JOKENPÔ                   |");
        System.out.println("|____________________________________________|");
        System.out.print("\nEscolha uma opçao entre\n - PEDRA\n - PAPEL\n - TESOURA\n\nDigite sua escolha: ");
        escolhaJogador = leitor.next();
        System.out.println("______________________________________________");
        
        if(escolhaJogador.equalsIgnoreCase("pedra")) {
        	if(escolhaComputador == 1) {
        		System.out.println("\nSua escolha: PEDRA - VS - Escolha do PC: PEDRA\n*EMPATE* - Pedra não quebra pedra!");
        	} else if(escolhaComputador == 2) {
        		System.out.println("\nSua escolha: PEDRA - VS - Escolha do PC: PAPEL\n*DERROTA* - Pedra é embrulhada por papel!");
        	} else {
        		System.out.println("\nSua escolha: PEDRA - VS - Escolha do PC: TESOURA\n*VITÓRIA* - Pedra quebra tesoura!");
        	}
        } else if(escolhaJogador.equalsIgnoreCase("papel")) {
        	if(escolhaComputador == 1) {
        		System.out.println("\nSua escolha: PAPEL - VS - Escolha do PC: PEDRA\n*VITÓRIA* - Papel cobre a pedra!");
        	} else if(escolhaComputador == 2) {
        		System.out.println("\nSua escolha: PAPEL - VS - Escolha do PC: PAPEL\n*EMPATE* - Papel não rasga papel!");
        	} else {
        		System.out.println("\nSua escolha: PAPEL - VS - Escolha do PC: TESOURA\n*DERROTA* - Papel é cortado por tesoura!");
        	}
        } else {
        	if(escolhaComputador == 3) {
        		System.out.println("\nSua escolha: TESOURA - VS - Escolha do PC: PEDRA\n*DERROTA* - Tesoura é destruida por pedra!");
        	} else if(escolhaComputador == 2) {
        		System.out.println("\nSua escolha: TESOURA - VS - Escolha do PC: PAPEL\n*VITÓRIA* - Tesoura rasgou o papel!");
        	} else {
        		System.out.println("\nSua escolha: TESOURA - VS - Escolha do PC: TESOURA\n*EMPATE* - Tesoura não corta tesoura!");
        	}
        }
        
    }
	
}
