/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.File;

/**
 *
 * @author 52614
 */
public class Documento extends Documentacion {
    
    @Override
    public void Generar(){
         File myOb = new File("Reporte.txt");
    }
    @Override
    public void Modificar(){
        
    }
}
