package controller;

import util.Teclado;

public class Qt04 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número: ");
	int i = 0;
	
	do {
		System.out.println(n + " X " + i + " = " + n*i);
	i ++ ;
	} while (i <= 10);
}
}
