package controller;

import util.Teclado;

public class Qt11 {
	public static void main(String[] args) {

		int a[] = new int[5];
		int maior, menor, soma;
		double media;

		a[0] = Teclado.lerInt("Digite um número");
		maior = a[0];
		menor = a[0];
		soma = a[0];
		for (int i = 1; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um número");
			soma += a[i];
			if (maior < a[i]) {
				maior = a[i];
			}
			if (menor > a[i]) {
				menor = a[i];
			}
		}
		media = soma / 5;
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + media);
	}
}
