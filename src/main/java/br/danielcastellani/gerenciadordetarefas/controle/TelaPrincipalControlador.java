/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
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
    private TelaProjeto telaProjetoCriar;
    private TelaProjeto telaProjetoEditar;
    private TelaProjetoListagem telaProjetoListagem;

    public TelaPrincipalControlador() {
        this.telaPrincipal = new TelaPrincipal();
    }

    public void exibeTelaSobre(java.awt.event.ActionEvent evt) {
        TelaSobreControlador controlador = (TelaSobreControlador) Contexto.getInstance().get(TelaSobreControlador.class.getCanonicalName());
        controlador.exibeTelaSobre();
    }

    public void exibeTelaProjetosListagem(ActionEvent evt) {
        if (telaProjetoListagem == null) {
            telaProjetoListagem = new TelaProjetoListagem();
            telaPrincipal.getContentPane().add(telaProjetoListagem);
        }

        telaProjetoListagem.pack();
        telaProjetoListagem.setVisible(true);

        TelaProjetoListagemControlador controlador;
        controlador = (TelaProjetoListagemControlador) Contexto.getInstance().get(TelaProjetoListagemControlador.class.getCanonicalName());

        controlador.listarProjetos();
    }

    public void exibeTelaCriarNovoProjeto(ActionEvent evt) {
        if (telaProjetoCriar == null) {
            telaProjetoCriar = TelaProjetoFactory.criaTelaNovoProjeto();
            telaPrincipal.getContentPane().add(telaProjetoCriar);
        }
        telaProjetoCriar.pack();
        telaProjetoCriar.setVisible(true);
    }

    public void editarProjeto(Projeto projeto) {
        telaProjetoListagem.setVisible(false);

        if (telaProjetoEditar == null) {
            telaProjetoEditar = TelaProjetoFactory.criaTelaEditarProjeto(projeto);
            telaPrincipal.getContentPane().add(telaProjetoEditar);
        }
        telaProjetoEditar.setVisible(true);
        TelaProjetoControlador controlador = (TelaProjetoControlador) Contexto.getInstance().get(TelaProjetoControlador.class.getCanonicalName());
        controlador.atualizaTelaEditar(projeto);
    }

    public void exibeTelaPrincipal() {
        telaPrincipal.setVisible(true);
    }

    void adicionaAoContainer(TelaSobre telaSobre) {
        telaPrincipal.getContentPane().add(telaSobre);
    }
}
