package controller;

import util.Teclado;

public class qt01 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número: ");
	if (n1>20) {
		System.out.println("Como voce digitou um número maior que 20 vamos mostrar a metade desse número: " + (n1 / 2));
	}else {
		System.out.println("Como voce digitou um número menor que 20 vamos mostrar ele mesmo: " + n1);
	}
	
	
	
}
}
