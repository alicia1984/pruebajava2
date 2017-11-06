/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Mateamticas
import javax.swing.JOptionPane;

/**
 *
 * @author LP 13
 */
public class mesynumero {
  
   public static void main(String[] args)  
    
    {
    
     float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero "));
    //El metodo round es para redondear un decimal
     
     switch(Math.round(mes)) //Se recibe un valor
     {
         
          case 12://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"diciembre");
            break;
          case 11://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"noviembre");
            break;
          case 10://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"octubre");
            
          case 9://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"septiembre");
            
         
         break;
          case 8://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"agosto");
            
         break;
         case 7://Caso 1- si el valor 7
             JOptionPane.showMessageDialog(null,"julio");
             
         break;
          case 6://Caso 2- si el valor 6
             JOptionPane.showMessageDialog(null,"junio");
             
         break;
          case 5://Caso 3- si el valor 5
             JOptionPane.showMessageDialog(null,"mayo");
             
         break;
          case 4://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"abril");
             
             break;
          case 3://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"marzo");
            
           break;
          case 2://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"febrero");
            break;
          case 1://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"enero");
             
             
             
             
             
             
         break;
          default:
               JOptionPane.showMessageDialog(null,"son  todos los  meses");
             
         break;
              
     }
    
    }   
}
  
    







  