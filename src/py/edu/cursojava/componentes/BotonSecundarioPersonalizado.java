package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class BotonSecundarioPersonalizado extends JButton{

	private static final long serialVersionUID = 1L;

	public BotonSecundarioPersonalizado() {
		setForeground(Color.BLACK);
		setHorizontalTextPosition(SwingConstants.RIGHT);
		setVerticalTextPosition(SwingConstants.CENTER);
		setBorderPainted(true);
		setFocusable(false);
		setBorder(new LineBorder(Color.BLACK));
		setMinimumSize(new Dimension(80, 27));
		setMaximumSize(new Dimension(80, 27));
		setOpaque(false);
		
		
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
