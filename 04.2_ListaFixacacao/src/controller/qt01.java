package controller;

import util.Teclado;

public class qt01 {
public static void main(String[] args) {
	double num, dem, calc;
	
	num = Teclado.lerDouble("Digite o númerador da fração: ");
	dem = Teclado.lerDouble("Digite o denominador da fração: ");
	calc = num / dem;
	
	System.out.println("O resultado da fração é: " + calc);
}
}
