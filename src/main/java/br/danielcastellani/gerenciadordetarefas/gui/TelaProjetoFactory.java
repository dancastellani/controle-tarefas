/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.gui;

import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;

/**
 *
 * @author DanCastellani
 */
public class TelaProjetoFactory {

    public static TelaProjeto criaTelaNovoProjeto() {
        return new TelaProjeto(TelaProjeto.OPCAO_NOVO_PROJETO, new Projeto());
    }

    public static TelaProjeto criaTelaEditarProjeto(Projeto projetoParaEditar) {
        TelaProjeto telaProjeto = new TelaProjeto(TelaProjeto.OPCAO_EDITAR_PROJETO, projetoParaEditar);
        telaProjeto.atualizaTelaEditar(telaProjeto, projetoParaEditar);
        return telaProjeto;
    }

    
    
    
}
