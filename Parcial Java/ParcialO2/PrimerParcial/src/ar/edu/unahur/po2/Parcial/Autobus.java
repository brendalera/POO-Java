package ar.edu.unahur.po2.Parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Autobus extends Vehiculo {

	private List<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private Integer asientos = 20;

	public Autobus(Chofer chofer, Double kilometrosRecorridos) {
		super(chofer, kilometrosRecorridos);
	}
	
	@Override
	public Boolean subirPasajero(Pasajero pasajero) {
		Boolean resultado = false;
		if (this.pasajeros.size() < asientos) {
			this.pasajeros.add(pasajero);
			Collections.sort(pasajeros, Comparator.comparingInt(Pasajero::getEdad).reversed());
			resultado = true;
		}
		return resultado;
	}
	
	@Override
	public Boolean tienePasajeros() {
		return !this.pasajeros.isEmpty();
	}
	

}
