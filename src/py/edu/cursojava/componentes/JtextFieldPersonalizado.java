package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class JtextFieldPersonalizado extends JTextField {

	public JtextFieldPersonalizado() {
		setFont(new Font("Tahoma", Font.BOLD, 11));
		setDisabledTextColor(Color.GRAY);
	}
	
	public void soloNumerosEnteros() {
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())) e.consume();
			}
		});
	}


}
