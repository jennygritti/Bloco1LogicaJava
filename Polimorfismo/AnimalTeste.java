package Polimorfismo;

public class AnimalTeste {
	
	public static void main(String[] args) {
		Mamifero m1 = new Mamifero();
		Mamifero m2 = new Mamifero();
		Mamifero m3 = new Mamifero();
		Cachorro c1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica p1= new Preguica();
		
		m1.setNome("Tobias");
		m1.setIdade(5);
		System.out.println("Nome do Cachorro: " + m1.getNome()
							+ "\nIdade: " + m1.getIdade());
		c1.comportamentoAnimal();
		c1.emitirSom();
		
		System.out.println("--------------------------------");
		
		m2.setNome("Pocotó");
		m2.setIdade(12);
		System.out.println("Nome do Cavalo: " + m2.getNome()
							+ "\nIdade: " + m2.getIdade());
		cav1.comportamentoAnimal();
		cav1.emitirSom();
		
		System.out.println("--------------------------------");
		
		m3.setNome("Charles");
		m3.setIdade(16);
		System.out.println("Nome da Preguiça: " + m3.getNome()
							+ "\nIdade: " + m3.getIdade());
		p1.comportamentoAnimal();
		p1.emitirSom();
		
		
	}

}
