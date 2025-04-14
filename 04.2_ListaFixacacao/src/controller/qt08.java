package controller;

import util.Teclado;

public class qt08 {
public static void main(String[] args) {
	int num;
	
	num = Teclado.lerInt("Digite um valor: ");
	
	if (num < 1000) {
		System.out.println("O número digitado é MENOR que 1000.");
	}
	if ((num >= 1000) && (num < 5000)) {
		System.out.println("O número digitado está ENTRE 1000 á 5000.");
	}
	if ((num >= 5000) && (num <= 8000)) {
		System.out.println("O número digitado está ENTRE 5000 á 8000.");
	}
	if (num > 8000 ) {
		System.out.println("O número digitado é MAIOR que 8000.");
	}
	
}
}
