package ud08actividad18;

public class Avion extends VAereo {
	private int tiempoVueloMax;

	public Avion(String matricula, String modelo, int asientos, int tiempoVueloMax) {
		super(matricula, modelo, asientos);
		this.tiempoVueloMax = tiempoVueloMax;
	}
	
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tiempo vuelo máximo: "+ this.tiempoVueloMax);
	}
}
