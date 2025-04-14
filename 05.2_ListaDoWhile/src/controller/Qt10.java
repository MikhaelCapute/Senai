package controller;

import util.Teclado;

public class Qt10 {
public static void main(String[] args) {
	int i = 0; 
	int a = Teclado.lerInt("Digite o 1° termo:");
	int b = Teclado.lerInt("Digite o 2° termo:");
	int temp = 0;
	
	do {
		System.out.println(b + "\t");
		temp = a + b;
		a = b;
		b = temp;
		i ++ ;
	} while (i <= 15);
		
}
}
