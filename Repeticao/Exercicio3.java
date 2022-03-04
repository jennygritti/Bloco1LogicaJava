/*
 * Solicitar a idade de várias pessoas e imprimir:
 * Total de pessoas com menos de 21 anos. Total de
 * pessoas com mais de 50 anos. O programa termina
 * quando idade for =-99.
 */

package Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[]args) {
		int idade=0, jovem=0,adulto=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade ou -99 para sair do laço: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21){
				jovem++;
			}
			else {
				adulto++;
			}
			System.out.println("Digite sua idade ou -99 para sair do laço: ");
			idade = ler.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21: "+jovem);
		System.out.println("Total de pessoas com mais de 21: "+adulto);
		
	}

}
