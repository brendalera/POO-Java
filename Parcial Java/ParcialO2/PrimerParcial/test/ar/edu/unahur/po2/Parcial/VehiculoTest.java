package ar.edu.unahur.po2.Parcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiculoTest {

	@Test
	public void queSePuedaCrearUnVehiculo() {
		Integer edad = 44;
		String nombre = "Juan";
		Chofer chofer = new Chofer(edad, nombre);
		Double kilometrosRecorridos = 13.6;
		Vehiculo motocicleta = new Motocicleta(chofer, kilometrosRecorridos);
		assertNotNull(chofer);
		assertNotNull(motocicleta);
	}

	@Test
	public void queSePuedaCambiarElChoferDeUnVehiculo() {
		Chofer chofer = new Chofer(44, "Juan");
		Double kilometrosRecorridos = 13.6;
		Vehiculo autoBus = new Autobus(chofer, kilometrosRecorridos);
		Chofer chofer2 = new Chofer(33, "Enzo");
		autoBus.choferAsignado(chofer2);
		assertEquals(chofer2, autoBus.getChofer());
	}
	
	@Test
	public void queSePuedaAgregarUnAcompañante() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo motocicleta = new Motocicleta(chofer, 14.8);
		Pasajero p = new Pasajero(33,"Maria");
		motocicleta.subirPasajero(p);
		assertTrue(motocicleta.tienePasajeros());
	}
	
	@Test
	public void queSePuedaAgregarVariosPasajeros() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo autoBus = new Autobus(chofer, 12.0);
		Pasajero p1 = new Pasajero(33,"Maria");
		Pasajero p2 = new Pasajero(15, "Martin");
		Pasajero p3 = new Pasajero(29, "Azul");
		autoBus.subirPasajero(p1);
		autoBus.subirPasajero(p2);
		assertTrue(autoBus.subirPasajero(p3));
	}
	
	@Test
	public void queNoSePuedaCambiarElChoferDeUnAutoBus() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo autoBus = new Autobus(chofer, 12.0);
		Pasajero p1 = new Pasajero(33,"Maria");
		Pasajero p2 = new Pasajero(15, "Martin");
		autoBus.subirPasajero(p1);
		autoBus.subirPasajero(p2);
		Chofer chofer2 = new Chofer(33, "Enzo");
		autoBus.choferAsignado(chofer2);
		assertEquals(chofer, autoBus.getChofer());
	}
	
	@Test
	public void queNoSePuedaCambiarElChoferDeUnaMotocicleta() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo motocicleta = new Motocicleta(chofer, 14.8);
		Pasajero p1 = new Pasajero(33,"Maria");
		motocicleta.subirPasajero(p1);
		Chofer chofer2 = new Chofer(33, "Enzo");
		motocicleta.choferAsignado(chofer2);
		assertEquals(chofer, motocicleta.getChofer());
	}
	
	@Test
	public void queNoSePuedaSubirMasPasajerosEnUnAutomovil() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo automovil = new Automovil(chofer, 14.8);
		Pasajero p1 = new Pasajero(33,"Maria");
		Pasajero p2 = new Pasajero(15, "Martin");
		Pasajero p3 = new Pasajero(29, "Azul");
		Pasajero p4 = new Pasajero(12, "Teo");
		automovil.subirPasajero(p1);
		automovil.subirPasajero(p2);
		assertTrue(automovil.subirPasajero(p3));
		assertFalse(automovil.subirPasajero(p4));
	}
	
	@Test
	public void queNoSePuedaSubirMasPasajerosAUnaMotocicleta() {
		Chofer chofer = new Chofer(44, "Juan");
		Vehiculo motocicleta = new Motocicleta(chofer, 14.8);
		Pasajero p1 = new Pasajero(33,"Maria");
		Pasajero p2 = new Pasajero(15, "Martin");
		motocicleta.subirPasajero(p1);
		assertFalse(motocicleta.subirPasajero(p2));
	}
	
	
}
