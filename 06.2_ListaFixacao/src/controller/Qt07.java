package controller;

import util.Teclado;

public class Qt07 {
public static void main(String[] args) {
	int i = 1;
	int n = Teclado.lerInt("Digite um número (positivo):");
	
	if (n >= 0) {
		while (i <= n) {
			System.out.println(i);
			i ++ ;
		}
	} else {
		System.out.println("Número inválido! Número negativo.");
	}
}
}
