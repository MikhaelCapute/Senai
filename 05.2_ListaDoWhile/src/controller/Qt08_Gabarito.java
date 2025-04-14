package controller;

import util.Teclado;

public class Qt08_Gabarito {
	public static void main(String[] args) {

		int i = 1;
		int b = Teclado.lerInt("Digite a base");
		int e = Teclado.lerInt("Digite o expoente");
		int r = b;
		if (e != 0) {
			do {
				r *= b;
				i++;
			} while (i < e);
		} else {
			r = 1;
		}
		System.out.println(b+" elevado a " + e + " = " + r);
	}
}
