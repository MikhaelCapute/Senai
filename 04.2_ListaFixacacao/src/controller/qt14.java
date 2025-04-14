package controller;

import util.Teclado;

public class qt14 {
public static void main(String[] args) {
	int idade;
	
	idade = Teclado.lerInt("Digite a sua idade: ");
	
	if (idade > 65) {
		System.out.println("Voce é velho, saia daqui e vá dormir.");
	}
	if (idade < 18) {
		System.out.println("Não é permitido menores de 18 nesse estabelecimento.");
	}
	if ((idade > 18) && (idade < 65)) {
		System.out.println("Permessão concedida, o usuário é maior de 18 anos.");
	}
	
}
}
