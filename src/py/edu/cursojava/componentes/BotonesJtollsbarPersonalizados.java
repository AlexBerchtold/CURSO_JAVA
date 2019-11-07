package py.edu.cursojava.componentes;

import java.awt.Font;
import java.awt.Insets;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class BotonesJtollsbarPersonalizados extends JButton {

	public BotonesJtollsbarPersonalizados() {
		setSize(70,70);
		setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalTextPosition(SwingConstants.BOTTOM);
		setFocusPainted(false);
		setFont(new Font("Tahoma", Font.BOLD, 12));
		setMargin(new Insets(2, 20, 2, 20));
	}
	
	public void setText(String string) {
		setIcon(string);
		super.setText(string);
	}
	
	public void setIcon(String nombreIcono) {
		try {
			URL url = BotonesPrincipales.class.getResource("/py/edu/cursojava/img/"+nombreIcono.toLowerCase()+".png");
			setIcon(new ImageIcon(url));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
