package Polimorfismo;

public class Cavalo extends Mamifero {
	
	private String cor;
	
	
	@Override
	public void emitirSom()
	{
		System.out.println("Relinche");
	}
	
	@Override
	public void comportamentoAnimal () {
		System.out.println("Correr");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
