package stack;

import java.util.Stack;

import javax.swing.JOptionPane;

/**
 * Simulação do menu "avançar" e "voltar" de um navegador.
 * @author Camila Diniz
 *
 */
public class MenuNavegador {

	public static void main(String[] args) {
		
		String paginaAtual = null;
		Stack<String> voltar = new Stack<String>();
		Stack<String> avancar = new Stack<String>();
		String[] opcao = {"Adicionar uma nova URL", "Voltar", "Avancar"};
		int repetir;
		
		do {
		
		String resp = (String) JOptionPane.showInputDialog(null, "O que você deseja fazer ?", "Navegador",
				JOptionPane.PLAIN_MESSAGE, null, opcao, "Adicionar");
		
		if(resp == opcao[0]) {//adicionar URL
			if(paginaAtual != null) {
				voltar.push(paginaAtual);
			}
			paginaAtual = JOptionPane.showInputDialog(null, " Digite uma URL", "Adicionando uma URL", JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Página atual: " +paginaAtual, "Navegador", JOptionPane.INFORMATION_MESSAGE);
		
		}else if(resp == opcao[1]) {//voltar
			if(! voltar.empty()) {
				avancar.push(paginaAtual);
				paginaAtual = voltar.peek();
				voltar.pop();
				JOptionPane.showMessageDialog(null, "Página atual: " +paginaAtual, "Navegador", JOptionPane.INFORMATION_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(null, "Histórico vazio", "Navegador", JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(resp == opcao[2]) {//avancar
			if(! avancar.empty()) {
				voltar.push(paginaAtual);
				paginaAtual = avancar.peek();
				avancar.pop();
				JOptionPane.showMessageDialog(null, "Página atual: " +paginaAtual, "Navegador", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Histórico vazio", "Navegador", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else {//usuario pressionou cancel
			JOptionPane.showMessageDialog(null, "Você escolheu sair da aplicação. \n Até a próxima!");
			break;
		}
		
		System.out.println("Pilha voltar: " +voltar);
		System.out.println("Página atual: " +paginaAtual);
		System.out.println("Pilha avancar " +avancar);
		System.out.println();
		
		repetir = JOptionPane.showConfirmDialog(null, "Deseja continuar no navegador ? ", "Navegador",
				JOptionPane.YES_NO_OPTION);
	} while (repetir == 0);
		
		
		
	}
	
}
