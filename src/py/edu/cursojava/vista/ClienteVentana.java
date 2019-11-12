package py.edu.cursojava.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import py.edu.cursojava.componentes.JDialogGenerico;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.ClienteController;
import py.edu.cursojava.utilidades.UtilidadesFecha;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class ClienteVentana extends JDialogGenerico {

	private final JPanel contentPanel = new JPanel();
	private JtextFieldPersonalizado tfNombre;
	private JRadioButton rdbActivo;
	private JtextFieldPersonalizado tfDireccion;
	private JtextFieldPersonalizado tfEmail;
	private JtextFieldPersonalizado tfTelefono;
	private JtextFieldPersonalizado tfDocumento;
	private JtextFieldPersonalizado tfApellido;
	private JFormattedTextField tfFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ClienteVentana dialog = new ClienteVentana();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setupControlador();
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setupControlador() {
		new ClienteController(this);
	}

	/**
	 * Create the dialog.
	 */
	public ClienteVentana() {
		getLblTitulo().setText("Registros de Clientes");
		setTitle("Clientes");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		getjPanelFormulario().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(12, 28, 85, 16);
		getjPanelFormulario().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(12, 77, 85, 16);
		getjPanelFormulario().add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDocumento.setBounds(12, 127, 85, 16);
		getjPanelFormulario().add(lblDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(12, 179, 85, 16);
		getjPanelFormulario().add(lblTelefono);
		
		JLabel lblDireccin = new JLabel("Email:");
		lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin.setBounds(12, 223, 85, 16);
		getjPanelFormulario().add(lblDireccin);
		
		JLabel lblDireccin_1 = new JLabel("Direcci\u00F3n:");
		lblDireccin_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin_1.setBounds(12, 269, 85, 16);
		getjPanelFormulario().add(lblDireccin_1);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 353, 85, 16);
		getjPanelFormulario().add(lblEstado);
		
		tfNombre = new JtextFieldPersonalizado();
		tfNombre.setBounds(107, 25, 281, 22);
		getjPanelFormulario().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JtextFieldPersonalizado();
		tfApellido.setColumns(10);
		tfApellido.setBounds(107, 75, 281, 22);
		getjPanelFormulario().add(tfApellido);
		
		tfDocumento = new JtextFieldPersonalizado();
		tfDocumento.setColumns(10);
		tfDocumento.setBounds(107, 126, 139, 22);
		getjPanelFormulario().add(tfDocumento);
		
		tfTelefono = new JtextFieldPersonalizado();
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(107, 178, 139, 22);
		getjPanelFormulario().add(tfTelefono);
		
		tfEmail = new JtextFieldPersonalizado();
		tfEmail.setColumns(10);
		tfEmail.setBounds(107, 222, 281, 22);
		getjPanelFormulario().add(tfEmail);
		
		tfDireccion = new JtextFieldPersonalizado();
		tfDireccion.setColumns(10);
		tfDireccion.setBounds(107, 268, 281, 22);
		getjPanelFormulario().add(tfDireccion);
		
		rdbActivo = new JRadioButton("Activo");
		rdbActivo.setBounds(105, 349, 127, 25);
		getjPanelFormulario().add(rdbActivo);
		
		JLabel lblFechaReg = new JLabel("Fecha Reg.:");
		lblFechaReg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaReg.setBounds(12, 316, 85, 16);
		getjPanelFormulario().add(lblFechaReg);
		
		tfFecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfFecha.setBounds(107, 312, 85, 22);
		getjPanelFormulario().add(tfFecha);
		tfFecha.setColumns(10);
	}

	public JtextFieldPersonalizado getTfNombre() {
		return tfNombre;
	}

	public void setTfNombre(JtextFieldPersonalizado tfNombre) {
		this.tfNombre = tfNombre;
	}

	public JRadioButton getRdbActivo() {
		return rdbActivo;
	}

	public void setRdbActivo(JRadioButton rdbActivo) {
		this.rdbActivo = rdbActivo;
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

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JFormattedTextField getTfFecha() {
		return tfFecha;
	}

	public void setTfFecha(JFormattedTextField tfFecha) {
		this.tfFecha = tfFecha;
	}
	
}
