package controller;

import util.Teclado;

public class qt02 {
public static void main(String[] args) {
	double salarioM, salarioP, calc;
	
	salarioM = Teclado.lerDouble("Digite o salário minímo atual: ");
	salarioP = Teclado.lerDouble("Digite o seu salário: ");
	calc = salarioP / salarioM;
	
	if (salarioM == salarioP) {
		System.out.println("Voce recebe 1 salário mínimo.");
	} else {
		System.out.println("Voce recebe " + calc + " salário mínimo.");
	}
	
}
}
