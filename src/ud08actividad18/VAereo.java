package ud08actividad18;

public class VAereo extends Vehiculo {
	private final int asientos;

	public VAereo (String matricula, String modelo, int asientos) {
		super(validarMatricula(matricula), modelo);
		this.asientos = asientos;
	}
	
	private static String validarMatricula (String matricula) {
		String regex = "[a-zA-Z]{4}\\d{6}";

		if (!matricula.matches(regex) ) {
			throw new IllegalArgumentException("La matrícula no se adapta al formato de los vehículos aéreos");
		}
		
		return matricula;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Asientos: " + this.asientos);
	}
}
	