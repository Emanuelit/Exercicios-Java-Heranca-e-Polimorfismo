package br.com.generation.atividadesheran�a;

public class TesteAnimais {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro();
		Pregui�a p1 = new Pregui�a();
		Cavalo cv = new Cavalo();

		c1.setNome("Dog");
		c1.setIdade(2);
		c1.setSom("Latido");

		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Som: " + c1.getSom());
		c1.correr1();
		c1.somAnimal();
		System.out.println();

		p1.setNome("Bicho Pregui�a");
		p1.setIdade(20);
		p1.setSom("Som da Pregui�a");
		p1.setSubirEmArvores("Ele est� subindo na �rvore");

		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Som: " + p1.getSom());
		System.out.println("Correndo: " + p1.getSubirEmArvores());
		System.out.println();

		cv.setNome("P� de pano");
		cv.setIdade(6);
		cv.setSom("Relinchar");
		cv.correndo();
		cv.emitindoSom();
		System.out.println();

		System.out.println("Nome: " + cv.getNome());
		System.out.println("Idade: " + cv.getIdade());
		System.out.println("Som: " + cv.getSom());
		

	}

}
