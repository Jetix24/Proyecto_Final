/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.awt.Color;
import static java.lang.Math.round;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Proyecto_POO  {

   
    static double num;
   

    public static void main(String[] args) {     
        
        GetNumero();
        if(num > 0){
          Resultados R = new Resultados();
          R.setVisible(true);
        }
    }
    public  static double GetNumero() {
       // Icon tacha = new ImageIcon(getClass().getResource("C:\\Users\\52614\\Documents\\NetBeansProjects\\Proyecto_POO\\src\\proyecto_poo\\attention-2180765_960_720.png"));
        UIManager.put("OptionPane.background", new Color(22, 201, 160)); 
        UIManager.put("Panel.background", new Color(22, 201, 160)); 
        try{
        num = Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa el No. de estudiantes que quieres agregar"),"Número de estudiantes",3)); 
        if(num < 0){
             UIManager.put("OptionPane.background", new Color(255, 53, 3)); 
            UIManager.put("Panel.background", new Color(255, 53, 3)); 
            throw new Exceptionmenorcero("Ingreso un número menor a cero"); 
        }   
        return num;
        
        }catch(NumberFormatException e ){  
            if(String.valueOf(e.getMessage())=="null"){
               System.exit(0);
            } else if(e.getMessage().equals("For input string: "+"\"\"")){
               UIManager.put("OptionPane.background", new Color(255, 146, 3)); 
               UIManager.put("Panel.background", new Color(255, 146, 3)); 
               JOptionPane.showMessageDialog(null,"No Ingresaste ningun valor ","ERROR",2);
               GetNumero();
            }else{
               UIManager.put("OptionPane.background", new Color(246, 255, 0)); 
               UIManager.put("Panel.background", new Color(246, 255, 0)); 
               JOptionPane.showMessageDialog(null,"Ingresaste una letra ","ERROR",2);
               GetNumero();
            }
        }catch(Exceptionmenorcero e){
            JOptionPane.showMessageDialog(null,"Ingresaste un valor menor a cero ","ERROR",2);
            GetNumero();
        }
         return num;     
    }
    
     public static int Numero(){
         return (int) round(num);
     }
     
    
}
