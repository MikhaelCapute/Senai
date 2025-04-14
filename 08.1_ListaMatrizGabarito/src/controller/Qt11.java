package controller;

import util.Teclado;

public class Qt11 {
	public static void main(String[] args) {

		double a[][] = new double[5][5];
		double soma = 0;
		double somaAnual = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Teclado.lerDouble
		("Insira o valor para a região " + (i + 1) + 
				" e trimestre " + (j + 1));
				soma += a[i][j];
			}
			a[i][4] = soma;
			somaAnual += soma;
			soma = 0;
		}

		System.out.println("T1\tT2\tT3\tT4\tTotal");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println("Soma anual " + somaAnual);
	}
}
