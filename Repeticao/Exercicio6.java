/*
 * Escrever um programa que receba v�rios n�meros inteiros
 * no teclado. E no final imprimir a m�dia dos n�meros
 * m�ltiplos de 3. Para sair digitar 0(zero).
 */

package Repeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String[]args) {
		int n, soma=0, i=0;
		double media=0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite um numero: ");
			n = ler.nextInt();
			
			if(n%3==0)
			{
				soma+=n;
				i++;
			}
		}
		
		while(n!=0);
		{
			media=soma/i;
			System.out.println("M�dia dos n�meros multiplos de 3: " + media);
		}
	}

}
