package qualidade_software_t1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersonTest {

	private List<Person> getPessoas() {
        // Aqui você pode criar a lista de pessoas para testar
        List<Person> pessoas = new ArrayList<Person>();
        pessoas.add(new Person("alfredo",20,'M',"cruzaltense",170,66));
        pessoas.add(new Person("ramon",21,'M',"esteiense",171,66));
        pessoas.add(new Person("pedro",19,'M',"santamariense",190,122));
        pessoas.add(new Person("mauro",21,'M',"santamariense",180,60));
        pessoas.add(new Person("Pikachu",23,'P',"Kantense",40, 6));
        return pessoas;
    }

	
	
	@Test
	@Tag("idade")
	void testIdade(Person obj, int idade) {
		assertEquals(idade, obj.getIdade());
	}
	
	@Test
	@Tag("idade")
	void testa_intervalo(Person obj, int idade_max, int idade_min) {
		assertTrue(obj.getIdade() < idade_max && obj.getIdade() >idade_min ); 
	}
	
	@Test
	@Tag("validade")
	void testa_idade() {
		final int Jeanne_Calment = 122; // pessoa mais velha da historia
		List<Person> pessoas = getPessoas(); // Obtém a lista de pessoas
        for (Person pessoa : pessoas) {
        	assertTrue(pessoa.getIdade() >= 0 && pessoa.getIdade()  <= Jeanne_Calment);
        }
	}
	
	@Test
	@Tag("validade")
	void testa_sexo() {
		List<Person> pessoas = getPessoas(); // Obtém a lista de pessoas
        for (Person pessoa : pessoas) {
        	assertTrue(pessoa.getSexo() == 'M' || pessoa.getSexo() == 'F', "sexo invalido na pessoa de nome "+pessoa.getNome());
        }
	}
	@Test
	@Tag("validade")
	void testa_peso() {
		final int John_Brower = 635; // pessoa mais pesada da historia
		List<Person> pessoas = getPessoas(); // Obtém a lista de pessoas
        for (Person pessoa : pessoas) {
        	assertTrue(pessoa.getPeso() > 0 && pessoa.getPeso() <= John_Brower);
        }
	}
	@Test
	@Tag("validade")
	void testa_altura() {
		final int Robert_Wadlow = 272; // pessoa mais alta da historia
		List<Person> pessoas = getPessoas(); // Obtém a lista de pessoas
        for (Person pessoa : pessoas) {
        	assertTrue(pessoa.getAltura() > 0 && pessoa.getAltura() <= Robert_Wadlow);
        }
	}
	

	
}
