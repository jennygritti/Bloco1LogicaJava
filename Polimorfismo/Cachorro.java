package Polimorfismo;

public class Cachorro extends Mamifero {
	
	private String raca;

	@Override
	public void emitirSom()
	{
		System.out.println("Auau");
	}
	
	@Override
	public void comportamentoAnimal () {
		System.out.println("Correr");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
