package controller;

import util.Teclado;

public class qt13 {
public static void main(String[] args) {
	int a, b, c;
	
	a = Teclado.lerInt("Digite um número: ");
	b = Teclado.lerInt("Digite outro número: ");
	c = Teclado.lerInt("Digite outro número: ");
	
	if ((a < b) && (b < c)) {
		System.out.println("Ordem crescente: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} else {
		if ((a < c) && (c < b)){
		System.out.println("Ordem Crescente: ");
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		}
		else {
			if ((b < a) && (a < c)) {
				System.out.println("Ordem crescente: ");
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
				
				} else {
					if ((b < c) && (c < a)) {
						System.out.println("Ordem crescente: ");
						System.out.println(b);
						System.out.println(c);
						System.out.println(a);
					} else {
						if ((c < a) && (a < b)) {
							System.out.println("Ordem crescente: ");
							System.out.println(c);
							System.out.println(a);
							System.out.println(b);
							
						} else {
							if ((c < b) && (b < a)) {
								System.out.println("Ordem crescente: ");
								System.out.println(c);
								System.out.println(b);
								System.out.println(a);
							}
						}
					}	
				}
			}  	
		}
}
}
