package py.edu.cursojava.componentes;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

public class JMenuItemPersonalizado extends JMenuItem{

	private static final long serialVersionUID = 1L;

	//caracteristicas del boton
	public JMenuItemPersonalizado() {
		//setMaximumSize(new Dimension(200, 200));
		setOpaque(false);
	}
	
	//metodo para setear la imagen de icono
	public void setIcon(String icono){
		setIcon(new ImageIcon(JMenuItemPersonalizado.class.getResource("/py/edu/cursojava/imagenes/"+icono+".png")));
	}

}
