package controller;

import util.Teclado;

public class Qt04 {
	public static void main(String[] args) {
		
		//Desenvolver um programa que pergunte ao usuário os valores para preencher 2 vetores a e b com 20 números
		//cada, construa um vetor c, em que cada elemento de c é a subtração do elemento correspondente de a com b.
		//Apresentar ao final os vetores a, b e c.
		
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [5];
		
		for (int i = 0 ; i < 5 ; i ++ ) {
			a[i] = Teclado.lerInt("Digite um número A:");
		}
		for (int i = 0 ; i < 5 ; i ++) {
			b[i] = Teclado.lerInt("Digite um número B:");
		}
		for (int i = 0 ; i < 5 ; i ++) {
			c[i] = a[i] - b[i];
		}
		
		System.out.println("EXIBINDO A");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println("EXIBINDO B");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(b[i]);
		}
		
		System.out.println("EXIBINDO C");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(c[i]);
		}
		
	}
}
