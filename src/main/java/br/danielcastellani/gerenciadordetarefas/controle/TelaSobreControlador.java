/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.controle;

import br.danielcastellani.gerenciadordetarefas.contexto.Contexto;
import br.danielcastellani.gerenciadordetarefas.gui.TelaSobre;

/**
 *
 * @author Daniel
 */
public class TelaSobreControlador {

    TelaSobre telaSobre;

    public void fechar() {
        telaSobre.setVisible(false);
    }

    void exibeTelaSobre() {
        if (telaSobre == null) {
            telaSobre = new TelaSobre();
            TelaPrincipalControlador controlador = (TelaPrincipalControlador) Contexto.getInstance().get(TelaPrincipalControlador.class.getCanonicalName());
            controlador.adicionarComponente(telaSobre);
            telaSobre.setClosable(true);
        }
        telaSobre.pack();
        telaSobre.setVisible(true);
    }
}
