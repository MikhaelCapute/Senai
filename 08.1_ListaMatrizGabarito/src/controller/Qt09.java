package controller;

import util.Teclado;

public class Qt09 {
	public static void main(String[] args) {

		double a[][] = new double[3][4];
		double b[][] = new double[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Teclado.lerDouble("Digite um número");
				b[i][j] = Math.pow(a[i][j], 2);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
