package IntroPoo;

public class Aviao {
	
	String companhia;
	int vel;
	
	void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	public void decolagem()
	{
		if(this.vel<120)
			System.out.println("O avião está pousando");
		else
			System.out.println("O avião está decolando");
	}
	
}
