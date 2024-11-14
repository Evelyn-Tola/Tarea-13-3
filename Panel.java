
package componentes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        
        //cuadrícula
        for (int x = 50; x <= 500; x += 50) {
            g.drawLine(x, 50, x, 300); // Líneas verticales
        }
        for (int y = 50; y <= 300; y += 50) {
            g.drawLine(50, y, 500, y); // Líneas horizontales
        }
        g.setColor(Color.BLUE);
        g.drawLine(50, 300, 550, 300); // Eje X
        g.drawLine(50, 300, 50, 30);   // Eje Y

        g.drawLine(545, 295, 550, 300);
        g.drawLine(545, 305, 550, 300);

        //(altas y bajas simuladas)
        g.setColor(Color.RED);
        int[] puntosX = {50, 100, 150, 200, 250, 300, 350, 400, 450, 500};
        int[] puntosY = {250, 200, 220, 180, 240, 160, 210, 130, 170, 140};
        
        for (int i = 0; i < puntosX.length - 1; i++) {
            g.drawLine(puntosX[i], puntosY[i], puntosX[i + 1], puntosY[i + 1]);
        }

        //flecha final 
        g.drawLine(495, 145, 500, 140);
        g.drawLine(495, 135, 500, 140);
        
        g.setColor(Color.BLACK);
        g.drawString("Gráfica de Altas y Bajas", 200, 20);
        g.drawString("Tiempo", 520, 315);
        g.drawString("Valor", 20, 40);
    }
}
