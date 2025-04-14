package controller;

import util.Teclado;

public class Qt05 {
	public static void main(String[] args) {

		String a[][] = new String[4][4];
		int x, y;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Teclado.lerTexto("Digite um nome");
			}
		}

		x = Teclado.lerInt("Insira a linha para pesquisa");
		y = Teclado.lerInt("Insira a coluna para pesquisa");

		while ((x >= 0) && (x < 4) && (y >= 0) && (y < 4)) {
			System.out.println("Nome: " + a[x][y]);
			x = Teclado.lerInt("Insira a linha para pesquisa");
			y = Teclado.lerInt("Insira a coluna para pesquisa");
		}

		System.out.println("Coordenadas inválidas");
	}
}
