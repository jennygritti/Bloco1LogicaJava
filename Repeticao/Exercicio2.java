/*
 * Ler 10 n�meros e imprimir quantos s�o pares e
 * quantos s�o �mpares.
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
	System.out.println("Quantidade de n�meros par: " + p);	
	System.out.println("Quantidade de n�meros �mpar: " + i);
	}
	

}
