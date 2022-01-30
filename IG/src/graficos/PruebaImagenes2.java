package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes2 {
	
	  public static void main (String[] args) {
	    	MarcoImagen2 marcoImagen2 = new MarcoImagen2();
	    	marcoImagen2.setVisible(true);
	    	marcoImagen2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	}

	class MarcoImagen2 extends JFrame  {
		
		public MarcoImagen2() {
			
			setTitle("Marco con Imagen");
			setBounds(600, 400, 300, 200);
			
			LaminaConImagen2 milamina = new LaminaConImagen2();
			add(milamina);
		}
	}

	class LaminaConImagen2 extends JPanel {
		
		private Image image;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			File miimagen = new File("src/graficos/bola.png");
			
			try {
				
				image = ImageIO.read(miimagen);
				
			} catch (IOException e) {
				System.out.println("Imagen no encontrada");
			}	
			
			int anchoImagen = image.getWidth(this);
			int altoImagen = image.getHeight(this);
			
			
			g.drawImage(image, 0, 0, null);
			
			for(int y =0; y<200; y++) {
				for(int x=0; x<300; x++) {
					if(x+y>0) {
						g.copyArea(0, 0, anchoImagen, altoImagen, x*anchoImagen, y*altoImagen);
					}
				}
			}
			
			
			
		}


}
