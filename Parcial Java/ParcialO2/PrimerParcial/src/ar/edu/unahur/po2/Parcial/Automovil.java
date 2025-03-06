package ar.edu.unahur.po2.Parcial;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {

	private List<Pasajero> pasajeros = new ArrayList<Pasajero>();
	
	public Automovil(Chofer chofer, Double kilometrosRecorridos) {
		super(chofer, kilometrosRecorridos);
	}

	@Override
	public Boolean tienePasajeros() {
		return !pasajeros.isEmpty();
	}

	@Override
	public Boolean subirPasajero(Pasajero pasajero) {
		Boolean resultado = false;
		if (this.pasajeros.size() < 3) {
			this.pasajeros.add(pasajero);
			resultado = true;
		}
		return resultado;
	}
}
