package controller;

import util.Teclado;

public class Ex13 {
	public static void main(String[] args) {
		String nome[] = new String[3];
		String prof[] = new String[3];
		double sal[] = new double[3];
		
		for (int i = 0 ; i < 3 ; i ++) {
			nome[i] = Teclado.lerTexto("NOME:");
			prof[i] = Teclado.lerTexto("PROFISSÃO:");
			sal[i] = Teclado.lerDouble("SALÁRIO:");
		}
		
		for (int i = 0 ; i < 3 ; i ++) {
			System.out.println("NOME: " + nome[i]);
			System.out.println("PROFISSÃO: " + prof[i]);
			System.out.println("SALÁRIO:" + sal[i]);
			System.out.println("SALÁRIO REAJUSTADO: " + (sal[i] * 1.08));
			System.out.println("");
		}
	}
}
