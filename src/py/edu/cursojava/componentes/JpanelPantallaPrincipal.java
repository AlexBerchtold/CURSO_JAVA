package py.edu.cursojava.componentes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JpanelPantallaPrincipal extends JPanel {

	URL url = getClass().getResource("/py/edu/cursojava/img/fondo.png");
	Image image = new ImageIcon(url).getImage();
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paintComponent(g);
	}
}
