package controller;

import util.Teclado;

public class qt11 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número com 3 casas: ");
	if ((n1 > 99) && (n1 <= 999)) {
		System.out.println("A centena de " + n1 + " é : " + (n1/100));
	}
}
}
