package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentral {

    public static void main( String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame {

    public MarcoCentrado(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit(); //sistema nativo de ventanas
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        int anchoPantalla = tamanioPantalla.width;
        int altoPantalla = tamanioPantalla.height;
        setSize(anchoPantalla/2, altoPantalla/2);
        setLocation(anchoPantalla/4, altoPantalla/4);
        setTitle("Marco Centrado");
        Image miIcono = miPantalla.getImage("src/graficos/icon.png");
        setIconImage(miIcono);
    }
}
