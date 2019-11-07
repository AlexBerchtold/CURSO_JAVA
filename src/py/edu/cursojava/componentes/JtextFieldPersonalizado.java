package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class JtextFieldPersonalizado extends JTextField {

	public JtextFieldPersonalizado() {
		setFont(new Font("Tahoma", Font.BOLD, 11));
		setDisabledTextColor(Color.GRAY);
	}
	
	
	
	

}
