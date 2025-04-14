package controller;

import util.Teclado;

public class qt10 {
public static void main(String[] args) {
	String estado;
	
	estado = Teclado.lerTexto("Digite o nome de um estado do Brasil: ");
	
	if ((estado.equals("rio de janeiro")) || (estado.equals("sao paulo") || (estado.equals("minas gerais") || (estado.equals("espirito santo"))))) {
		
		System.out.println("O estado " + estado + " ESTÁ localizado no sudeste.");
		
	} else {
		System.out.println("O estado " + estado + " não é localizado no sudeste.");
	}
}
}
