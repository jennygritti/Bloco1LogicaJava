package IntroPoo;

public class Conta {
	String titular;
	int numero;
	double saldo;
	
	public Conta (String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void devedor()
	{
		if(this.saldo<=0)
			System.out.println("Seu saldo está abaixo de zero");
		else
			System.out.println("Seu saldo está ok");
	}
	

}
