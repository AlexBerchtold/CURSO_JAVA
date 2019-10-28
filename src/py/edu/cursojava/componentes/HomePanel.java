package py.edu.cursojava.componentes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class HomePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	URL url = getClass().getResource("/py/edu/cursojava/imagenes/fondo.png");
	Image image = new ImageIcon(url).getImage();
	
	
	//pasa la imagen a la pantalla
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paintComponent(g);
	}

}
