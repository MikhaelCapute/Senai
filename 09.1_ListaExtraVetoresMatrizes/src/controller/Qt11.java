package controller;

public class Qt11 {
	public static void main(String[] args) {
		
		//Desenvolver um programa que gere um vetor vazio com 8 posições, preencha-o através de uma rotina de
		//repetição (laço) com os valores abaixo e exiba-o:
		//2 4 8 16 32 64 128 256
		
			int a[] = new int [8];
			int calc = 1;
			
			for (int i = 0 ; i < 8 ; i ++) { 
				calc *= 2;
				a[i] = calc;
				System.out.println(a[i]);
			}
			
		
		
	}
}
