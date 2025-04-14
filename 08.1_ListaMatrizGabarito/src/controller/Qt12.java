package controller;

import util.Teclado;

public class Qt12 {
public static void main(String[] args) {
	
	int qt = Teclado.lerInt("Insira a quantidade de alunos");
	int a[][] = new int[qt][5];
	int soma = 0;
	String sit = "";
	
	for (int i = 0; i < qt; i++) {
		for (int j = 0; j < 4; j++) {
			a[i][j] = Teclado.lerInt
	("Insira a nota " + (j+1) + " do aluno " + (i+1));
			soma+=a[i][j];
		}
		a[i][4] = soma/4;
		soma = 0;
	}
	
	System.out.println("N1\tN2\tN3\tN4\tMédia\tSit");
	for (int i = 0; i < qt; i++) {
		for (int j = 0; j < 5; j++) {
			if (a[i][4] >= 6) {
				sit = "AP";
			} else {
				sit = "RP";
			}
			System.out.print(a[i][j]+"\t");
		}
		System.out.print(sit);
		System.out.println("");
	}
}
}
