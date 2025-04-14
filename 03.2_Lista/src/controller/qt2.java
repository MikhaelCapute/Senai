package controller;

import util.Teclado;

public class qt2 {
public static void main(String[] args) {
	int hora, min, minV;
	
	hora = Teclado.lerInt("Digite a hora atual: ");
	min = Teclado.lerInt("Digite o minuto atual: ");
	minV = hora * 60 + min;
	
	System.out.println("Passaram-se " + minV + " minutos Desde a meia noite.");
		
}
}
