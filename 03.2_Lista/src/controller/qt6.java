package controller;

import util.Teclado;

public class qt6 {
public static void main(String[] args) {
	String nome;
	double salario, vendas, comissao, salario_total;
	
	nome = Teclado.lerTexto("Digite o nome do funcionário: ");
	salario = Teclado.lerDouble("Digite o salário do funcionário: ");
	vendas = Teclado.lerDouble("Digite o total de vendas do funcionário:R$ ");
	comissao = vendas * 0.15;
	salario_total = salario + comissao;
	
	System.out.println("Nome do funcionário: " + nome);
	System.out.println("Salário do funcionário:R$ " + salario);
	System.out.println("Comissão do funcionário:R$ " + comissao);
	System.out.println("Salário Completo:R$ " + salario_total);
	
}
}
