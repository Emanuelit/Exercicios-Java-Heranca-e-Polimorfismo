package br.com.generation.atividadesherança;

public class Cachorro extends Animal {

	int correr1 = 0;

	void correr1() {
		
		correr1 += 1;
		System.out.println("Ele está correndo" + correr1 + "km" );

	}

	void somAnimal() {
		System.out.println("Latido au au au");
	}

}
