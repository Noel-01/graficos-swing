package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaDibujo {

    public static void main (String[] args) {
        MarconConDibujos miMarco = new MarconConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarconConDibujos extends JFrame {

    public MarconConDibujos() {
        setTitle("Prueba dibujo");
        setSize(400, 400);
        setLocation(300, 300);

        //Insertando la lamina con dibujo
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}

class LaminaConFiguras extends JPanel {

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
//        g.drawRect(50, 50, 200, 200); //dibuja un cuadrado
//        g.drawLine(100, 100, 300, 200);

        /* Uso de Graphics 2D */
        Graphics2D g2 = (Graphics2D) g;

        //********** ME QUEDO EN EL VIDEO 60 ***************//


    }
}
