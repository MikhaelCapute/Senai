package controller;

import util.Teclado;

public class Qt06 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número: ");
	
	if (n <= 50) {
		while (n <= 200) {
			System.out.println(n+" X 3 = "+n*3);
			n = n*3;
		}
	} else {
		System.out.println("Valor maior que 50!");
	}
}
}
