/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciadordetarefas.bd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanCastellani
 */
public class BancoDeDados {

    //----------------------------------------------- Singleton ----------------
    /**
     * Instancia Singleton
     */
    private static BancoDeDados bancoDeDados;

    /**
     * Construtor Singleton
     */
    private BancoDeDados() {
        projetos = new ArrayList<ObjetoPersistente>();
    }

    /**
     * Metodo Singleton
     */
    public static BancoDeDados getBancoDeDados() {
        if (bancoDeDados == null) {
            bancoDeDados = new BancoDeDados();
        }
        return bancoDeDados;
    }
    //--------------------------------------------------------------------------
    private List<ObjetoPersistente> projetos;
    private static final String ARQUIVO_BD = "GT-DataBase";

    public void persisteInformacoes() throws IOException {
        persisteObjetos(projetos);
    }

    private void persisteObjetos(List<ObjetoPersistente> listaDeObjetos) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(ARQUIVO_BD);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (ObjetoPersistente objetoPersistente : listaDeObjetos) {
                oos.writeObject(objetoPersistente);
            }
        } catch (FileNotFoundException ex) {
            throw new IOException(ex);
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}
