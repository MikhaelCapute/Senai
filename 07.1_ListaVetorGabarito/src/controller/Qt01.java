package controller;

import util.Teclado;

public class Qt01 {
public static void main(String[] args) {
	
	String nome[] = new String[5];
	String prof[] = new String[5];
	
	for (int i = 0; i < 5; i++) {
		nome[i] = Teclado.lerTexto("Digite o nome");
		prof[i] = Teclado.lerTexto("Digite a profissão");
	}
	
	for (int i = 0; i < 5; i ++) {
		System.out.println(nome[i] + " é " + prof[i]);
	}
}
}
