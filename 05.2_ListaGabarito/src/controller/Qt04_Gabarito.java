package controller;

import util.Teclado;

public class Qt04_Gabarito {
public static void main(String[] args) {
	
	int n = Teclado.lerInt("Digite um número");
	int i = 1;
	
	do {
		System.out.println(n+ " * " + i + " = " + (n*i));
		i++;
	} while (i <= 10);
}
}
