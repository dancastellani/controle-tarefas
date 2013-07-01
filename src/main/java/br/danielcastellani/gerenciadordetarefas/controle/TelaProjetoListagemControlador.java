/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.bd.BancoDeDados;
import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
import br.danielcastellani.gerenciadordetarefas.gui.ButtonProjeto;
import br.danielcastellani.gerenciadordetarefas.gui.TelaProjetoListagem;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class TelaProjetoListagemControlador {

    private TelaProjetoListagem telaProjetoListagem;
    private String[] cabecalho = {"Nome", "Descrição", "Ações"};

    public void listarProjetos() {
        if (telaProjetoListagem == null) {
            telaProjetoListagem = new TelaProjetoListagem();
            TelaPrincipalControlador controlador = (TelaPrincipalControlador) Contexto.getInstance().get(TelaPrincipalControlador.class.getCanonicalName());
            controlador.adicionarComponente(telaProjetoListagem);
        }
        telaProjetoListagem.pack();
        telaProjetoListagem.setVisible(true);

        List<Projeto> projetos = BancoDeDados.getBancoDeDados().getListaProjetos();

        JPanel listagem = telaProjetoListagem.getPanelListagem();
        listagem.setLayout(new GridLayout(projetos.size() + 1, cabecalho.length));

        listagem.removeAll();
        System.gc();

        for (String itemDeCabecalho : cabecalho) {
            listagem.add(new JLabel(itemDeCabecalho));
        }

        for (Projeto projeto : projetos) {
            listagem.add(new JLabel(projeto.getNome()));
            listagem.add(new JLabel(projeto.getDescricao()));
            listagem.add(new ButtonProjeto(projeto));
        }
    }

    void esconde() {
        telaProjetoListagem.setVisible(false);
    }
}
