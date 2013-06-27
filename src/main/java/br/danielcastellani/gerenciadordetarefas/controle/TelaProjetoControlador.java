/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.bd.BancoDeDados;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjeto;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class TelaProjetoControlador {

    TelaProjeto telaProjeto;

    public TelaProjetoControlador(TelaProjeto telaProjeto) {
        this.telaProjeto = telaProjeto;
    }

    public void salvar(Projeto projeto) {
        projeto.setNome(telaProjeto.getTxtNome().getText());
        projeto.setDescricao(telaProjeto.getTxtDescricao().getText());
        BancoDeDados.getBancoDeDados().getListaProjetos().add(projeto);
        
        limparCampos();
        telaProjeto.setVisible(false);
        JOptionPane.showMessageDialog(telaProjeto, "Projeto salvo com sucesso");
    }

    public void fechar() {
        limparCampos();
        telaProjeto.setVisible(false);
    }

    private void limparCampos() {
        telaProjeto.getTxtNome().setText("");
        telaProjeto.getTxtDescricao().setText("");
    }
}
