package controller;

import util.Teclado;

public class qt05 {
public static void main(String[] args) {
	double n1, n2, n3, n4, media;
	
	n1 = Teclado.lerDouble("Digite a 1° nota: ");
	n2 = Teclado.lerDouble("Digite a 2° nota: ");
	n3 = Teclado.lerDouble("Digite a 3° nota: ");
	n4 = Teclado.lerDouble("Digite a 4° nota: ");
	media = (n1 + n2 + n3 + n4) / 4;
	
	if (media >= 5 ) {
		System.out.println("Aluno APROVADO");
		System.out.println("Média: " + media);
	} else {
		System.out.println("Aluno REPROVADO");
		System.out.println("Média: " + media);
	}
}
}
