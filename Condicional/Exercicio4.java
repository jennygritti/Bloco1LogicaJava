/*
 * Fa�a um programa em que permita a entrada de um n�mero
 * qualquer e exiba se este n�mero � par ou �mpar.
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se
 * for �mpar exiba o n�mero elevado ao quadrado.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[]args) {
		int numero;
		double raiz, elevado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			raiz=Math.sqrt(numero);
			System.out.println("O n�mero � par");
			System.out.printf("A raiz quadrada do n�mero �: %.2f", raiz);
		}
		
		else
		{
			elevado=Math.pow(numero, 2);
			System.out.println("O n�mero � �mpar");
			System.out.printf("O n�mero elevado resulta em: %.2f", elevado);
		}
	}

}
