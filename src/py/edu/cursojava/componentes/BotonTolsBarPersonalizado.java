package py.edu.cursojava.componentes;

import java.awt.Dimension;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BotonTolsBarPersonalizado extends JButton{
	
	private static final long serialVersionUID = -5135218231501823013L;

	public BotonTolsBarPersonalizado(){
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setMinimumSize(new Dimension(70, 70));
		setMaximumSize(new Dimension(70, 70));
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setFocusPainted(false);
	}
	public void setText(String text) {
		setIcono(text);
		super.setText(text);
	}
	
	public void setIcono(String nombreIcono){
		try {
			URL url = BotonTolsBarPersonalizado.class.getResource("/py/edu/cursojava/imagenes/"+nombreIcono.toLowerCase()+".png");
			setIcon(new ImageIcon(url));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
