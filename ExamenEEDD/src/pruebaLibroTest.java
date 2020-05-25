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
}
