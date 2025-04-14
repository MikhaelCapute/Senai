package controller;

import util.Teclado;

public class Qt13 {
	public static void main(String[] args) {

		String nome[] = new String[3];
		double sal[] = new double[3];
		double salNovo[] = new double[3];

		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome");
			sal[i] = Teclado.lerDouble("Digite o salário");
			salNovo[i] = sal[i] * 1.08;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("\nNome: " + nome[i]);
			System.out.println("Salário: " + sal[i]);
			System.out.println("Salário reajustado: " + salNovo[i]);
		}
	}
}
