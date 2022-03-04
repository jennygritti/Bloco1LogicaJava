/*
 * Uma empresa desenvolveu uma pesquisa para saber as
 * características psicológicas dos indivíduos de uma
 * região. Para tanto, a cada uma das pessoas era
 * perguntado: idade, sexo (1-feminino / 2-masculino /
 * 3-Outros), e as opções (1, se a pessoa era calma;
 * 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que
 * permita ler os dados de 150 pessoas, calcule e mostre:
 * o número de pessoas calmas;
 * o número de mulheres nervosas;
 * o número de homens agressivos;
 * o número de outros calmos;
 * o número de pessoas nervosas com mais de 40 anos;
 * o número de pessoas calmas com menos de 18 anos.
 */

package Repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[]args) {
		int i=0, idade, sexo, emocional;
		int calmos=0, nervosa=0, agressivo=0, calmosOutros=0, nervosaOutros=0, calmosJovens=0;
		
		Scanner ler = new Scanner(System.in);
		
		while(i<150)
		{
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			System.out.println("DIGITE O NUMERO DE ACORDO COM SEU SEXO");
			System.out.println("1-Feminino | 2-masculino | 3-outros: ");
			sexo=ler.nextInt();
			System.out.println("DIGITE O NUMERO DE ACORDO COM SEU ESTADO EMOCIONAL");
			System.out.println("1-Calmo(a) | 2-Nervoso(a) | 3-Agressivo(a)");
			emocional=ler.nextInt();
			
			if(emocional==1)
				calmos++;
			if(sexo==1 && emocional==2)
				nervosa++;
			if(sexo==2 && emocional==3)
				agressivo++;
			if(sexo==3 && emocional==1)
				calmosOutros++;
			if(idade>40 && emocional==2)
				nervosaOutros++;
			if(idade<18 && emocional==1)
				calmosJovens++;
			
			i++;
			
		}
		
		System.out.println("Total de pessoas calmas: "+ calmos);
		System.out.println("Total de mulheres nervosas: "+ nervosa);
		System.out.println("Total de homens agressivos: "+ agressivo);
		System.out.println("Total de outros calmos: "+ calmosOutros);
		System.out.println("Total de pessoas nervosas 40+: "+ nervosaOutros);
		System.out.println("Total de pessoas calmas 18-: "+ calmosJovens);
		
	}
	

}
