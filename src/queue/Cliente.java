package queue;
/**
 * Classe com os atributos, getters & setters, construtor e m�todo toString do cliente que frequentar� a classe fila do caixa.
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
