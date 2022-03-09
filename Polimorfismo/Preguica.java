package Polimorfismo;

public class Preguica extends Mamifero {
	
	private String especie;
	

	@Override
	public void emitirSom()
	{
		System.out.println("N�o emite som");
	}
	
	@Override
	public void comportamentoAnimal () {
		System.out.println("Subir �rvore");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
