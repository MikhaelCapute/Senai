package controller;

import util.Teclado;

public class Ex08 {
	public static void main(String[] args) {
		String nome[] = new String[5];
		double pr1[] = new double[5];
		double pr2[] = new double[5];
		double media[] = new double[5]; 
		
		for (int i = 0 ; i < 5 ; i ++) {
			nome[i] = Teclado.lerTexto("NOME:");
			pr1[i] = Teclado.lerDouble("1° NOTA:");
			pr2[i] = Teclado.lerDouble("2° NOTA:");
			media[i] = (pr1[i] + pr2[i]) / 2;
			
		}
		
		for (int i = 0 ; i < 5 ; i ++ ) {
			System.out.println("NOME: " + nome[i]);
			System.out.println("PROVA 01: " + pr1[i]);
			System.out.println("PROVA 02: " + pr2[i]);
			System.out.println("MÉDIA: " + media[i]);
			if (media[i] > 6) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			System.out.println("");
		}
	}
}
