package br.com.generation.atividadesheran�a;

public class Cachorro extends Animal {

	int correr1 = 0;

	void correr1() {
		
		correr1 += 1;
		System.out.println("Ele est� correndo" + correr1 + "km" );

	}

	void somAnimal() {
		System.out.println("Latido au au au");
	}

}
