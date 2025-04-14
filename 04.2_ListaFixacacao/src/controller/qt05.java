package controller;

import util.Teclado;

public class qt05 {
public static void main(String[] args) {
	int numero;
	int digito1, digito2, digito3, numeroInvertido;
	
	numero = Teclado.lerInt("Digite um valor com 3 casas: ");
	
	if (numero >= 100 && numero <= 999) {
        digito1 = numero / 100;
        digito2 = (numero / 10) % 10;
        digito3 = numero % 10;

        numeroInvertido = digito3 * 100 + digito2 * 10 + digito1;

        System.out.println("Número invertido: " + numeroInvertido);
    } else {
        System.out.println("Por favor, digite um número de 3 dígitos.");
}
}
}