/*
 * Faça um programa que entre com três números e
 * coloque em ordem crescente.
 */

package Condicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		int n1, n2, n3;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o valor de N1: ");
		n1 = numero.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = numero.nextInt();
		System.out.print("Digite o valor de N3: ");
		n3 = numero.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println("N1: "+ n1);
			System.out.println("N2: "+ n2);
			System.out.println("N3: "+ n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println("N1: "+ n1);
			System.out.println("N3: "+ n3);
			System.out.println("N2: "+ n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println("N2: "+ n2);
			System.out.println("N1: "+ n1);
			System.out.println("N3: "+ n3);
		}
		else if (n2<=n3 && n3<=n1) 
	    {
			System.out.println("N2: "+ n2);
			System.out.println("N3: "+ n3);
			System.out.println("N1: "+ n1);
	    }
		else if (n3<=n1 && n1<=n2) 
	    {
			System.out.println("N3: "+ n3);
			System.out.println("N1: "+ n1);
			System.out.println("N2: "+ n2);
	    }
		else
		{
			System.out.println("N3: "+ n3);
			System.out.println("N2: "+ n2);
			System.out.println("N1: "+ n1);
	    }
		
	}

}
