package controller;

import util.Teclado;

public class Qt10 {
	public static void main(String[] args) {

		String nome[] = new String[3];
		String tel[] = new String[3];
		String end[] = new String[3];

		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome");
			tel[i] = Teclado.lerTexto("Digite o telefone");
			end[i] = Teclado.lerTexto("Digite o endereço");
		}

		int num = Teclado.lerInt("Digite uma posição para busca (0 a 2)");
		if ((num >= 0) && (num <= 2)) {
			System.out.println("Nome: " + nome[num]);
			System.out.println("Telefone: " + tel[num]);
			System.out.println("Endereço : " + end[num]);
		} else {
			System.out.println("Valor fora do escopo");
		}
	}
}
