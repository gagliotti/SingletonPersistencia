package com.mycompany.exemplo;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.vigil
 */
public class Persistencia {
    public void gravar(ControladorDeLivros c) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("controlador");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }
    
    public ControladorDeLivros load() throws FileNotFoundException, IOException, ClassNotFoundException{
        ControladorDeLivros ret = null;
        
        File file = new File("controlador");
        
        if(file.exists()){
            FileInputStream fis = new FileInputStream("controlador");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ret = (ControladorDeLivros) ois.readObject();
        }
        else{
            ret = ControladorDeLivros.getInstancia();
        }        
        
        return ret;
    }
}
