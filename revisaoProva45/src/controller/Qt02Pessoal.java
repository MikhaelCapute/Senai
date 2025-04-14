package controller;

import util.Teclado;

public class Qt02Pessoal {
	public static void main(String[] args) {
		//Uma escola deseja salvar o boletim de um aluno em uma matriz. O aluno possui
		//as seguintes matérias: matemática, português, ciências, inglês, geografia,
		//história, educação física e artes. A escola trabalha com 4 trimestres e as notas
		//variam de 0 a 100.
		//Ao final o algoritmo deverá mostrar a média final do aluno em todas as matérias
		//e também em qual trimestre ele teve o melhor rendimento.
		
		String mat[] = {"Matemática", "Português", "Ciências", "Inglês", "Geografia",
				"História", "Educação Física" , "Artes"};		
		
		double boletim[][] = new double [8][5];
		double tri = 0, maior = 0;
		int soma = 0;
		
		
		for (int i = 0 ; i < 8 ; i ++) {
			System.out.println(mat[i]);
			for (int j = 0 ; j < 4 ; j ++) {
				boletim[i][j] = Teclado.lerInt((j+1) + "° NOTA:");
				soma += boletim[i][j];
			}
		boletim[i][4] = soma / 4;
		soma = 0;
		}
		System.out.println("N1\tN2\tN3\tN4\tMEDIA");
		for(int i = 0 ; i < 8 ; i ++) {
			for(int j = 0 ; j < 5 ; j ++) {
				System.out.print(boletim[i][j] + "\t");
			}
			System.out.println("");
		}
		
		for (int j = 0 ; j < 5 ; j ++) {
			for(int i = 0 ; i < 8 ; i ++) {
				tri = boletim[i][4];
				if (tri > maior) {
					maior = tri;
				}
			}
		}
		System.out.println("Maior média: " + maior);
		
		
	}
	
}
