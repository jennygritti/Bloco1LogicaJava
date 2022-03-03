/*
 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=(R+S)/2, onde R=(A+B)^2 e S=(B+C)^2
 */

package Introducao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args) {
		int a,b,c;
		double r, s, d;
		
		Scanner calculo = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro para A: ");
		a=calculo.nextInt();
		System.out.println("Digite um valor inteiro para B: ");
		b=calculo.nextInt();
		System.out.println("Digite um valor inteiro para C: ");
		c=calculo.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.printf("O resultado é: %.2f",d);
		
	}
}
