package Heranca;

public class Preguica extends Animal {
	
private String especie;
	
	public void emitirSom() {
		System.out.println("N�o emite som");
	}
	
	public void comportamentoAnimal () {
		System.out.println("Seu comportamento � de SUBIR EM �RVORES");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
