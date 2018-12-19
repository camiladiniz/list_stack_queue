package queue;
/**
 * Classe com os atributos, getters & setters, construtor e método toString do cliente que frequentará a classe fila do caixa.
 * @author Camila Diniz
 *
 */
public class Cliente {

	private String nome;
	
	public Cliente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
	
	
	
}
