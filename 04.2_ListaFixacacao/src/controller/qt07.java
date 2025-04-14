package controller;

import util.Teclado;

public class qt07 {
public static void main(String[] args) {
	int num;
	
	num = Teclado.lerInt("Digite um valor: ");
	
	if (num < 1000) {
		
		System.out.println("O número digitado é MENOR que 1000.");
	}
	if ((num >= 1000) && (num <= 5000)) {
		System.out.println("O número digitado está entre 1000 a 5000.");
	}
	if (num > 5000) {
		System.out.println("O número digitado é MAIOR que 5000");
	}
	
	
}	
}
