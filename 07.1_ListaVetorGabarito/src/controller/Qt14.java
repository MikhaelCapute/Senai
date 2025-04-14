package controller;

import util.Teclado;

public class Qt14 {
	public static void main(String[] args) {

		int a[] = new int[3];
		int b[] = new int[3];
		int fat;

		for (int i = 0; i < 3; i++) {
			fat = 1;
			a[i] = Teclado.lerInt("Digite um número");

			for (int aux = 1; aux <= a[i]; aux++) {
				fat *= aux;
			}
			b[i] = fat;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i] + " fatorial = " + b[i]);
		}
	}
}
