package controller;

import util.Teclado;

public class Qt05 {
public static void main(String[] args) {
	
	int idade;
	String  sexo;
	String nome;
	
	for (int i = 0; i <= 20; i ++) {
		nome = Teclado.lerTexto("Digite o seu nome inteiro:");
		sexo = Teclado.lerTexto("Digite o seu sexo (Masculino / Feminino: ");
		idade = Teclado.lerInt("Digite a sua idade: ");
		if (sexo .equals("Masculino") && (idade >= 21)) {
			System.out.println("Nome: " + nome);
		}
	}
	System.out.println("");
}
}
