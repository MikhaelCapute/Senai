package controller;

import util.Teclado;

public class qt04 {
public static void main(String[] args) {
	double valor, calc;
	int desconto;
	
	valor = Teclado.lerDouble("Digite o valor do produto:R$ ");
	desconto = Teclado.lerInt("Digite a porcentagem do desconto: ");
	calc = valor - (valor*desconto/100);
	
	System.out.println("O produto com desconto:R$ " + calc);
}
}
