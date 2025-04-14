package controller;

import util.Teclado;

public class Ex09 {
	public static void main(String[] args) {
		String nome[] = new String[3];
		boolean conf = false;
		String opc;
		
		for (int i = 0 ; i < 3 ; i ++) {
			nome[i] = Teclado.lerTexto("Digite um nome:");
		}
		
		opc = Teclado.lerTexto("Deseja fazer uma pesquisa pelos nomes disponíveis? [S/N] ");
		
		while (opc.equals("s")) {
			
			String pesquise = Teclado.lerTexto("Pesquise por um nome:");
			for (int i = 0 ; i < 3 ; i ++) {
				if (pesquise.equals(nome[i])) {
				conf = true;
				}
			
			}
			if (conf == true) {
				System.out.println("O nome " + pesquise + " ESTÁ no nosso banco de dados");
			} else {
				System.out.println("O nome " + pesquise + " NÃO ESTÁ no nosso banco de dados");
			}
			conf = false;
			opc = Teclado.lerTexto("Deseja continuar a pesquisa? [S/N]"); 

		}
		System.out.println("ACABOU!");
	}
}
