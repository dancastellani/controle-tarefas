/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.contexto;

import br.danielcastellani.gerenciadordetarefas.controle.TelaPrincipalControlador;
import br.danielcastellani.gerenciadordetarefas.controle.TelaProjetoControlador;
import br.danielcastellani.gerenciadordetarefas.controle.TelaProjetoListagemControlador;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel
 */
public class Contexto {

    static Contexto contexto;

    static synchronized public Contexto getInstance() {
        if (contexto == null) {
            contexto = new Contexto();
        }
        return contexto;
    }

    private Contexto() {
        objetos = new HashMap<String, Object>();
        inicializaControladores();
    }
    
    Map<String, Object> objetos;

    public Object get(String chave) {
        return objetos.get(chave);
    }

    public void put(String chave, Object valor) {
        objetos.put(chave, valor);
    }

    private void inicializaControladores() {
        this.objetos.put(TelaPrincipalControlador.class.getCanonicalName(), new TelaPrincipalControlador());
//        this.objetos.put(TelaProjetoControlador.class.getCanonicalName(), new TelaProjetoControlador());
//        this.objetos.put(TelaProjetoListagemControlador.class.getCanonicalName(), new TelaProjetoListagemControlador());
        
    }
    
}
