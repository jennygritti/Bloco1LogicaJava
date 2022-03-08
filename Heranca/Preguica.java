package Heranca;

public class Preguica extends Animal {
	
private String especie;
	
	public void emitirSom() {
		System.out.println("Não emite som");
	}
	
	public void comportamentoAnimal () {
		System.out.println("Seu comportamento é de SUBIR EM ÁRVORES");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
