package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BotonPrincipalesPersonalizados extends JButton{

	private static final long serialVersionUID = 1L;
	public BotonPrincipalesPersonalizados() {
		setMaximumSize(new Dimension(80, 70));
		setForeground(Color.BLACK);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setBorderPainted(false);
		setBackground(new Color(240, 240, 240));
		setOpaque(false);
		setFocusable(false);
	}
	
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	public void setIcono(String nombreIcono){
		try {
			URL url = BotonSecundarioPersonalizado.class.getResource("/py/edu/cursojava/imagenes/"+nombreIcono.toLowerCase()+".png");
			setIcon(new ImageIcon(url));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
