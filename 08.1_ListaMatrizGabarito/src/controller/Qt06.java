package controller;

import util.Teclado;

public class Qt06 {
	public static void main(String[] args) {

		double a[][] = new double[3][5];
		double soma = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Teclado.lerDouble("Digite um número");
				soma += a[i][j];
			}
			a[i][4] = soma / 4;
			soma = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
