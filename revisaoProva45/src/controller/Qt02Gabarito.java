package controller;

import util.Teclado;

public class Qt02Gabarito {
	public static void main(String[] args) {
		String materias[] = {"Matemática", "Português", "Ciências", "Inglês", 
				"Geografia", "História", "Educação Física", "Artes"};
		
		int a[][] = new int [8][5];
		int soma = 0;
		int mediaGeral = 0;
		int trimestre = 0;
		
		for (int i = 0 ; i < 8 ; i ++) {
			System.out.println("Disciplina: " + materias[i]);
			for (int j = 0 ; j < 4 ; j ++) {
				a[i][j] = Teclado.lerInt("Digite a nota do " + (j+1) + "º trimestre da disciplina.");
				soma += a[i][j];
			}
			a[i][4] = soma / 4;
			soma = 0;
		}
		
		for (int j = 0 ; j < 4 ; j ++) {
			for (int i = 0 ; i < 8 ; i ++ ) {
				soma += a[i][j];
			}
			soma = soma/8;
			if (mediaGeral < soma) {
				mediaGeral = soma;
				trimestre = j + 1;
			}
			soma = 0;
		}
		System.out.println("Exibindo o boletim");
		System.out.println("Disciplina\t1º Tri\t2º Tri\t3º Tri\t4º Tri\tMÉDIA");
		for(int i = 0 ; i < 8 ; i ++) {
			System.out.print(materias[i] + "\t");
			for (int j = 0 ; j < 5 ; j ++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Melhor trimestre: " + trimestre + "° com média " + mediaGeral);
		
		
	}
}
