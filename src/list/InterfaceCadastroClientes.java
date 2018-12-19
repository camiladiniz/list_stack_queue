package list;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * Classe cadastra, lista, atualiza e deleta clientes interativamente (JOptionPane). 
 * @author Camila Diniz
 *
 */
public class InterfaceCadastroClientes {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente();
		int again;
		String[] opcao = { "Lista dos Clientes", "Cadastrar um cliente", "Alterar um cliente", "Excluir um cliente" };

		do {
			String resp = (String) JOptionPane.showInputDialog(null, "Selecione uma opção: \n", "Opção",
					JOptionPane.PLAIN_MESSAGE, null, opcao, "Lista dos Clientes");

			if (resp == opcao[0]) { //Lista de clientes
				JOptionPane.showMessageDialog(null, clientes, "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
			} else if (resp == opcao[1]) { //Cadastro de clientes
				String clienteNome = JOptionPane.showInputDialog(null, "Qual é o nome do cliente? ", "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
				String clienteEndereco = JOptionPane.showInputDialog(null, "Insira o endereço do cliente ", "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);
				String clienteNasc = JOptionPane.showInputDialog(null, "Digite a data de nascimento do cliente ", "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);

				cliente = new Cliente();
				cliente.setNome(clienteNome);
				cliente.setEndereco(clienteEndereco);
				cliente.setDataNascimento(clienteNasc);
				clientes.add(cliente);

			} else if (resp == opcao[2]) { //Alterar um cliente
				String clienteAlt = JOptionPane.showInputDialog(null, "Qual o índice do cliente que você deseja alterar? ", "Alterar um cliente", JOptionPane.QUESTION_MESSAGE);
				int indice = Integer.parseInt(clienteAlt);
				if(indice >= 0 && indice <clientes.size()) {
					String clienteNome = JOptionPane.showInputDialog(null, "Qual é o novo nome do cliente? ", "Atualizando dados", JOptionPane.QUESTION_MESSAGE);
					String clienteEndereco = JOptionPane.showInputDialog(null, "Insira o novo endereço do cliente ", "Atualizando dados", JOptionPane.QUESTION_MESSAGE);
					String clienteNasc = JOptionPane.showInputDialog(null, "Digite a nova data de nascimento do cliente ", "Atualizando dados", JOptionPane.QUESTION_MESSAGE);
					cliente = new Cliente();
					cliente.setNome(clienteNome);
					cliente.setEndereco(clienteEndereco);
					cliente.setDataNascimento(clienteNasc);
					clientes.remove(indice);
					clientes.add(indice, cliente);
				}else {
					JOptionPane.showMessageDialog(null, "Índice inválido");
				}
			}else if(resp == opcao[3]) { //Excluir um cliente
				String clienteExcluir = JOptionPane.showInputDialog(null, "Qual o índice do cliente que você deseja excluir? ", "Excluir cliente", JOptionPane.QUESTION_MESSAGE);
				int indice = Integer.parseInt(clienteExcluir);
				if(indice >= 0 && indice <clientes.size()) {
					clientes.remove(indice);
				}else {
					JOptionPane.showMessageDialog(null, "Índice inválido");
				}
			}else { //if resp == null
				JOptionPane.showMessageDialog(null, "Você escolheu sair do sistema. \n Volte mais tarde!");
				break;
			}

			again = JOptionPane.showConfirmDialog(null, "Deseja continuar no sistema ? ", "Clientes",
					JOptionPane.YES_NO_OPTION);
		} while (again == 0);

	}

}
