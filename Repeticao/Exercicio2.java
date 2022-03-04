/*
 * Ler 10 números e imprimir quantos são pares e
 * quantos são ímpares.
 */

package Repeticao;

public class Exercicio2 {
	public static void main (String[]args) {
	int n, i=1, p=1;
	
	for (n=1;n<10;n++)
	{
		if(n%2==0)
		{
			p=p+1;
		}
		else
		{
			i=10-p;
		}
	}	
	System.out.println("Quantidade de números par: " + p);	
	System.out.println("Quantidade de números ímpar: " + i);
	}
	

}
