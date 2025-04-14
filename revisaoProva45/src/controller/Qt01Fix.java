package controller;

import util.Teclado;

public class Qt01Fix {
	public static void main(String[] args) {
		int a[] = new int[20];
		int soma = 0;
		double media = 0;
		
		for (int i = 0; i < 20 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			soma += a[i];
		}
		media = soma / 20;
		
		for (int i = 0 ; i < 20 ; i ++) {
			for (int j = 0 ; j < 20 ; j ++) {
				if (a[i] < a[j]) {
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		System.out.println("Somatório: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Do menor para o maior:");
		for (int i = 0 ; i < 20 ; i ++) {
			System.out.println(a[i]);
		}
	}
}
