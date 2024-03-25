package ud08actividad18;

public class Submarino extends VAcuatico{
	private int maxProfundidad;

	public Submarino(String matricula, String modelo, int eslora, int maxProfundidad) {
		super(matricula, modelo, eslora);
		this.maxProfundidad = maxProfundidad;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Profundidad máxima: "+ this.maxProfundidad);
	}
}
