package ud08actividad18;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		Coche coche = new Coche("7489HXY","Ford",4,true);
		Moto moto = new Moto("7111FDS","Vespa",2,"Roja");
		Barco barco = new Barco("LOEA","Agua",20,true);
		Submarino submarino = new Submarino("SOEHAE","Fusion",50,100);
		Avion avion = new Avion ("SECA123456","Harley",5,100);
		Helicoptero helicoptero = new Helicoptero ("ODKS123456","Volador",6,4);
		
		ArrayList<Vehiculo> vehiculos = new ArrayList();
		vehiculos.add(coche);
		vehiculos.add(moto);
		vehiculos.add(barco);
		vehiculos.add(submarino);
		vehiculos.add(avion);
		vehiculos.add(helicoptero);

		for (Vehiculo v : vehiculos) {
			v.imprimir();
		}


	}

}
