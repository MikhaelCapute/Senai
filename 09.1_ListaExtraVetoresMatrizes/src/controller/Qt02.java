package controller;

import util.Teclado;

public class Qt02 {
	public static void main(String[] args) {
		//Desenvolver um programa que armazene 5 nomes de pessoas em um vetor, e depois pergunte um nome, e se
		//for encontrado, exibir a posição desse nome no vetor, caso contrário, exibir uma mensagem informando que o
		//nome não está cadastrado.
		
		String nome[] = new String [5];
		String opc;
		boolean existe = false;
		
		for (int i = 0 ; i < 5 ; i ++) {
			nome[i] = Teclado.lerTexto("Digite um nome:");
			
		}
		
		opc = Teclado.lerTexto("Digite um nome para saber se está cadastrado:");
		
		for (int i = 0 ; i < 5 ; i ++) {
			for (int j = 0 ; j < 5 ; j ++) {
				if (opc.equals(nome[i])) {
				existe = true;
				
				}	
			}
			
			
			
		}
		if (existe == true) {
			System.out.println("O nome " + opc + " está cadastrado no nosso sistema.");
		} else {
			System.out.println("O nome " + opc + " NÃO ESTÁ no nosso sistema.");
		}
		
	}
}
