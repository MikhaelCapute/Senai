package controller;

import util.Teclado;

public class Qt08 {
public static void main(String[] args) {
	int cont = 0, soma = 0;
	double media = 0;
	
	for (int i = 1; i <= 20; i ++) {
		int n = Teclado.lerInt("Digite um número:");
		cont ++ ;
		soma += n;
	}
	media = soma / cont;
	System.out.println("Média:" + media);
}
}
