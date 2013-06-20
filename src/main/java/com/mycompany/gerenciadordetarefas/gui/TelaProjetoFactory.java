/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciadordetarefas.gui;

import com.mycompany.gerenciadordetarefas.modelo.Projeto;

/**
 *
 * @author DanCastellani
 */
public class TelaProjetoFactory {

    public static TelaProjeto criaTelaNovoProjeto() {
        return new TelaProjeto(TelaProjeto.OPCAO_NOVO_PROJETO, new Projeto());
    }

    public static TelaProjeto criaTelaEditarProjeto(Projeto projetoParaEditar) {
        return new TelaProjeto(TelaProjeto.OPCAO_EDITAR_PROJETO, projetoParaEditar);
    }
}
