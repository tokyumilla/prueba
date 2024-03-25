package ud08actividad18;

public class VAcuatico extends Vehiculo {
	private final int eslora;

	public VAcuatico(String matricula, String modelo, int eslora) {
		super(validarMatricula(matricula), modelo);
		this.eslora = eslora;
	}
	
	private static String validarMatricula (String matricula) {
		String regex = "[a-zA-Z]{3,10}";

		if (!matricula.matches(regex) ) {
			throw new IllegalArgumentException("La matrícula no se adapta al formato de los vehículos acuáticos");
		}
		
		return matricula;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Eslora: " + this.eslora);
	}
	
}
