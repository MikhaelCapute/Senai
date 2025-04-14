package controller;

import util.Teclado;

public class qt9 {
public static void main(String[] args) {
	int razao, termo, dec_ter;
	
	razao = Teclado.lerInt("Digite o valor da razão da P.A: ");
	termo = Teclado.lerInt("Digite o 1° termo: ");
	dec_ter = termo + (10 - 1) * razao;
	
	System.out.println("O 10° elemento da P.A é: " + dec_ter);
	
	
}
}
