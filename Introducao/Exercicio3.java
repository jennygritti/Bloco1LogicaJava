/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

package Introducao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		int horas, minutos, segundos, tempo;
		
		Scanner tempoTotal = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento: ");
		tempo=tempoTotal.nextInt();
		horas=tempo/3600;
		minutos=tempo%3600/60;
		segundos=tempo-horas-minutos*60;
		
		System.out.println("O tempo total é de: " + horas+ ":" + minutos + ":" + segundos);
	}

}
