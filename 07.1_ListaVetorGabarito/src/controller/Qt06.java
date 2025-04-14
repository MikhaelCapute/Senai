package controller;

import util.Teclado;

public class Qt06 {
	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um número");
			b[4 - i] = a[i];
		}

		System.out.println("Vetor a\tVetor b");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + "\t" + b[i]);
		}
	}
}
