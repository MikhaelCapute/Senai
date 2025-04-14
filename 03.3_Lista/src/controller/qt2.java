package controller;

import util.Teclado;

public class qt2 {
public static void main(String[] args) {
	double salario, salarioLiq, valorH, horat, inss;
	
	valorH = Teclado.lerDouble("Digite o Valor de cada hora trabalhada:R$ ");
	horat = Teclado.lerDouble("Digite o número de horas trabalhadas no mes: ");
	inss = Teclado.lerDouble("Digite o percentual do INSS: ");
	
	salario = valorH * horat;
	salarioLiq = salario - (salario*inss/100);
	
	System.out.println("O salário liquuido do professor é:R$ " + salarioLiq);
	
}
}
