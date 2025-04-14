package controller;

import util.Teclado;

public class questao1 {
public static void main(String[] args) {
	String nome, sexo;
	
	nome = Teclado.lerTexto("Digite o seu nome: ");
	sexo = Teclado.lerTexto("Digite o seu sexo: ");
	
	System.out.println("Seu nome é: " + nome);
	System.out.println("Seu sexo é: " + sexo);
	
}
}
