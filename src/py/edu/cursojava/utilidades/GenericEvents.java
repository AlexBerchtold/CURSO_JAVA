package py.edu.cursojava.utilidades;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;

import py.edu.cursojava.componentes.JtextFieldPersonalizado;

public class GenericEvents {
	
	public static void estadosTexfield(Component component, boolean b) {
        if (component instanceof JtextFieldPersonalizado) {
                JtextFieldPersonalizado text = ((JtextFieldPersonalizado) component);
                text.setEnabled(b);
        } else {
        	if (component instanceof Container) {
        		for (Component c : ((Container) component).getComponents()) {
        			estadosTexfield(c, b);
                }
            }
        }
	}
	
	public static void limpiarFormulario(Component component) {
        if (component instanceof JtextFieldPersonalizado) {
                JtextFieldPersonalizado text = ((JtextFieldPersonalizado) component);
                text.setText("");
        } else {
        	if (component instanceof Container) {
        		for (Component c : ((Container) component).getComponents()) {
        			limpiarFormulario(c);
                }
            }
        }
	}
	
	public static void moverConEnter(KeyEvent evt, Component source) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            source.requestFocus();
        }
    }

}
