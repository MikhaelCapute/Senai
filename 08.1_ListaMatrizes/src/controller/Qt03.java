package controller;

import util.Teclado;

public class Qt03 {
	public static void main(String[] args) {
		int a[][] = new int [4][3];
		int soma = 0;
		
		for (int i = 0 ; i < 4 ; i ++) {
			for (int j = 0 ; j < 3 ; j ++) {
				a[i][j] = Teclado.lerInt("Digite um número:");
				if (a[i][j] % 2 == 0) {
					soma += a[i][j];
				}
			}
		}
		
		for (int i = 0 ; i < 4 ; i ++) {
			for (int j = 0 ; j < 3; j ++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Somatório Pares: " + soma);
	}
}
