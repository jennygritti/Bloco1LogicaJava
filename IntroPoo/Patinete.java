package IntroPoo;

public class Patinete {
	
	String modelo;
	int vel;
	
	void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	public void velocidade()
	{
		if(this.vel<60)
			System.out.println("Desacelerando");
		else
			System.out.println("Acelerando... VRUM VRUM");
	}

}
