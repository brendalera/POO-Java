package ar.edu.unahur.po2.Parcial;

public class Motocicleta extends Vehiculo {

	private Pasajero acompaniante;

	public Motocicleta(Chofer chofer, Double kilometrosRecorridos) {
		super(chofer, kilometrosRecorridos);
	}

	@Override
	public Boolean tienePasajeros() {
		return this.acompaniante != null;
	}

	@Override
	public Boolean subirPasajero(Pasajero pasajero) {
		Boolean resultado = false;
		if (!this.tienePasajeros()) {
			this.acompaniante = pasajero;
			resultado = true;
		}
		return resultado;
	}
	

}
