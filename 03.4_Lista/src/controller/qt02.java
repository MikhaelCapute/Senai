package controller;

import util.Teclado;

public class qt02 {
public static void main(String[] args) {
	String capital, capital2, capital3;
	
	
	capital = Teclado.lerTexto("Digite qual é a capital atual do Brasil: ");
	if (capital == "brasilia") {
			System.out.println("Parabéns voce acertou!! a capital do Brasil é Brasília.");
		} else {
			System.out.println("Poxa! voce errou, a capital do Brasil é Brasília.");
		}
		capital2 = Teclado.lerTexto("Digite qual foi a primeira capital do Brasil: ");
		if (capital2 == "salvador") {
			System.out.println("Parabéns! Voce acertou, a primeira capital do Brasil é Salvador");
		} else {
			System.out.println("Poxa! Voce errou, a primeira capital do Brasil é Salvador.");
		}
		capital3 = Teclado.lerTexto("Digite qual foi a segunda capital do Brasil: ");
		if (capital3 == "rio de janeiro") {
			System.out.println("Parabéns! Voce acertou, a segunda capital do Brasil é Rio de Janeiro.");
		} else {
			System.out.println("Poxa! Voce errou, a segunda capital do Brasil é Rio de Janeiro.");
		}
	}
}
