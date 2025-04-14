package controller;

import util.Teclado;

public class qt15 {
public static void main(String[] args) {
	double n1, n2, media;
	
	n1 = Teclado.lerDouble("Digite a 1° nota do aluno: ");
	n2 = Teclado.lerDouble("Digite a 2° nota do aluno: ");
	
	media = (n1 + n2) / 2;
	
	if (media < 3) {
		System.out.println("O aluno está REPROVADO.");
		System.out.println("MEDIA: " + media);
	}
	if ((media > 3) && (media <= 6.9)) {
		System.out.println("O aluno será direcionado a PROVA FINAL.");
		System.out.println("MEDIA: " + media);
	}
	if (media > 7.0) {
		System.out.println("O aluno foi APROVADO.");
		System.out.println("MEDIA: " + media);
	}
}
}
