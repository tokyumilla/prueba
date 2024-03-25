package ud08actividad18;

public class Barco extends VAcuatico {
	private boolean motor;

	public Barco(String matricula, String modelo, int eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.motor = motor;
	}
	
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Motor:" + (this.motor?"Sí":"No"));;
	}
}
