package list;

/**
 * Classe contém os atributos necessários para o cadastro de clientes.
 * @author Camila Diniz
 *
 */
public class Cliente {

	//Atributos
	private String nome;
	private String endereco;
	private String dataNascimento;
	
	//Construtor
	public Cliente() {
		
	}
	
	//Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + nome + ", Endereco: " + endereco + ", Data de Nascimento: " + dataNascimento + "\n";
	}
	
	
	
}
