/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
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
		
		System.out.println("Valor custo de fábrica: ");
		custoFabr=consumo.nextDouble();
		
		valorDistr = custoFabr*distribuidor;
		valorImp = custoFabr*imposto;
		custoCons = custoFabr + valorDistr + valorImp;
		
		System.out.printf("O custo do consumidor é: %.2f",custoCons);
	}

}
