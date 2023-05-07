package qualidade_software_t1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersonTest {

	static private List<Person> getPessoas() {
        // Aqui você pode criar a lista de pessoas para testar
        List<Person> pessoas = new ArrayList<Person>();
        pessoas.add(new Person("alfredo",15,'M',"cruzaltense",170,66));
        pessoas.add(new Person("ramon",21,'M',"esteiense",171,66));
        pessoas.add(new Person("pedro",19,'M',"santamariense",190,122));
        pessoas.add(new Person("mauro",21,'M',"santamariense",180,60));
        pessoas.add(new Person("Pikachu",23,'P',"Kantense",40, 6));
        return pessoas;
    }
	
	
    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("idade")
	void testIsChildren(Person pessoa) 
    {
    	assertTrue(pessoa.getIdade() < 13, pessoa.getNome() + " nao eh crianca");
	}

    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("idade")
	void testIsTeenager(Person pessoa) 
    {
        assertTrue(pessoa.getIdade() > 12 && pessoa.getIdade() < 19, pessoa.getNome() + " nao eh adolescente");
	}
	
    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("idade")
	void testIsAdult(Person pessoa) 
    {
        assertTrue(pessoa.getIdade() > 18 && pessoa.getIdade() < 60, pessoa.getNome() + " nao eh adulto");
	}

    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("idade")
	void testIsElder(Person pessoa) 
    {
        assertTrue(pessoa.getIdade() >= 60, pessoa.getNome() + " nao eh idoso");
	}
	
    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("validade")
	void testValidAge(Person pessoa) 
    {
		final int Jeanne_Calment = 122; // pessoa mais velha da historia
        assertTrue(pessoa.getIdade() >= 0 && pessoa.getIdade()  <= Jeanne_Calment, "idade invalida na pessoa de nome " + pessoa.getNome());
	}
	
    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("validade")
	void testValidSex(Person pessoa) 
    {
        assertTrue(pessoa.getSexo() == 'M' || pessoa.getSexo() == 'F', "sexo invalido na pessoa de nome " + pessoa.getNome());
	}

    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("validade")
	void testValidWeight(Person pessoa) 
    {
		final int John_Brower = 635; // pessoa mais pesada da historia
        assertTrue(pessoa.getPeso() > 0 && pessoa.getPeso() <= John_Brower, "peso invalido na pessoa de nome " + pessoa.getNome());
	}

    @ParameterizedTest
    @MethodSource("getPessoas")
	@Tag("validade")
	void testValidHeight(Person pessoa) 
    {
		final int Robert_Wadlow = 272; // pessoa mais alta da historia
        assertTrue(pessoa.getAltura() > 0 && pessoa.getAltura() <= Robert_Wadlow, "altura invalida na pessoa de nome " + pessoa.getNome());
	}
	

	
}