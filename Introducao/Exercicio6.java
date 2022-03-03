/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é: d= raiz (x2-x1)^2+(y2-y1)^2.
 */

package Introducao;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main (String[] args) {
		double px1, px2, py1, py2, distancia;
		
		Scanner distanciaTotal = new Scanner(System.in);
		
		System.out.println("Digite Ponto de X1: ");
		px1=distanciaTotal.nextDouble();
		System.out.println("Digite Ponto de X2: ");
		px2=distanciaTotal.nextDouble();
		System.out.println("Digite Ponto de Y1: ");
		py1=distanciaTotal.nextDouble();
		System.out.println("Digite Ponto de Y2: ");
		py2=distanciaTotal.nextDouble();
		
		distancia=Math.sqrt(Math.pow(px2-px1, 2)+Math.pow(py2-py1, 2));
		
		System.out.printf("A distancia é: %.2f",distancia);
	}

}
