package controller;

import util.Teclado;

public class Qt14 {
public static void main(String[] args) {
	
	int a[][] = new int[5][5];
	int linha;
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			a[i][j] = Teclado.lerInt("Digite um número");
		}
	}
	
	linha = Teclado.lerInt("Digite o valor de uma linha para "
			+ "pesquisar (de 0 a 4)");
	while ((linha >= 0) && (linha <= 4)) {
		for (int j = 0; j < 5; j++) {
			System.out.print(a[linha][j]+"\t");
		}
		System.out.println("");
		linha = Teclado.lerInt("Digite o valor de uma linha para "
				+ "pesquisar (de 0 a 4)");
	}
}
}
