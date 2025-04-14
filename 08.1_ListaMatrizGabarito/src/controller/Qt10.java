package controller;

import util.Teclado;

public class Qt10 {
	public static void main(String[] args) {

		int a[][] = new int[3][5];
		int b[] = new int[5];
		int soma = 0;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 3; i++) {
				a[i][j] = Teclado.lerInt("Digite um número");
				soma += a[i][j];
			}
			b[j] = soma;
			soma = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(b[i] + "\t");
		}
	}
}
