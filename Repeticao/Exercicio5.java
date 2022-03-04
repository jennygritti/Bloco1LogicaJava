/*
 * Crie um programa que leia um número do teclado até que
 * encontre um número igual a zero. No final, mostre a
 * soma dos números digitados.
 */

package Repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[]args) {
		
		int numero=0, soma=0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			soma=soma+numero;
		}
		
		while(numero!=0);
		{
			System.out.println("Soma total dos números: "+soma);
		}
		
	}

}
