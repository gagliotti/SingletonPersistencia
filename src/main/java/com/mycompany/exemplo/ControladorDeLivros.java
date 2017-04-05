/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin.vigil
 */
public class ControladorDeLivros implements Serializable{
    protected List<Livro> livros;
    protected static ControladorDeLivros instancia;

    
    private ControladorDeLivros(){
        this.livros = new ArrayList<>();
    }
            
            
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    public static ControladorDeLivros getInstancia(){
        if (instancia == null)
            instancia = new ControladorDeLivros();
                   
       return instancia;
    }
    
    public void addLivro(Livro l){
        this.livros.add(l);
    }
    
    public Livro getLivro(){
        return (Livro) this.livros.toArray()[0];
    }
    
}
