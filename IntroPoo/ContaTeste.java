package IntroPoo;

public class ContaTeste {
	public static void main(String[]args) {
		Conta c1 = new Conta("Arnaldo", 12345, 0);
		Conta c2 = new Conta("Sueli", 54321, 2000);
		
		System.out.println("Titular: "+ c1.titular + "\tSaldo em conta: " +c1.saldo);
		c1.devedor();
		
		System.out.println("-------------------");
		
		System.out.println("Titular: "+ c2.titular + "\tSaldo em conta: " +c2.saldo);
		c2.devedor();
		
	}

}
