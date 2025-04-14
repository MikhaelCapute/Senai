package controller;

import util.Teclado;

public class qt02 {
public static void main(String[] args) {
	double salario_bruto= Teclado.lerDouble("Digite o salário bruto:R$ ");
	double inss, irrf;
	
	if (salario_bruto <= 1320) {
		inss = salario_bruto * 0.075;
		
	} else {
		if ((salario_bruto >= 1320.01) && (salario_bruto <= 2571.29)) {
			inss = salario_bruto * 0.09;
		} else {
			if ((salario_bruto >= 2571.30) &&(salario_bruto <= 3856.94)) {
				inss = salario_bruto * 0.12;
			} else {
				inss = salario_bruto * 0.14;
		}
		}
	}
	if (salario_bruto <= 2112.00) {
		irrf = 0;
		
	} else {
		if ((salario_bruto >= 2112.01) && (salario_bruto <=2826.86)) {
			irrf = ((salario_bruto - inss) * 0.075) - 158.40; 
		} else {
			if ((salario_bruto >= 2826.66) && (salario_bruto <= 3751.05)) {
				irrf = ((salario_bruto - inss) * 0.15) - 370.40;
			} else {
				if ((salario_bruto >= 3571.06) && (salario_bruto <= 4664.68)) {
					irrf = ((salario_bruto - inss) * 0.255) - 651.73;
				} else {
					irrf = ((salario_bruto - inss) * 0.275) - 884.96;
				}
			}
		}
	}
	
	double valeT = Teclado.lerDouble("Insira o gasto do vale transporte: R$");
	
	
	
}
}
