/*
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

package Introducao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		double n1, n2, n3, soma, media;
		
		Scanner mediaTotal = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		n1=mediaTotal.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2=mediaTotal.nextDouble();
		System.out.println("Digite a nota 3: ");
		n3=mediaTotal.nextDouble();
		
		soma=2+3+5;
		media=((n1*2)+(n2*3)+(n3*5))/soma;
		
		System.out.printf("O resultado �: %.2f",media);
	}
}
