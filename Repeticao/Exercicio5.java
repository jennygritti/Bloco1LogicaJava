/*
 * Crie um programa que leia um n�mero do teclado at� que
 * encontre um n�mero igual a zero. No final, mostre a
 * soma dos n�meros digitados.
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
			System.out.println("Soma total dos n�meros: "+soma);
		}
		
	}

}
