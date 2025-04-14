package controller;

import util.Teclado;

public class Qt03 {
	public static void main(String[] args) {
		int a[] = new int[3];
		int b[] = new int[3];
		
		for (int i = 0 ; i < 3 ; i ++) {
			
			a[i] = Teclado.lerInt("Digite um número:");
			if (a[i] % 2 == 0) {
				b[i] = a[i] * 5;
			} else {
				b[i] = a[i] + 5;
			}
			 
		}
		
		System.out.println("EXIBINDO VETOR A");
		for (int i = 0 ; i < 3 ; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println("");
		System.out.println("EXIBINDO O VETOR B");
		for (int i = 0 ; i < 3 ; i ++) {
			System.out.println(b[i]);
		}
	}
}
