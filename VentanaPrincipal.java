
package ventana1;

import componentes.Panel;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
     public VentanaPrincipal() throws HeadlessException{
    
         setSize(400,300);
         setTitle("Grafica Estadistica");
         
          Panel x = new Panel();
          add(x);
}
}