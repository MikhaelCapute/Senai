package controller;

import util.Teclado;

public class Qt09 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número:");
	int cont = 0;
	
	if (n > 0) {
		while (n > 0) {
			cont ++ ;
			n = Teclado.lerInt("Digite um número:");
		}
	}
	System.out.println("Foram digitados " + cont + " números positivos");
	
	
}
}
