package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import py.edu.cursojava.componentes.JDialogGenerico;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.MarcaController;

public class MarcaVentana extends JDialogGenerico {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JtextFieldPersonalizado tfId;
	private JCheckBox chbEstado;
	private JtextFieldPersonalizado tfDescripción;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarcaVentana dialog = new MarcaVentana();
					dialog.setUpControlador();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setUpControlador() {
		new MarcaController(this);
	}

	/**
	 * Create the dialog.
	 */
	public MarcaVentana() {
		setTitle("Marcas");
		getLblTitulo().setText("Registros de Marcas");
		getjPanelFormulario().setLayout(null);
		
		JLabel lblId = new JLabel("C\u00F3digo:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(12, 31, 85, 16);
		getjPanelFormulario().add(lblId);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcion.setBounds(12, 126, 85, 16);
		getjPanelFormulario().add(lblDescripcion);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 233, 85, 16);
		getjPanelFormulario().add(lblEstado);
		
		tfId = new JtextFieldPersonalizado();
		tfId.setEditable(false);
		tfId.setBounds(105, 28, 85, 22);
		getjPanelFormulario().add(tfId);
		tfId.setColumns(10);
		
		tfDescripción = new JtextFieldPersonalizado();
		tfDescripción.setColumns(10);
		tfDescripción.setBounds(105, 125, 283, 22);
		getjPanelFormulario().add(tfDescripción);
		
		chbEstado = new JCheckBox("Activo");
		chbEstado.setBounds(105, 229, 113, 25);
		getjPanelFormulario().add(chbEstado);

	}

	public JtextFieldPersonalizado getTfId() {
		return tfId;
	}

	public void setTfId(JtextFieldPersonalizado tfId) {
		this.tfId = tfId;
	}

	public JCheckBox getChbEstado() {
		return chbEstado;
	}

	public void setChbEstado(JCheckBox chbEstado) {
		this.chbEstado = chbEstado;
	}

	public JtextFieldPersonalizado getTfDescripción() {
		return tfDescripción;
	}

	public void setTfDescripción(JtextFieldPersonalizado tfDescripción) {
		this.tfDescripción = tfDescripción;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
