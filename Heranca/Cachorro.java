package Heranca;

public class Cachorro extends Animal {
	
private String raca;
	
	public void emitirSom() {
		System.out.println("AUAU");
	}
	
	public void comportamentoAnimal () {
		System.out.println("Seu comportamento é de CORRER");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
