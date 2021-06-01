package ar.edu.unlam.pb2.obras;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private List<ObraDeArte> catalogo;

	public Catalogo() {
		catalogo = new ArrayList<>();
	}

	public Integer ontenerCantidadObras() {

		return catalogo.size();
	}

	public void agregarObra(ObraDeArte obraDeArte) {
		
		if (!this.existeObra(obraDeArte)) {
			catalogo.add(obraDeArte);
		}
		

	}

	public Boolean existeObra(ObraDeArte obraDeArte) {
		Boolean existe = false;
		
		for (ObraDeArte obraDeArte2 : catalogo) {
			if(obraDeArte2.getNombre().equals(obraDeArte.getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

	public Integer ontenerCantidadObrasMujeresArtistas() {
		Integer contadorMujeres = 0;

		for (ObraDeArte obraDeArte : catalogo) {
			if (obraDeArte.getAutor().getGenero().equalsIgnoreCase("Mujer")) {
				contadorMujeres++;
			}
		}
		return contadorMujeres;
	}

	public int ontenerCantidadObrasHombresArtistas() {
		Integer contadorHombres = 0;

		for (ObraDeArte obraDeArte : catalogo) {
			if (obraDeArte.getAutor().getGenero().equalsIgnoreCase("Hombre")) {
				contadorHombres++;
			}
		}
		return contadorHombres;
	}

}
