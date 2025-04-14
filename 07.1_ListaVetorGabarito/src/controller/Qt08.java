package controller;

import util.Teclado;

public class Qt08 {
	public static void main(String[] args) {

		String nome[] = new String[3];
		double pr1[] = new double[3];
		double pr2[] = new double[3];
		double media[] = new double[3];
		String sit[] = new String[3];

		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome");
			pr1[i] = Teclado.lerDouble("Digite a nota da prova 1");
			pr2[i] = Teclado.lerDouble("Digite a nota da prova 2");
			media[i] = (pr1[i] + pr2[i]) / 2;
			if (media[i] >= 7) {
				sit[i] = "AP";
			} else {
				sit[i] = "RP";
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("\nNome: " + nome[i]);
			System.out.println("Nota 1: " + pr1[i] + "\tNota 2: " + pr2[i]);
			System.out.println("Média: " + media[i]);
			System.out.println("Situação: " + sit[i]);
		}
	}
}
