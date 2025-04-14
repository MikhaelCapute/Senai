package controller;

import util.Teclado;

public class Qt05 {
	public static void main(String[] args) {
		String a[][] = new String [4][4];
		
		for (int i = 0 ; i < 4 ; i ++) {
			for (int j = 0 ; j < 4 ; j ++) {
				a[i][j] = Teclado.lerTexto("Digite um nome:");
			}
		}
		
		for (int i = 0; i < 4 ; i ++) {
			for (int j = 0 ; j < 4 ;j ++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		
		int lin = Teclado.lerInt("Digite a linha de 0 a 3 : ");
		if ((lin >= 0) && (lin < 4)) {
			int col = Teclado.lerInt("Digite a coluna de 0 a 3: ");
			
			if ((col >= 0) && (col < 4)) {
				System.out.print(a[lin][col] + "\t");
	
			} else {
				System.out.println("Coordenada inválida.");
			}
		} else {
			System.out.println("Coordenada inválida.");
		}
		
	}
}
