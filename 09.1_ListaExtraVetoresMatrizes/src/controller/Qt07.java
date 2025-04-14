package controller;

import util.Teclado;

public class Qt07 {
	public static void main(String[] args) {
		//A seleção brasileira de futebol da Copa do Mundo FIFA 2014 teve a sua escalação conforme a tabela abaixo. Crie
		//um vetor e armazene esta escalação. Em seguida, enquanto o usuário digitar o número correspondente à camisa
		//de um jogador o nome do jogador deverá aparecer. Quando o usuário digitar um número que não corresponda a
		//um jogador, deverá surgir a informação “Este número não corresponde a um jogador escalado”, e então o
		//programa será encerrado.
		
		String nomes[] = {"Jefferson","Daniel Alves", "Thiago Silva", "David Luiz", "Fernandinho", "Marcelo", "Hulk", "Paulinho", "Fred", "Neymar Jr", "Oscar", "Julio César",
                "Dante", "Maxwell", "Henrique", "Ramires", "Luiz Gustavo",  "Hernanes",  "Willian", "Bernard", "Jô", "Victor", "Maicon"};
		
		int num = Teclado.lerInt("Digite um número:");
		
		if ((num > 0) && (num <= 23)) {
			System.out.println("Domon é o cara");
			System.out.println(nomes[num-1]);
		} else {
			System.out.println("Este número não corresponde a um jogador escalado.");
		}
		
		int domon = Teclado.lerInt("Quantos cm de pica o domon tem?");
		if (domon < 20) {
			System.out.println("IMPOSSÍVEL");
		} else {
			System.out.println("NÃO ESPERAVA MENOS");
		}
	}
}
