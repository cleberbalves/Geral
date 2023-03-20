public class Programa {
	
	public static void main(String[] args) {
		
		Jipe jipe = new Jipe ();
		
		//Double capacidadeTanqueJipe = jipe.getCapacidadeTanqueCombustivel ();
		
		System.out.println("Capacidade do tanque do Jipe = " + jipe.getCapacidadeTanqueCombustivel());
		
		jipe.setCapacidadeTanqueCombustivel(48.0);
		
		System.out.println("Capacidade do tanque do Jipe = " + jipe.getCapacidadeTanqueCombustivel());
	
	jipe.buzinar();
	
	}
	
}