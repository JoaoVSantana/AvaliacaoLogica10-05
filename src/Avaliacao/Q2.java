package Avaliacao;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota1, nota2, nota3;
		String opcao;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextInt();

		
		System.out.println("Digite a tecla da operação que deseja fazer:"
				+ "\nA) Média aritmética"
				+ "\nP) Média ponderada"
				+ "\nH) Média Harmônica");
		opcao = leia.next();
		
		switch (opcao) {
		
		case "A":
			System.out.println("A média aritmética das notas é :" + aritmetica(nota1, nota2, nota3));
			break;
			
		case "P":
			System.out.println("A média ponderada das notas é :" + ponderada(nota1, nota2, nota3));
			break;
			
		case "H":
			System.out.println("A média harmônica das notas é :" + harmonica(nota1, nota2, nota3));
			break;
			
		default :
			System.out.println("Caracter inválido");
			break;
		} 
		
		leia.close();
	}
	static int aritmetica(int nota1, int nota2, int nota3) {
		int media;
		
		media = (nota1 + nota2 + nota3) / 3;
		
		return media;
		
	}
	static double ponderada(int nota1, int nota2, int nota3) {
		double media;
		int peso1 = 5, peso2 = 3, peso3 =2, somaP = 10;
		
		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / somaP;
		
		return media;
		
	}
	static double harmonica (int nota1, int nota2, int nota3) {
		double media;
		
		media = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
		
		return media;
	}

}
