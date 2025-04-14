package controller;

import util.Teclado;

public class questao8 {
public static void main(String[] args) {
	double km, kml, total;
	
	km = Teclado.lerDouble("Digite o a distancia da viagem em Km: ");
	kml = Teclado.lerDouble("Digite o consumo médio do veículo em Kml: ");
	total = km / kml;
	
	System.out.println("O veículo consumirá total de " + total + " Litros nessa viagem.");
	
}
}
