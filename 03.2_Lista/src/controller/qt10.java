package controller;

import util.Teclado;

public class qt10 {
public static void main(String[] args) {
	double eleitores, votos_brancos, votos_nulos, votos_validos, perB, perV, perN;
	
	eleitores = Teclado.lerDouble("Digite quantos eleitores do município: ");
	votos_brancos = Teclado.lerDouble("Digite os votos em brancos: ");
	votos_nulos = Teclado.lerDouble("Digite os votos nulos: ");
	votos_validos = votos_nulos - votos_brancos;
	
	perB = (votos_brancos / eleitores) * 100;
	perN = (votos_nulos / eleitores) * 100;
	perV = (votos_validos / eleitores) * 100;
	
	System.out.println("Percentual dos votos em branco: " + perB);
	System.out.println("Percentual dos votos nulos: " + perN);
	System.out.println("Percentual dos votos válidos: " + perV);
	
}
}
