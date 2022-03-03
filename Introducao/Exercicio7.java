/*
 * Um sistema de equações lineares do tipo:
 * ax+by =c
 * dx+ey=f
 * pode ser resolvido segundo mostrado abaixo :
 * x=(ce-bf)/ae-bd
 * y=(af-cd)/ae-bd
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 */

package Introducao;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String[] args) {
		float a, b, c, d, e, f, x, y;
		
		Scanner coeficiente = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		a=coeficiente.nextFloat();
		System.out.println("Valor de B: ");
		b=coeficiente.nextFloat();
		System.out.println("Valor de C: ");
		c=coeficiente.nextFloat();
		System.out.println("Valor de D: ");
		d=coeficiente.nextFloat();
		System.out.println("Valor de E: ");
		e=coeficiente.nextFloat();
		System.out.println("Valor de F: ");
		f=coeficiente.nextFloat();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.printf("\nO valor de X é: %.2f",x);
		System.out.printf("\nO valor de Y é: %.2f",y);
	}

}
