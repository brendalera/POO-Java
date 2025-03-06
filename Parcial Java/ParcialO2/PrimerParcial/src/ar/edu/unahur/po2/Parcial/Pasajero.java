package ar.edu.unahur.po2.Parcial;

public class Pasajero implements Persona {

	private Integer edad;
	private String nombre;

	public Pasajero(Integer edad, String nombre) {
		this.setEdad(edad);
		this.setNombre(nombre);
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
