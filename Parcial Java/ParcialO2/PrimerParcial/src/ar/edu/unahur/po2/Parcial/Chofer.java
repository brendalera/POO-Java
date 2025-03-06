package ar.edu.unahur.po2.Parcial;

public class Chofer implements Persona {

	private String nombre;
	private Integer edad;

	public Chofer(Integer edad, String nombre) {
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
