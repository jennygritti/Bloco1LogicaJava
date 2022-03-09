package Polimorfismo;

public class Mamifero extends Animal{

	@Override
	public void emitirSom()
	{
		System.out.println("Som do animal");
	}
	
	@Override
	public void comportamentoAnimal () {
		System.out.println("Comportamento do animal");
	}

}
