package controller;

import util.Teclado;

public class qt07 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número: ");
	if (n1 < 0) {
		System.out.println("Transfomando o seu número do negativo para o positivo: " + n1 * -1);
	} else {
		System.out.println("O número digitado foi: " + n1);
	}
}
}
