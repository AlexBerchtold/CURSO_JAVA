package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import py.edu.cursojava.componentes.JDialogGenerico;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.FuncionarioController;
import py.edu.cursojava.utilidades.UtilidadesFecha;

public class FuncionarioVentana extends JDialogGenerico {
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
	private JComboBox cbCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioVentana dialog = new FuncionarioVentana();
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
		new FuncionarioController(this);
	}

	/**
	 * Create the dialog.
	 */
	public FuncionarioVentana() {
		setTitle("Funcionarios");
		getLblTitulo().setText("Registros de Funcionarios");
		getjPanelFormulario().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(12, 31, 85, 16);
		getjPanelFormulario().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(12, 68, 85, 16);
		getjPanelFormulario().add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDocumento.setBounds(12, 107, 85, 16);
		getjPanelFormulario().add(lblDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(12, 144, 85, 16);
		getjPanelFormulario().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(12, 184, 85, 16);
		getjPanelFormulario().add(lblEmail);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin.setBounds(12, 224, 85, 16);
		getjPanelFormulario().add(lblDireccin);
		
		JLabel lblFechaReg = new JLabel("Fecha Reg.:");
		lblFechaReg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaReg.setBounds(12, 265, 85, 16);
		getjPanelFormulario().add(lblFechaReg);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 357, 85, 16);
		getjPanelFormulario().add(lblEstado);
		
		tfNombre = new JtextFieldPersonalizado();
		tfNombre.setBounds(105, 28, 283, 22);
		getjPanelFormulario().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JtextFieldPersonalizado();
		tfApellido.setColumns(10);
		tfApellido.setBounds(105, 67, 283, 22);
		getjPanelFormulario().add(tfApellido);
		
		tfDocumento = new JtextFieldPersonalizado();
		tfDocumento.setColumns(10);
		tfDocumento.setBounds(105, 106, 141, 22);
		getjPanelFormulario().add(tfDocumento);
		
		tfTelefono = new JtextFieldPersonalizado();
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(105, 143, 141, 22);
		getjPanelFormulario().add(tfTelefono);
		
		tfEmail = new JtextFieldPersonalizado();
		tfEmail.setColumns(10);
		tfEmail.setBounds(105, 182, 283, 22);
		getjPanelFormulario().add(tfEmail);
		
		tfDireccion = new JtextFieldPersonalizado();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(105, 221, 283, 22);
		getjPanelFormulario().add(tfDireccion);
		
		tfFecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfFecha.setColumns(10);
		tfFecha.setBounds(105, 264, 85, 22);
		getjPanelFormulario().add(tfFecha);
		
		chbEstado = new JCheckBox("Activo");
		chbEstado.setBounds(105, 353, 113, 25);
		getjPanelFormulario().add(chbEstado);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo.setBounds(12, 309, 85, 16);
		getjPanelFormulario().add(lblCargo);
		
		cbCargo = new JComboBox();
		cbCargo.setModel(new DefaultComboBoxModel(new String[] {"Vendedor", "Cajero", "Gerente", "Gerente Ventas"}));
		cbCargo.setBounds(105, 306, 141, 22);
		getjPanelFormulario().add(cbCargo);

	}

	public JComboBox getCbCargo() {
		return cbCargo;
	}

	public void setCbCargo(JComboBox cbCargo) {
		this.cbCargo = cbCargo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
