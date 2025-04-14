package controller;

import util.Teclado;

public class questao5 {
public static void main(String[] args) {
	double salario, aumento;
	
	salario = Teclado.lerDouble("Digite o salário do funcionário:R$");
	aumento = salario + (salario*15/100);
	
	System.out.println("Salário com aumento:R$ " + aumento);
	
}
}
