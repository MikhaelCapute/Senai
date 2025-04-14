package controller;

import util.Teclado;

public class qt06 {
public static void main(String[] args) {
	int num;
	
	num = Teclado.lerInt("Digite um valor: ");
	
	if (num > 1000) {
		System.out.println("O número digitado é MAIOR que 1000");
	}else {
		System.out.println("O número digitado é MENOR que 1000");
	}
}
}
