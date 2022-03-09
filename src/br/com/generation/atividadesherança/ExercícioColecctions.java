package br.com.generation.atividadesherança;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercícioColecctions {

	public static void main(String[] args) {
		/*
		 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa
		 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
		 * desse estoque, o programa deverá atender as seguintes funcionalidades:
		 * Armazenar dados da List Remover dados da list; Atualizar dados da list.
		 * Apresentar todos os dados da list.
		 * 
		 * String estoque1 = "Playstation4"; String estoque2 = "Xbox Series S"; String
		 * estoque3 = "Xbox Series X"; System.out.println();
		 */
		Scanner leia = new Scanner(System.in);

		String estoque1 = "Playstation 4";

		String estoque2 = "Playstation 5";
		String estoque3 = "Xbox Series S";
		String estoque4 = "Xbox Series X";
		String estoque5 = "Nokia";

		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);

		System.out.println(estoque);

		estoque.add(estoque5);
		System.out.println(estoque);

		estoque.remove(0);
		System.out.println(estoque);

		for (String i : estoque) {
			System.out.println("Temos os celulares: " + i);
		}
		leia.close();
	}
}