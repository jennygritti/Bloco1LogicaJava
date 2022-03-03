/*
 * Faça um programa em que permita a entrada de um número
 * qualquer e exiba se este número é par ou ímpar.
 * Se for par exiba também a raiz quadrada do mesmo; se
 * for ímpar exiba o número elevado ao quadrado.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[]args) {
		int numero;
		double raiz, elevado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			raiz=Math.sqrt(numero);
			System.out.println("O número é par");
			System.out.printf("A raiz quadrada do número é: %.2f", raiz);
		}
		
		else
		{
			elevado=Math.pow(numero, 2);
			System.out.println("O número é ímpar");
			System.out.printf("O número elevado resulta em: %.2f", elevado);
		}
	}

}
