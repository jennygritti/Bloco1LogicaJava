package Heranca;

public class Cavalo extends Animal {
	
private String cor;
	
	public void emitirSom() {
		System.out.println("Relinche");
	}
	
	public void comportamentoAnimal () {
		System.out.println("Seu comportamento é de CORRER");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
