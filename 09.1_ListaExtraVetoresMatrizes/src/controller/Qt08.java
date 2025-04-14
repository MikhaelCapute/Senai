package controller;

public class Qt08 {
	public static void main(String[] args) {
		
		//Desenvolver um programa que gere um vetor vazio com 8 posições, preencha-o através de uma rotina de
		//repetição (laço) com os valores abaixo e exiba-o:
		//15 16 17 18 19 20 21 22
		
		
		int a[] = new int [8];
		
		for (int i = 0 ; i < 8 ; i ++) {
			a[i] = 15 + i;
			System.out.println(a[i]);
		}
	}
}
