package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

import py.edu.cursojava.utilidades.UtilidadesNumeros;

public class JtextFieldPersonalizado extends JTextField {
	
	private  DecimalFormat df = new DecimalFormat("#,###");

	public JtextFieldPersonalizado() {
		setFont(new Font("Tahoma", Font.BOLD, 11));
		setDisabledTextColor(Color.GRAY);
	}
	
	public void soloNumerosEnteros() {
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())) e.consume();
			}
		});
	}
	
	public void separarMiles(){
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				if(getText().isEmpty()){
					return;
				}
				setText(df.format(Integer.valueOf(getText().replace(".", "").replace(",", ""))) );
			}
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) && c!=',') {
					e.consume();
				}
			}
		});
	}


}
