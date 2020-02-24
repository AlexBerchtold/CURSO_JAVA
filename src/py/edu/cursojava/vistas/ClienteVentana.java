package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import py.edu.cursojava.componentes.JDialogGenerico;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.ClienteController;
import py.edu.cursojava.utilidades.UtilidadesFecha;

public class ClienteVentana extends JDialogGenerico {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JtextFieldPersonalizado tfNombre;
	private JCheckBox chbEstado;
	private JFormattedTextField tfFecha;
	private JtextFieldPersonalizado tfDireccion;
	private JtextFieldPersonalizado tfEmail;
	private JtextFieldPersonalizado tfTelefono;
	private JtextFieldPersonalizado tfDocumento;
	private JtextFieldPersonalizado tfApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteVentana dialog = new ClienteVentana();
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
		new ClienteController(this);
	}

	/**
	 * Create the dialog.
	 */
	public ClienteVentana() {
		setTitle("Clientes");
		getLblTitulo().setText("Registros de Clientes");
		getjPanelFormulario().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(12, 31, 85, 16);
		getjPanelFormulario().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(12, 74, 85, 16);
		getjPanelFormulario().add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDocumento.setBounds(12, 117, 85, 16);
		getjPanelFormulario().add(lblDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(12, 164, 85, 16);
		getjPanelFormulario().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(12, 207, 85, 16);
		getjPanelFormulario().add(lblEmail);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin.setBounds(12, 246, 85, 16);
		getjPanelFormulario().add(lblDireccin);
		
		JLabel lblFechaReg = new JLabel("Fecha Reg.:");
		lblFechaReg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaReg.setBounds(12, 293, 85, 16);
		getjPanelFormulario().add(lblFechaReg);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 343, 85, 16);
		getjPanelFormulario().add(lblEstado);
		
		tfNombre = new JtextFieldPersonalizado();
		tfNombre.setBounds(105, 28, 283, 22);
		getjPanelFormulario().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JtextFieldPersonalizado();
		tfApellido.setColumns(10);
		tfApellido.setBounds(105, 73, 283, 22);
		getjPanelFormulario().add(tfApellido);
		
		tfDocumento = new JtextFieldPersonalizado();
		tfDocumento.setColumns(10);
		tfDocumento.setBounds(105, 116, 141, 22);
		getjPanelFormulario().add(tfDocumento);
		
		tfTelefono = new JtextFieldPersonalizado();
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(105, 163, 141, 22);
		getjPanelFormulario().add(tfTelefono);
		
		tfEmail = new JtextFieldPersonalizado();
		tfEmail.setColumns(10);
		tfEmail.setBounds(105, 206, 283, 22);
		getjPanelFormulario().add(tfEmail);
		
		tfDireccion = new JtextFieldPersonalizado();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(105, 245, 283, 22);
		getjPanelFormulario().add(tfDireccion);
		
		tfFecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfFecha.setColumns(10);
		tfFecha.setBounds(105, 292, 85, 22);
		getjPanelFormulario().add(tfFecha);
		
		chbEstado = new JCheckBox("Activo");
		chbEstado.setBounds(105, 339, 113, 25);
		getjPanelFormulario().add(chbEstado);

	}

	public JtextFieldPersonalizado getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(JtextFieldPersonalizado tfNombre) {
		this.tfNombre = tfNombre;
	}

	public JCheckBox getChbEstado() {
		return chbEstado;
	}

	public void setChbEstado(JCheckBox chbEstado) {
		this.chbEstado = chbEstado;
	}

	public JFormattedTextField getTfFecha() {
		return tfFecha;
	}

	public void setTfFecha(JFormattedTextField tfFecha) {
		this.tfFecha = tfFecha;
	}

	public JtextFieldPersonalizado getTfDireccion() {
		return tfDireccion;
	}

	public void setTfDireccion(JtextFieldPersonalizado tfDireccion) {
		this.tfDireccion = tfDireccion;
	}

	public JtextFieldPersonalizado getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(JtextFieldPersonalizado tfEmail) {
		this.tfEmail = tfEmail;
	}

	public JtextFieldPersonalizado getTfTelefono() {
		return tfTelefono;
	}

	public void setTfTelefono(JtextFieldPersonalizado tfTelefono) {
		this.tfTelefono = tfTelefono;
	}

	public JtextFieldPersonalizado getTfDocumento() {
		return tfDocumento;
	}

	public void setTfDocumento(JtextFieldPersonalizado tfDocumento) {
		this.tfDocumento = tfDocumento;
	}

	public JtextFieldPersonalizado getTfApellido() {
		return tfApellido;
	}

	public void setTfApellido(JtextFieldPersonalizado tfApellido) {
		this.tfApellido = tfApellido;
	}
	
}
