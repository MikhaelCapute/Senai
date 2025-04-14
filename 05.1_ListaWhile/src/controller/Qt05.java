package controller;

import util.Teclado;

public class Qt05 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número: ");
	int i = 1;
	while (i <= 10) {
		System.out.println(n+" X "+i+" = "+n*i);
		i ++ ;
	}
}
}
