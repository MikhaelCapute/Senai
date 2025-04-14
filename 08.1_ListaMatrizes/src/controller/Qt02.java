package controller;

import util.Teclado;

public class Qt02 {
	public static void main(String[] args) {
		int a[][] = new int [3][2];
		int soma = 0;
		
		for (int i = 0; i < 3 ; i ++) {
			for (int j = 0 ; j < 2 ; j ++) {
				a[i][j] = Teclado.lerInt("Digite um número:");
				soma += a[i][j];
			}
		}
		
		for (int i = 0 ; i < 3 ; i ++) {
			for (int j = 0 ; j < 2 ; j ++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Somatório: " + soma);
	}
}
