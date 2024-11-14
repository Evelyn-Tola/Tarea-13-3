
package proyectografica;

import java.awt.EventQueue;
import javax.swing.JFrame;
import ventana1.VentanaPrincipal;

public class GraficaApp {
    public static void main(String[] args){
    EventQueue.invokeLater(() -> {
     
        VentanaPrincipal x = new VentanaPrincipal();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
        x.setLocation(200,300);    
       
    } );

}
}