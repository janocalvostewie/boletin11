package boletin11;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin11 {
    public static void main(String[] args) {
        
        //CAPTURAMOS MOMENTO DE INICIO
        Date inicio= new Date();
        String frase=JOptionPane.showInputDialog("Escribe la siguiente oración \nLa documentación es todo aquel conjunto de manuales impresos\no en formato digital que explique una aplicación informática");
        //CAPTURAMOS MOMENTO FIN
         Date fin=new Date();
        
         //calculamos la duracion
         String duracion=((fin.getHours()-inicio.getHours())+" : "+(fin.getMinutes()-inicio.getMinutes())+" : "+(fin.getSeconds()-inicio.getSeconds()));
        JOptionPane.showMessageDialog(null, "Has escrito lo siguiente: "+frase+"\nY has tardaddo: "+duracion);
         
    }
    
}
