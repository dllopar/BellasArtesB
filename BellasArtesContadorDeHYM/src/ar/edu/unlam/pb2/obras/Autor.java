package ar.edu.unlam.pb2.obras;

public class Autor {

	private String nombre;
	private String genero;

	public Autor(String nombre, String genero) {
		
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
