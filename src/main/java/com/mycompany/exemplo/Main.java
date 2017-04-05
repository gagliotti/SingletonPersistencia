/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author martin.vigil
 */
public class Main {
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException{
        Persistencia persistencia = new Persistencia();
        ControladorDeLivros controlador = persistencia.load();
        
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
                
        l1.setAutor("a1");
        l1.setNome("n1");
        l2.setAutor("a2");
        l2.setNome("n1");
        
        controlador.addLivro(l1);
        controlador.addLivro(l2);
        
        persistencia.gravar(controlador);
        
    }
}
