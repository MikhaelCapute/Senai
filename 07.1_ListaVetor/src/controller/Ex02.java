package controller;

import util.Teclado;

public class Ex02 {
	public static void main(String[] args) {
		int a[] = new int[5];
		int soma = 0;
		
		for (int i = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			System.out.println("");
			soma += a[i];
		}
		System.out.println("SOMATÓRIO: " + soma);
		
	}
}
