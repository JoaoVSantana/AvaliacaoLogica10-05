package Avaliacao;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double num;
		int aux;

		System.out.println("Digite um n�mero com v�rgula: ");
		num = leia.nextDouble();

		aux = funcaoA(num);
		System.out.println("A parte inteira do n�mero �: " + funcaoB(num, aux));
		System.out.println("A parte fracion�ria desse n�mero �: " + funcaoC(num, aux));

		leia.close();
	}

	static int funcaoA(double num) {
		String numero = "" + num;
		int inteiros = 0;

		for (int cont = 1; cont < numero.length(); cont++) {
			if (numero.charAt(cont) == '.') {
				inteiros = cont;
				break;
			}
		}

		return inteiros;

	}

	static String funcaoB(double num, int inteiros) {
		String numero = "" + num;
		String antesV = "";

		for (int cont = 0; cont < inteiros; cont++) {
			antesV += "" + numero.charAt(cont);
		}

		return antesV;
	}

	static String funcaoC(double num, int inteiros) {
		String numero = "" + num;
		String depoisV = "";

		for (int cont = inteiros; cont < numero.length(); cont++) {
			depoisV += "" + numero.charAt(cont);
		}

		return depoisV;
	}
}
