package controller;

import util.Teclado;

public class Qt16 {
public static void main(String[] args) {
	String t = Teclado.lerTexto("Digite seu time:");
	
	
	if (t.equals("Flamengo")) {
		System.out.println("VERMELHO E PRETO");
	} else {
		if (t.equals("Botafogo")) {
			System.out.println("PRETO E BRANCO");
		} else {	
			if (t.equals("Fluminense")) {
				System.out.println("VERMELHO, BRANCO e VERDE");
			} else {
				if (t.equals("Vasco")) {
					System.out.println("PRETO E BRANCO");
				} else {
					System.out.println("Seu time não é um dos 4 principais times cariocas");
				}
			}
		}
	
	} 
	
}
}
