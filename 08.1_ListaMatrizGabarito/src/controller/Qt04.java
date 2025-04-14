package controller;

import util.Teclado;

public class Qt04 {
	public static void main(String[] args) {

		double a[][] = new double[5][2];
		double soma = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = Teclado.lerDouble("Digite um número");
				soma += a[i][j];
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Média " + (soma / 10));

	}
}
