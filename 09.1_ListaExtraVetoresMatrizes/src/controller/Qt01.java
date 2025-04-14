package controller;

import util.Teclado;

public class Qt01 {
	public static void main(String[] args) {
		// Desenvolver um programa que armazene 5 nomes de pessoas em um vetor, e depois pergunte um número que
		// corresponda a uma pessoa e exiba este nome, ou então exiba a informação de que o número não corresponde a
		// uma pessoa cadastrada.
		
		String nome[] = new String[5];
		int opc;
		
		for (int i = 0 ; i < 5 ; i ++) {
			nome[i] = Teclado.lerTexto("Digite um nome:");
		}
		
		opc = Teclado.lerInt("Digite um número para saber o nome armazenado no vetor (1/5):");
		
		if ((opc < 6) && (opc > 0)) {
			System.out.println(nome[opc - 1]);
		} else {
			System.out.println("Valor Inválido!");
		}
			
		
	}
}
