package controller;

import util.Teclado;

public class Qt06 {
public static void main(String[] args) {
	
	int cont = 0;
	//int idade; 
	
	 for (int i = 1; i <= 10; i ++) {
		 int idade = Teclado.lerInt("Digite sua idade:");
		 if (idade < 18) {
			 cont += 1;
		 }
	 }
	 System.out.println("Tem no total " + cont + " pessoas menores de idade");
	 
}
}
