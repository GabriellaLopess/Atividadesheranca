package exercicios.herança.animal;

public class TestaAnimal {

	public void somAnimal(Animal animal) {
	animal.somAnimal();
}
	public void correr(Animal animal) {
		animal.correr();
	}
	
	public void subir(Animal animal) {
		animal.subir();
		
	}


public static void main(String[] args) {

	TestaAnimal t1 = new TestaAnimal();
	
	t1.somAnimal(new Cachorro());
	t1.correr(new Cavalo());
	t1.subir(new Preguiça());
	
}

}
