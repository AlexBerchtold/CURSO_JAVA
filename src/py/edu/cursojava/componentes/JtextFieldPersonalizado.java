package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

import py.edu.cursojava.utilidades.NumberUtil;
import py.edu.cursojava.utilidades.UpperCaseFilter;

public class JtextFieldPersonalizado extends JTextField{
	private static final long serialVersionUID = 1L;

	public JtextFieldPersonalizado() {
		setFont(new Font("Tahoma", Font.BOLD, 11));
		setDisabledTextColor(Color.GRAY);
		((AbstractDocument) getDocument()).setDocumentFilter(new UpperCaseFilter());
	}

	public void soloNumerosEnteros(){
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		});
	}
	
	public void soloNumeros(){
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				if(getText().isEmpty()) return;
				String t = getText();
				t = t.replace(".", "");
				t = t.replace(",", ".");
				Double d = Double.parseDouble(t);
				setText(NumberUtil.doubleAString(d));
			}
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	}
}
