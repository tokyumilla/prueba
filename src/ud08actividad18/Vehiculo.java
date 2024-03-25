package ud08actividad18;

public abstract class Vehiculo {
	private String matricula;
	private String modelo;
	


	public Vehiculo(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}
	
	public void imprimir () {
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Modelo: " + this.modelo);
	}
	
	
	
}
