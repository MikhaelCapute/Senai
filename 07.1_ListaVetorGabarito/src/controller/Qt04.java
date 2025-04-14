package controller;

import util.Teclado;

public class Qt04 {
	public static void main(String[] args) {

		int a[] = new int[8];
		int b[] = new int[8];

		for (int i = 0; i < 8; i++) {
			a[i] = Teclado.lerInt("Digite um número");
			b[i] = a[i] * 3;
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(a[i] + " * 3 = " + b[i]);
		}
	}
}
