/*
 * Fa�a um programa que receba a idade de uma pessoa e
 * mostre na sa�da em qual categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

package Condicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual sua idade? ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Categoria Infantil");
		}
		else if(idade>=15 && idade <=17)
		{
			System.out.println("Categoria Juvenil");
		}
		else
		{
			System.out.println("Categoria Adulto");
		}
		
	}

}
