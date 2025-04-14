package controller;

import util.Teclado;

public class Ex01 {
		public static void main(String[] args) {
			
			//Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte ao usuário o nome e a profissão
			//de 5 pessoas e preencha estes vetores. Ao final exiba um relatório apontando o nome e a profissão de cada uma
			//das 5 pessoas cadastradas.
			
			String nome[] = new String[5];
			String profissao[] = new String[5];
			
			for (int i = 0 ; i < 5 ; i ++) {
				nome[i] = Teclado.lerTexto("NOME:");
				profissao[i] = Teclado.lerTexto("PROFISSÂO:");
			}
			
			for (int i = 0 ; i < 5 ; i ++) {
				System.out.println("NOME: " + nome[i]);
				System.out.println("PROFISSÃO: " + profissao[i]);
				System.out.println("");
			}
			
		}
}
