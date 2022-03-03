/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
package Introducao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		int dias, meses, idade;
		int idadeDias;
		
		Scanner idadeTotal = new Scanner(System.in);
		
		System.out.print("Digite a sua idade em dias: ");
		idadeDias = idadeTotal.nextInt();
		
		idade=idadeDias/365;
		meses=(idadeDias%365)/30;
		dias=idadeDias-idade*365-meses*30;
		
		System.out.printf("Sua idade em anos é: %d", idade);
		System.out.printf("\nSua idade em meses é: %d", meses);
		System.out.printf("\nSua idade em dias é: %d", dias);
	}

}
