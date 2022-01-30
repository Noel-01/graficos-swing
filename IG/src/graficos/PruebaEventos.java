package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	
    public static void main (String[] args) {
    	MarcoBotones marcoBotones = new MarcoBotones();
    	marcoBotones.setVisible(true);
    	marcoBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoBotones extends JFrame  {
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}

class LaminaBotones extends JPanel {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(azul);
		botonRojo.addActionListener(rojo);
		botonAmarillo.addActionListener(amarillo);
	}
	
	private class ColorFondo implements ActionListener {
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo=c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
			
		}
		
	}
	
	// VIDEO 68
	

}





