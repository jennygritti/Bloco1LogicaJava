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
			System.out.println("O avi�o est� pousando");
		else
			System.out.println("O avi�o est� decolando");
	}
	
}
