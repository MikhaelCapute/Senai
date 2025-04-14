package controller;

import util.Teclado;

public class Qt16 {
public static void main(String[] args) {
	
	double a[][] = new double[12][5];
	double soma = 0, somaAnual = 0;
	
	for (int i = 0; i < 12; i++) {
		for (int j = 0; j < 4; j++) {
			a[i][j] = Teclado.lerDouble
	("Digite o valor da semana " + (j+1) + " do mês " + (i+1));
			soma+= a[i][j];
		}
		a[i][4] = soma;
		somaAnual+= soma;
		soma = 0;
	}
	
	System.out.println("S1\tS2\tS3\tS4\tTotal");
	for (int i = 0; i < 12; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println("");
	}
	System.out.println("Soma anual: " + somaAnual);
}
}
