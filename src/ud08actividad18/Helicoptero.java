package ud08actividad18;

public class Helicoptero extends VAereo {
	private int helices;

	public Helicoptero(String matricula, String modelo, int asientos, int helices) {
		super(matricula, modelo, asientos);
		this.helices = helices;
	}
	
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Hélices: "+ this.helices);
	}
}
