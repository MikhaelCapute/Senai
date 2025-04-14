package controller;

import util.Teclado;

public class Qt10 {
public static void main(String[] args) {
	
	String nome;
	double n1, n2, m, mt, soma = 0;
	
	
	for (int i = 1; i <= 15; i++) {
		nome = Teclado.lerTexto("Digite o nome do aluno:");
		n1 = Teclado.lerInt("Digite a 1° nota do aluno: ");
		n2 = Teclado.lerInt("Digite a 2° nota do aluno: ");
		m = (n1 + n2) / 2;
		soma += m;
	if (m >= 5) {
		System.out.println("Aluno: " + nome);
		System.out.println("1° Nota: " + n1);
		System.out.println("2° Nota: " + n2);
		System.out.println("Média: " + m);
		System.out.println("APROVADO");
	} else {
		System.out.println("Aluno: " + nome);
		System.out.println("1° Nota: " + n1);
		System.out.println("2° Nota: " + n2);
		System.out.println("Média: " + m);
		System.out.println("REPROVADO");
	}
	}
	mt = soma / 15;
	System.out.println("Média turma: " + mt);
}
}
