import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class pruebaLibroTest {

	@Test
	@DisplayName(value = "titulo = botanica  isbn =84-486-0609-4= true")
	void testCheckISBN13() {
		libro l = new libro("Botanica", "8448606097", "Jesus Izco", "McGrawHill");
		assertTrue(l.checkISBN10());

	}

	@Test
	@DisplayName(value = "Creamos un libro valido")
	public void testCrearLibro() throws Exception {
		libro libro = new libro("El nombre del viento", "9788499082479", "Patrick Rothfus", "DEBOLSILLO");
		assertTrue(libro.checkISBN13());
	}
}
