package controller;

import util.Teclado;

public class Ex10 {
	public static void main(String[] args) {
		String nome[] = new String[3];
		String tel[] = new String[3];
		String end[] = new String[3];
		int num;
		
		for (int i = 0 ; i < 3 ; i ++ ) {
			nome[i] = Teclado.lerTexto("NOME:");
			tel[i] = Teclado.lerTexto("TELEFONE:");
			end[i] = Teclado.lerTexto("ENDEREÇO:");
		}
		
		num = Teclado.lerInt("Digite um número:");
		
		if ((num >= 0) && (num <= 2)) {
			System.out.println("NOME: " + nome[num]);
			System.out.println("TELEFONE: " + tel[num]);
			System.out.println("ENDEREÇO: " + end[num]);
		} else {
			System.out.println("Valor fora do Escopo");
		}
				
			
		
		
	}
}
