package Avaliacao;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int quant;

		System.out.println("Quantos números am ser digitados?:");
		quant = leia.nextInt();

		int[] lista = new int[quant];

		for (int cont = 0; cont < quant; cont++) {
			System.out.println("Digite o " + (cont + 1) + "° número");
			lista[cont] = leia.nextInt();
		}

		System.out.println("O número que mais se repete é " + verifica(lista));

		leia.close();

	}
	static int verifica(int[] lista) {
		int aux = 0, auxC = 0, conta = 0, repete = 0;

		for (int cont1 = 0; cont1 < lista.length; cont1++) {
			for (int cont = 1; cont < lista.length; cont++) {
				if (aux == lista[cont]) {
					conta++;

				}
				if (conta > auxC) {
					auxC = conta;
					repete = lista[cont];
					
				}
			}
			conta = 0;
			aux++;
		}
		return repete;
	}
}
