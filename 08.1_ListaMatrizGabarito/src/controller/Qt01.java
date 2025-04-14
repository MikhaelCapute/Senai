package controller;

import util.Teclado;

public class Qt01 {
	public static void main(String[] args) {

		int a[][] = new int[5][3];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = Teclado.lerInt("Digite um número");
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
