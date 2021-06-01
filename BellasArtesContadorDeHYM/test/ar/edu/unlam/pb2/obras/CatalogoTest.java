package ar.edu.unlam.pb2.obras;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unlam.pb2.obras.Autor;
import ar.edu.unlam.pb2.obras.Catalogo;
import ar.edu.unlam.pb2.obras.ObraDeArte;

public class CatalogoTest {
	private Catalogo catalogo;

	@Before
	public void init() {
		catalogo = new Catalogo();
	}

	@Test
	public void testCrearCatalogoVacio() {
		Assert.assertTrue(0 == catalogo.ontenerCantidadObras());
	}

	@Test
	public void testAgregarObra() throws Exception {
		catalogo.agregarObra(new ObraDeArte("Giotto", new Autor("Miguel Angel",
				"Hombre")));
		Assert.assertTrue(1 == catalogo.ontenerCantidadObras());
	}

	@Test
	public void testExisteObra(){
		catalogo.agregarObra(new ObraDeArte("Giotto", new Autor("Miguel Angel",
				"Hombre")));
		Assert.assertTrue(catalogo.existeObra(new ObraDeArte("Giotto",
				new Autor("Miguel Angel", "Hombre"))));
		
		
	}

	@Test
	public void testObrasMujeresArtistas() {
		catalogo.agregarObra(new ObraDeArte("La Coiffure (El peinado)",
				new Autor("Morisot Berthe Marie Pauline", "Mujer")));
		catalogo.agregarObra(new ObraDeArte("Joven oriental", new Autor(
				"Romani Juana", "Mujer")));
		catalogo.agregarObra(new ObraDeArte("Bañista", new Autor(
				"Forner Raquel", "Mujer")));
		Assert.assertTrue(3 == catalogo.ontenerCantidadObrasMujeresArtistas());
		

	}

	@Test
	public void testHombresArtitas(){
		catalogo.agregarObra(new ObraDeArte("Masaccio", new Autor(
				"Miguel Angel", "Hombre")));
		catalogo.agregarObra(new ObraDeArte("Giotto", new Autor("Miguel Angel",
				"Hombre")));
		catalogo.agregarObra(new ObraDeArte("Hercules", new Autor(
				"Miguel Angel", "Hombre")));
		Assert.assertTrue(3== catalogo.ontenerCantidadObrasHombresArtistas());

	}
}
