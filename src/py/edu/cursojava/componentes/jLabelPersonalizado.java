package py.edu.cursojava.componentes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class jLabelPersonalizado extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public jLabelPersonalizado(String string) {
		setHorizontalAlignment(RIGHT);
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setMinimumSize(new Dimension(30,16));
		setText(string);
	}

}
