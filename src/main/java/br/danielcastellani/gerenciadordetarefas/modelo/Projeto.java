/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.danielcastellani.gerenciadordetarefas.modelo;

import br.danielcastellani.gerenciadordetarefas.bd.ObjetoPersistente;
import java.util.List;


/**
 *
 * @author DanCastellani
 */
public class Projeto extends ObjetoPersistente{

    private String nome;
    private String descricao;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome + " - " + descricao;
    }

    public Projeto() {
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descrição to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the tarefas
     */
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    /**
     * @param tarefas the tarefas to set
     */
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
