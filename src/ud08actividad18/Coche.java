package ud08actividad18;

public class Coche extends VTerrestre {
	private boolean aireAc;

	public Coche(String matricula, String modelo, int numRuedas, boolean aireAc) {
		super(matricula, modelo, numRuedas);
		this.aireAc = aireAc;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Aire acondicionado:" + (this.aireAc?"Sí":"No"));;
	}
	

}
