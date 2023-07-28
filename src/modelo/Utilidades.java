/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author santiago.londono_men
 */
public class Utilidades {
    public static boolean guardarArchivo(LinkedList<Cliente>ListaC){
            boolean t=false;
            try {
      
        String nombreArchivo = "clientes.txt";

       
        FileWriter fileWriter = new FileWriter(nombreArchivo);

      
        BufferedWriter writer = new BufferedWriter(fileWriter);

       
        for (Cliente cliente : ListaC) {
            writer.write(cliente.toString()+"\n");
           
        }

       
        writer.close();
        fileWriter.close();
        t=true;
  

    } catch (IOException e) {
       
        e.printStackTrace();
       
    }   
    
    return t;

    }                                      
}
    
    

