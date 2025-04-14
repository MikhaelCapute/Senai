package controller;

import util.Teclado;

public class qt12 {
public static void main(String[] args) {
	int n1, n2, n3, n4, n5;
	
	n1 = Teclado.lerInt("Digite o 1° número: ");
	n2 = Teclado.lerInt("Digite o 2° número: ");
	n3 = Teclado.lerInt("Digite o 3° número: ");
	n4 = Teclado.lerInt("Digite o 4° número: ");
	n5 = Teclado.lerInt("Digite o 5° número: ");
	
	if ((n1 > n2) && (n1 > n3) && (n1>n4) && (n1 > n5)) {
		System.out.println("O MAIOR número é o: " + n1);
	} else {
		System.out.println("O MENOR número é o: " + n1);
	}
	if ((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5)) {
		System.out.println("O MAIOR número é o: " + n2);
	}	
	if ((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5)) {
		System.out.println("O MENOR número é o: " + n2);
		
	}
	if ((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5)) {
		System.out.println("O MAIOR número é o: " + n3);
	} 
	if ((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5)) {
		System.out.println("O MENOR número é o: " + n3);
	}
	if ((n4 > n1) && (n4 > n2) && (n4 > n3) && (n4 > n5)) {
		System.out.println("O MAIOR número é o: " + n4);
	} 
	if ((n4 < n1) && (n4 < n2) && (n4 < n3) && (n4 < n5)) {
		System.out.println("O MENOR número é o: " + n4);
	}
	if ((n5 > n1) && (n5 > n2) && (n5 > n3) && (n5 > n4)) {
		System.out.println("O MAIOR número é o: " + n5);
	} 
	if ((n5 < n1) && (n5 < n2) && (n5 < n3) && (n5 < n4)) {
		System.out.println("O MENOR número é o: " + n5);
	}
}
}
