package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {

    public static void main(String[] args) {

        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MiMarco extends JFrame {

    public MiMarco() {
 //       setSize(500, 300); //Tamaño panatalla
 //       setLocation(500, 300); //localciación del la ventana en la pantalla

        setBounds(500,300,500,300); //lo mismo que las dos lineas de encima pero junto
//        setResizable(true); //para que se pueda o no redimensionar la ventana
//        setExtendedState(Frame.MAXIMIZED_BOTH); //Para abrir a pantalla completa la ventana

        setTitle("Mi ventana"); // titulo de la ventana
    }
}
