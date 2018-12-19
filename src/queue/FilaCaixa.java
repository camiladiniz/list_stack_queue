package queue;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;
/**
 * Sistema simula um sistema de fila de caixa de 15 unidades.
 * Aplicação adiciona um cliente na fila de cliente e os direciona
 * para o caixa que possui a menor fila, liberando-o de acordo com a necessidade.
 * @author Camila Diniz
 *
 */
public class FilaCaixa {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Queue<Cliente> filaClientes = new LinkedList<Cliente>();
		Queue<Cliente> caixa1 = new LinkedList<Cliente>();
		Queue<Cliente> caixa2 = new LinkedList<Cliente>();
		Queue<Cliente> caixa3 = new LinkedList<Cliente>();
		Queue<Cliente> caixa4 = new LinkedList<Cliente>();
		Queue<Cliente> caixa5 = new LinkedList<Cliente>();
		Queue<Cliente> menorFila = new LinkedList<Cliente>();
		int filaMenor = 0;

		String[] opcao = { "Adicionar cliente na fila", "Direcionar cliente para o caixa", "Remover cliente do caixa" };
		int repetir;

		do {

			String resp = (String) JOptionPane.showInputDialog(null, "O que você deseja fazer ?", "Fila", JOptionPane.PLAIN_MESSAGE, null, opcao, "Adicionar cliente na fila");

			if (resp == opcao[0]) {// adicionar cliente
				String clienteNome = JOptionPane.showInputDialog(null, "Insira o nome do cliente: ", "Cadastro de clientes", JOptionPane.QUESTION_MESSAGE);

				cliente = new Cliente();
				cliente.setNome(clienteNome);
				filaClientes.add(cliente);
				JOptionPane.showMessageDialog(null, "Cliente " +cliente +" adicionado à fila principal com sucesso!", "Cliente adicionado", JOptionPane.INFORMATION_MESSAGE);

			} else if (resp == opcao[1]) {// mandar cliente p/ caixa
				if (filaClientes.size() > 0) {// se houver clientes na fila principal
					// faz a comparação para ver qual é a menor fila
					filaMenor = caixa1.size();
					menorFila = caixa1;
					if (caixa2.size() < filaMenor) {
						filaMenor = caixa2.size();
						menorFila = caixa2;
					}
					if (caixa3.size() < filaMenor) {
						filaMenor = caixa3.size();
						menorFila = caixa3;
					}
					if (caixa4.size() < filaMenor) {
						filaMenor = caixa4.size();
						menorFila = caixa4;
					}
					if (caixa5.size() < filaMenor) {
						filaMenor = caixa5.size();
						menorFila = caixa5;
					}

					menorFila.add(filaClientes.peek());
					JOptionPane.showMessageDialog(null, "Cliente " +filaClientes.peek() +" direcionado ao caixa com sucesso!", "Cliente direcionado",
							JOptionPane.INFORMATION_MESSAGE);
					filaClientes.remove();

				} else {
					JOptionPane.showMessageDialog(null, "Não há clientes para serem atendidos!", "Fila vazia",
							JOptionPane.WARNING_MESSAGE);
				}

			} else if (resp == opcao[2]) {// Remover cliente do caixa

				String[] caixas = { "Caixa 1", "Caixa 2", "Caixa 3", "Caixa 4", "Caixa 5" };
				String caixa = (String) JOptionPane.showInputDialog(null, "O cliente de qual caixa já foi atendido?",
						"Liberar caixa", JOptionPane.QUESTION_MESSAGE, null, caixas, "Caixa 1");

				if (caixa == caixas[0] && caixa1.size() > 0) {
					caixa1.remove();
					JOptionPane.showMessageDialog(null, "Caixa liberado!", "Caixa liberado",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (caixa == caixas[1] && caixa2.size() > 0) {
					caixa2.remove();
					JOptionPane.showMessageDialog(null, "Caixa liberado!", "Caixa liberado",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (caixa == caixas[2] && caixa3.size() > 0) {
					caixa3.remove();
					JOptionPane.showMessageDialog(null, "Caixa liberado!", "Caixa liberado",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (caixa == caixas[3] && caixa4.size() > 0) {
					caixa4.remove();
					JOptionPane.showMessageDialog(null, "Caixa liberado!", "Caixa liberado",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (caixa == caixas[4] && caixa5.size() > 0) {
					caixa5.remove();
					JOptionPane.showMessageDialog(null, "Caixa liberado!", "Caixa liberado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O caixa já está vazio!", "Caixa vazio",
							JOptionPane.WARNING_MESSAGE);
				}

			} else {// usuario pressionou cancel
				JOptionPane.showMessageDialog(null, "Você escolheu sair do sistema. \n Até a próxima!");
				break;
			}

			System.out.println("Fila principal: " +filaClientes);
			System.out.println("Fila caixa 1: " +caixa1);
			System.out.println("Fila caixa 2: " +caixa2);
			System.out.println("Fila caixa 3: " +caixa3);
			System.out.println("Fila caixa 4: " +caixa4);
			System.out.println("Fila caixa 5: " +caixa5);
			System.out.println();
			
			repetir = JOptionPane.showConfirmDialog(null, "Deseja continuar no sistema ? ", "Fila",
					JOptionPane.YES_NO_OPTION);
		} while (repetir == 0);

	}

}
