/*
 * Fa�a um programa que receba tr�s inteiros e
 * diga qual deles � o maior.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		int n1, n2, n3;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o valor de N1: ");
		n1 = numero.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = numero.nextInt();
		System.out.print("Digite o valor de N3: ");
		n3 = numero.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("N1 � o maior");
		}
		if (n2>n1 && n2>n3)
		{
			System.out.println("N2 � o maior");
		}
		if (n3>n1 && n3>n2)
		{
			System.out.println("N3 � o maior");
		}
		
	}

}
