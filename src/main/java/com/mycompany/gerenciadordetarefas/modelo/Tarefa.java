/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciadordetarefas.modelo;

import java.util.Calendar;

/**
 *
 * @author Daniel
 */
public class Tarefa {

    private String descricao;
    private Calendar dataDeCriacao;
    private Calendar dataDeVencimento;
    private Calendar dataDeFechamento;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataDeCriacao
     */
    public Calendar getDataDeCriacao() {
        return dataDeCriacao;
    }

    /**
     * @param dataDeCriacao the dataDeCriacao to set
     */
    public void setDataDeCriacao(Calendar dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    /**
     * @return the dataDeVencimento
     */
    public Calendar getDataDeVencimento() {
        return dataDeVencimento;
    }

    /**
     * @param dataDeVencimento the dataDeVencimento to set
     */
    public void setDataDeVencimento(Calendar dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    /**
     * @return the dataDeFechamento
     */
    public Calendar getDataDeFechamento() {
        return dataDeFechamento;
    }

    /**
     * @param dataDeFechamento the dataDeFechamento to set
     */
    public void setDataDeFechamento(Calendar dataDeFechamento) {
        this.dataDeFechamento = dataDeFechamento;
    }
}
