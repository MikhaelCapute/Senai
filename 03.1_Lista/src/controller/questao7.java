package controller;

import util.Teclado;

public class questao7 {
public static void main(String[] args) {
	double n1, n2, n3, m;
	
	n1 = Teclado.lerDouble("Digite a primeira nota: ");
	n2 = Teclado.lerDouble("Digite a segunda nota: ");
	n3 = Teclado.lerDouble("Digite a terceira nota: ");
	m = (n1 + n2 + n3) / 3;
	
	System.out.println("A média do aluno é: " + m);
	
}
}
