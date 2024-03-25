package ud08actividad18;

public class VTerrestre extends Vehiculo {
	private final int numRuedas;

	
	public VTerrestre(String matricula, String modelo, int numRuedas) {
		super (validarMatricula(matricula),modelo);
		this.numRuedas=numRuedas;
	}
	
	private static String validarMatricula (String matricula) {
		String regex = "\\d{4}[a-zA-Z]{3}";

		if (!matricula.matches(regex) ) {
			throw new IllegalArgumentException("La matrícula no se adapta al formato de los vehículos terrestres");
		}
		
		return matricula;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Número de ruedas:" + this.numRuedas);
	}
	
	
	
}
