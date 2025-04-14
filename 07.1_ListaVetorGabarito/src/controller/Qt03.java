package controller;

import util.Teclado;

public class Qt03 {
	public static void main(String[] args) {
		int a[] = new int[5], soma = 0;

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um número");
			if (a[i] % 2 != 0) {
				soma += a[i];
			}
		}

		System.out.println("Somatório: " + soma);
	}
}
