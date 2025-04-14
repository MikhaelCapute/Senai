package controller;

import util.Teclado;

public class Qt15 {
	public static void main(String[] args) {

		String a[][] = new String[8][8]; //criação de matriz
		int linha, col, pontos = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				a[i][j] = "Água";
			}
		}

		System.out.println("Jogador 1, posicione seus veículos!");
		linha = Teclado.lerInt("Defina a linha para o navio: ");
		col = Teclado.lerInt("Defina a coluna para o navio: ");
		if ((linha >= 0) && (linha < 8) && (col >= 0) && (col < 8)) {
			a[linha][col] = "Navio";
		} else {
			System.out.println("Fora do tabuleiro, reiniciando");
			main(args);
		}

		linha = Teclado.lerInt("Defina a linha para o submarino");
		col = Teclado.lerInt("Defina a coluna para o submarino");
		if (a[linha][col].equals("Água")) {
			if ((linha >= 0) && (linha < 8) && (col >= 0) && (col < 8)) {
				a[linha][col] = "Submarino";
			} else {
				System.out.println("Fora do tabuleiro, reiniciando");
				main(args);
			}
		} else {
			System.out.println("Posicionou sobre outro veículo. Reiniciando");
			main(args);
		}
		
		linha = Teclado.lerInt("Defina a linha para o Porta-aviões");
		col = Teclado.lerInt("Defina a coluna para o Porta-aviões");
		if (a[linha][col].equals("Água")) {
			if ((linha >= 0) && (linha < 8) && (col >= 0) && (col < 8)) {
				a[linha][col] = "Porta-aviões";
			} else {
				System.out.println("Fora do tabuleiro, reiniciando");
				main(args);
			}
		} else {
			System.out.println("Posicionou sobre outro veículo. Reiniciando");
			main(args);
		}
		
		linha = Teclado.lerInt("Defina a linha para o Barco");
		col = Teclado.lerInt("Defina a coluna para o Barco");
		if (a[linha][col].equals("Água")) {
			if ((linha >= 0) && (linha < 8) && (col >= 0) && (col < 8)) {
				a[linha][col] = "Barco";
			} else {
				System.out.println("Fora do tabuleiro, reiniciando");
				main(args);
			}
		} else {
			System.out.println("Posicionou sobre outro veículo. Reiniciando");
			main(args);
		}
		
		System.out.println("Posicionando os veículos");
		for (int i = 0; i < 50; i++) {
			System.out.println(".");
		}
		
		System.out.println("Jogador 2 - Prepare-se!");
		
		for (int i = 1; i < 6; i++) {
			linha = Teclado.lerInt("Escolha a linha para o tiro: " + i);
			col = Teclado.lerInt("Escolha a coluna para o tiro: " + i);
			if ((linha >= 0) && (linha < 8) && (col >= 0) && (col < 8)) {
				switch (a[linha][col]) {
				case "Navio":
					System.out.println("Parabéns! Acertou o navio. 2 pontos!");
					pontos+=2;
					a[linha][col] = "Água";
					break;
				case "Barco":
					System.out.println("Parabéns! Acertou o barco. 1 ponto!");
					pontos+=1;
					a[linha][col] = "Água";
					break;
				case "Submarino":
					System.out.println("Parabéns! Acertou o submarino. 3 pontos");
					pontos+=3;
					a[linha][col] = "Água";
					break;
				case "Porta-aviões":
					System.out.println("Parabéns! Acertou o porta-aviões. 4 pontos");
					pontos+=4;
					a[linha][col] = "Água";
					break;
					default:
						System.out.println("Que pena! Acertou a água");
				}
			} else {
				System.out.println("Tiro longe demais! Perdeu essa chance");
			}
		}
		
		System.out.println("Jogador 2 fez " + pontos + " ponto(s)");
	}
}
