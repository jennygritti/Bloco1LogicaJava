package IntroPoo;

public class PatineteTeste {
	public static void main(String[]args) {
		Patinete a1 = new Patinete ();
		Patinete a2 = new Patinete ();
		
		a1.modelo="12xpt";
		a1.vel=60;
		a1.acelerar(10);
		System.out.println("Modelo " + a1.modelo + "em movimento");
		a1.velocidade();
		
		System.out.println("------------------------");
		a2.modelo="Subimarine";
		a2.vel=40;
		System.out.println("Modelo " + a2.modelo + "em movimento");
		a2.velocidade();
		
	}

}
