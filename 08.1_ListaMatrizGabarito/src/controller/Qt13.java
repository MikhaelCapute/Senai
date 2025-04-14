package controller;

import util.Teclado;

public class Qt13 {
public static void main(String[] args) {
	
	double a[][] = new double[5][11];
	double maior = 0;
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 10; j++) {
			a[i][j] = Teclado.lerDouble
	("Insira a altura do atleta " + (j+1) + " da delegação " + (i+1));
			if (maior < a[i][j]) {
				maior = a[i][j];
			}
		}
		a[i][10] = maior;
		maior = 0;
	}
	
	System.out.println("A1\tA2\tA3\tA4\tA5\tA6\tA7\tA8\tA9\tA10\tMaior");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 11; j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println("");
	}
}
}
