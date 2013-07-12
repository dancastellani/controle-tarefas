/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.gui;

import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
import br.danielcastellani.gerenciadordetarefas.controle.TelaPrincipalControlador;
import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import javax.swing.JButton;

/**
 *
 * @author Daniel
 */
public class ButtonProjetoRemover extends JButton {

    private Projeto projeto;

    public ButtonProjetoRemover(Projeto projeto) {
        this.projeto = projeto;
        this.setText("Remover");

        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerProjeto(evt);
            }
        });
    }
    
    public void removerProjeto(java.awt.event.ActionEvent evt) {
        TelaPrincipalControlador controladorTelaPrincipal = (TelaPrincipalControlador) Contexto.getInstance().get(TelaPrincipalControlador.class.getCanonicalName());
        controladorTelaPrincipal.removerProjeto(projeto);
    }
}
