/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.gui;

import br.danielcastellani.gerenciadordetarefas.modelo.Projeto;
import javax.swing.JButton;

/**
 *
 * @author Daniel
 */
public class ButtonProjeto extends JButton{

    private Projeto projeto;

    public ButtonProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
