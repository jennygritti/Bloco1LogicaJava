/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */

package Introducao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String[] args) {
		double custoFabr, custoCons, valorDistr, valorImp;
		double distribuidor = 0.28;
		double imposto = 0.47;
		
		Scanner consumo = new Scanner(System.in);
		
		System.out.println("Valor custo de f�brica: ");
		custoFabr=consumo.nextDouble();
		
		valorDistr = custoFabr*distribuidor;
		valorImp = custoFabr*imposto;
		custoCons = custoFabr + valorDistr + valorImp;
		
		System.out.printf("O custo do consumidor �: %.2f",custoCons);
	}

}
