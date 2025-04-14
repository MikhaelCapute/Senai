package controller;

import util.Teclado;

public class qt11 {
public static void main(String[] args) {
	int anoN, anoA;
	
	anoN = Teclado.lerInt("Digite o ano em que voce nasceu: ");
	anoA = Teclado.lerInt("Digite o ano atual: ");
	
	if (anoN > anoA) {
		System.out.println("Valores inválidos.");
	} else {
		System.out.println("O voce tem "+ (anoA - anoN) +" anos ou irá completar essa idade.");
	}
}
}
