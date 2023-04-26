package qualidade_software_t1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person obj1 = new Person("alfred",20);
	
	@Test
	@Tag("idade")
	void testIdade() {
		assertEquals(20, obj1.getIdade());
	}
	
	@Test
	@Tag("nome")
	void testNome() {
		assertEquals("alfredo", obj1.getNome());
	}
}
