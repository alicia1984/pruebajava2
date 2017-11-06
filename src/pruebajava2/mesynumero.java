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
 **Alicia Villarroel
 * @author LP 13
 * Fecha:Octubre 6  de  noviembre de 20017
 * Programa: prueba java 2
 * Responsabilidad: ingresar  numero  para  meses   del  año  estructura  de switch
 
 */
public class mesynumero {
  
   public static void main(String[] args)  
    
    {
    
     float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero "));
    //El metodo round es para redondear un decimal
     
     switch(Math.round(mes)) //Se recibe un valor
     {
         
          case 12://Caso 12  mes  de  diciembre si el  valor  es  de  12
             JOptionPane.showMessageDialog(null,"diciembre");
            break;
          case 11://Caso 11  mes  de  noviembre si el  valor  es  de 11
             JOptionPane.showMessageDialog(null,"noviembre");
            break;
          case 10://Caso 10  mes  de  octubre si el  valor es  de  10
             JOptionPane.showMessageDialog(null,"octubre");
            
          case 9://Caso 9  mes  de  septiembre si el valor 9
             JOptionPane.showMessageDialog(null,"septiembre");
            
         
         break;
          case 8://Caso 8 mes  de agosto si el valor 8
             JOptionPane.showMessageDialog(null,"agosto");
            
         break;
         case 7://Caso 7 mes  de  julio  si el valor 7
             JOptionPane.showMessageDialog(null,"julio");
             
         break;
          case 6://Caso 6 mes  de junio - si el valor 6
             JOptionPane.showMessageDialog(null,"junio");
             
         break;
          case 5://Caso 5 mes  de mayo si el valor 5
             JOptionPane.showMessageDialog(null,"mayo");
             
         break;
          case 4://Caso 4-mes  de  abril  mi  favorito es mi  mes  de  cumpleaños si el valor 4
             JOptionPane.showMessageDialog(null,"abril");
             
             break;
          case 3://Caso 3-mes  de marzo si el valor 3
             JOptionPane.showMessageDialog(null,"marzo");
            
           break;
          case 2://Caso 2-mes  de febrero si el valor 2
             JOptionPane.showMessageDialog(null,"febrero");
            break;
          case 1://Caso 1-mes  de  enero  si el valor 1
             JOptionPane.showMessageDialog(null,"enero");
             
             
             
             
             
             
         break;
          default:
               JOptionPane.showMessageDialog(null,"son  todos los  meses");
             
         break;
              
     }
    
    }   
}
  
    







  