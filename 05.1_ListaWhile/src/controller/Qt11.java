package controller;

import util.Teclado;

public class Qt11 {
public static void main(String[] args) {
	int b = Teclado.lerInt("Digite a base:");
	int e = Teclado.lerInt("Digite o expoente da base:");
	int i = 0, r = 1;
	
	while (i < e) {
		i ++ ;
		r *= b;
		System.out.println(r);
	}
}
}
