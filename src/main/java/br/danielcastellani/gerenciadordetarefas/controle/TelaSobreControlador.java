/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.gui.TelaSobre;

/**
 *
 * @author Daniel
 */
public class TelaSobreControlador {
    TelaSobre telaSobre;

    public TelaSobreControlador(TelaSobre telaSobre) {
        this.telaSobre = telaSobre;
    }

    public void fechar() {
        telaSobre.setVisible(false);
    }

    
}
