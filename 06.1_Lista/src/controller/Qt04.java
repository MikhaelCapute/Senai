package controller;

import util.Teclado;

public class Qt04 {
public static void main(String[] args) {
	String s = Teclado.lerTexto("Digite a Sigla do seu estado:");
	
	switch (s) {
	case "rj":
		System.out.println("Carioca");
		break;
		
	case "sp":
		System.out.println("Paulista");
		break;
		
	case "es":
		System.out.println("Capixaba");
		break;
		
	case "pr":
		System.out.println("Nem é gente");
		break;
		
	case "mg":
		System.out.println("Queijo, nada além");
		break;
		
	default:
		System.out.println("Provavelmente não é importante para o resto do país");
		
	}
}
}
