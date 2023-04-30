package qualidade_software_t1;


public class Person {
	int idade;
	String nome;
	char sexo;
	String nacionalidade;
	int altura; //cm
	int peso;	// arredondado
	
	public Person(String nome, int idade, char sexo, String nacionalidade, int altura, int peso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	public int getAltura() {
		return this.altura;
	}
	public int getPeso() {
		return this.peso;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

