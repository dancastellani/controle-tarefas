/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciadordetarefas.modelo;

import com.mycompany.gerenciadordetarefas.bd.ObjetoPersistente;
import java.io.Serializable;


/**
 *
 * @author DanCastellani
 */
public class Projeto extends ObjetoPersistente{

    private String nome;
    private String descrição;

    public Projeto(String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
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
    public String getDescrição() {
        return descrição;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
