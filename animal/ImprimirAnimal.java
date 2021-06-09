package exercicios.herança.animal;

public class ImprimirAnimal {

	public static void main(String[] args) {

		TestaAnimal t1 = new TestaAnimal();
		
		t1.somAnimal(new Cachorro());
		t1.correr(new Cavalo());
		t1.subir(new Preguiça());
		
	}

}
