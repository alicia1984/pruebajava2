/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import java.util.Scanner;
 import javax.swing.JOptionPane;
public class contraseña {
 /**
 **Alicia Villarroel
 * @author LP 13
 * Fecha:Octubre 6  de  noviembre de 20017
 * Programa: prueba java 2
 * Responsabilidad: solicitar  contraseña  con 3  intentos  de  equivocacion 
 *clase:contraseña
 */
public static void main(String[] args) {
		//  esta  cosa  no  quiere   ya  me  dolio  mi cabeza
Scanner teclado= new Scanner(System.in);
		
int contraseña=140484;
int index=3;
int maximo=3;

contraseña = Integer.parseInt(JOptionPane.showInputDialog( "ingrese su contraseña"));
while(contraseña!=140484)
{
 System.out.print(index);
index=3;					
}					
	

            if (contraseña!=140484) {
              Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nuevamente este  es su segundo intento")); 
              
            }
		else
            {
            }
 Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese nuevamente este  es su tercer intento")); 
    if (contraseña!=3) {
        JOptionPane.showInputDialog("Comuniquese  con  su soporte Tecnico si los problemas persisten");
    }
    else 
        
    {
    if (contraseña==140484)
      JOptionPane.showMessageDialog(null, "bienvenido su contraseña es correcta");      
    }
			
					
 
 
 
			}
 
 
		
 
 
	}
 

 
 
