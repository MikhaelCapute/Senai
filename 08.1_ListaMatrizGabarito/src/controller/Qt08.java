package controller;

import util.Teclado;

public class Qt08 {
public static void main(String[] args) {
	
	int a[][] = new int[5][3];
	int b[][] = new int[5][3];
	int c[][] = new int[5][3];
	
	System.out.println("Preenchendo a matriz A");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			a[i][j] = Teclado.lerInt("Digite um número");
		}
	}
	
	System.out.println("Preenchendo a matriz B");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			b[i][j] = Teclado.lerInt("Digite um número");
			c[i][j] = a[i][j] + b[i][j];
		}
	}
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.print
		(" a("+i+","+j+") "  + a[i][j] + " + b("+i+","+j+") "  +
			b[i][j] + " = c("+i+","+j+") "+ c[i][j] + "|");
		}
		System.out.println("");
	}
}
}
