package controller;

import util.Teclado;

public class Qt09 {
	public static void main(String[] args) {

		String nome[] = new String[3];
		String op, busca;
		boolean existe = false;

		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite um nome");
		}

		op = Teclado.lerTexto("Deseja perquisar no vetor?");
		while (op.equals("sim")) {
			busca = Teclado.lerTexto("Digite o nome para a busca");
			for (int i = 0; i < 3; i++) {
				if (busca.equals(nome[i])) {
					existe = true;
				}
			}
			if (existe == true) {
				System.out.println("Nome existe no vetor");
			} else {
				System.out.println("Nome não existe no vetor");
			}
			existe = false;
			op = Teclado.lerTexto("Deseja pesquisar no vetor?");
		}
	}
}
