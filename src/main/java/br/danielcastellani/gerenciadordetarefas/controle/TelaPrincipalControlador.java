/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.gui.TelaPrincipal;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjeto;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjetoFactory;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjetoListagem;
import br.danielcastellani.gerenciadordetarefas.gui.TelaSobre;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import java.awt.event.ActionEvent;

/**
 *
 * @author Daniel
 */
public class TelaPrincipalControlador {

    private TelaPrincipal telaPrincipal;
    private TelaProjeto telaProjeto;
    private TelaProjetoListagem telaProjetoListagem;
    private TelaSobre telaSobre;

    public TelaPrincipalControlador(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void exibeTelaSobre(java.awt.event.ActionEvent evt) {
        if (telaSobre == null) {
            telaSobre = new TelaSobre();
            telaPrincipal.getContentPane().add(telaSobre);
        }
        telaSobre.pack();
        telaSobre.setVisible(true);
    }

    public void exibeTelaProjetosListagem(ActionEvent evt) {
        if (telaProjetoListagem == null) {
            telaProjetoListagem = new TelaProjetoListagem();
            telaPrincipal.getContentPane().add(telaProjetoListagem);
        }
        telaProjetoListagem.pack();
        telaProjetoListagem.setVisible(true);
    }

    public void exibeTelaCriarNovoProjeto(ActionEvent evt) {
        if (telaProjeto == null) {
            telaProjeto = TelaProjetoFactory.criaTelaNovoProjeto();
            telaPrincipal.getContentPane().add(telaProjeto);
        }
        telaProjeto.pack();
        telaProjeto.setVisible(true);
    }
}
