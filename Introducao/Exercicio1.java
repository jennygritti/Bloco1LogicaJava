/*
 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 */

package Introducao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		int dias, meses, idade;
		int idadeDias;
		
		Scanner idadeTotal = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = idadeTotal.nextInt();
		System.out.print("Digite quantos meses você tem: ");
		meses = idadeTotal.nextInt();
		System.out.print("Digite quantos dias você tem: ");
		dias = idadeTotal.nextInt();
		
		idadeDias = idade*365+meses*30+dias;
		
		System.out.printf("Sua idade em dias é: %d", idadeDias);
		
	}

}
