package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {

        MarcoConTexto mimarco = new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

/**
 *Creacion del marco principal
 */
class MarcoConTexto extends JFrame {

    public MarcoConTexto() {
        setVisible(true);
        setLocation(400, 200);
        setSize(600, 450);
        setTitle("Primer Texto");

        //se añade la lamina creada al JFrame o marco...
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

/**
 * Creación de Laminas que luego se podrán añadir al marco
 */
class Lamina extends JPanel { // extiende de jpanel para crear una lamina

    //se sobreescribe este metodo
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //Hace el trabajo para el que fue diseñado
        g.drawString("Estamos aprendiendo Swing", 100, 100); // Escribir texto en la lamina y darle localización
    }
}
