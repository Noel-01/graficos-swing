package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {
	
    public static void main (String[] args) {
    	MarcoImagen marcoImagen = new MarcoImagen();
    	marcoImagen.setVisible(true);
    	marcoImagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame  {
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		setBounds(600, 400, 200, 200);
		
		LaminaConImagen milamina = new LaminaConImagen();
		add(milamina);
	}
}

class LaminaConImagen extends JPanel {
	
	private Image image;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		File miimagen = new File("src/graficos/coche.png");
		
		try {
			
			image = ImageIO.read(miimagen);
			
		} catch (IOException e) {
			System.out.println("Imagen no encontrada");
		}	
		
		g.drawImage(image, 5, 5, null);
		
	}
	
	
}
