package controller;

import util.Teclado;

public class Qt10_Gabarito {
public static void main(String[] args) {
	
	int i = 1; 
	int a = Teclado.lerInt("Digite o 1º termo");
	int b = Teclado.lerInt("Digite o 2º termo");
	int temp;
	
	do {
		System.out.print(a + "\t");
		temp = a + b;
		a = b;
		b = temp;
		i++;
	} while (i <= 15);
}
}
