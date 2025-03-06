package ar.edu.unahur.po2.Parcial;

public abstract class Vehiculo {

	protected Persona chofer;
	protected Double kilometrosRecorridos;

	public Vehiculo(Chofer chofer, Double kilometrosRecorridos) {
		this.chofer = chofer;
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	public Double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(Double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public Persona getChofer() {
		return chofer;
	}

	public void choferAsignado(Chofer chofer) {
		if (!this.tienePasajeros()) {
			this.chofer = chofer;
		}
	}
	
	public abstract Boolean tienePasajeros();

	public abstract Boolean subirPasajero(Pasajero pasajero);

}
