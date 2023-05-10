package Avaliacao;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetor = new int[20];
		int[] vetorNovo;
		int num, checagem;

		for (int cont = 0; cont < 20; cont++) {
			System.out.println("Digite um número: ");
			vetor[cont] = leia.nextInt();
		}

		System.out.println("Digite um número para verificarmos: ");
		num = leia.nextInt();

		checagem = verifica(vetor, num);

		if (checagem > 0) {
			vetorNovo = novoVetor(vetor, num, checagem);
			System.out.println("Novo vetor:\n");

			for (int cont = 0; cont < vetorNovo.length; cont++) {
				System.out.println(vetorNovo[cont]);
			}

		} else {
			System.out.println("O vetor não possuia esse número");
		}

		leia.close();
	}

	static int verifica(int[] vetor, int num) {
		int conta = 0;
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] == num) {
				conta++;
			}
		}

		return conta;
	}

	static int[] novoVetor(int[] vetor, int num, int checagem) {

		int[] vetor2 = new int[20 - checagem];

		for (int cont1 = 0; cont1 < vetor2.length; cont1++) {
			if (vetor[cont1] != num) {
				vetor2[cont1] = vetor[cont1];
			}

		}
		return vetor2;
	}

}
