package py.edu.cursojava.vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.postgresql.core.SetupQueryRunner;

import py.edu.cursojava.componentes.JDialogGenerico;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.ProductoController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductoVentana extends JDialogGenerico {

	private final JPanel contentPanel = new JPanel();
	private JtextFieldPersonalizado tfCategoria;
	private JtextFieldPersonalizado tfMarca;
	private JButton btnMarca;
	private JButton btnCategoria;
	private JtextFieldPersonalizado tfCodigo;
	private JtextFieldPersonalizado tfDescripcion;
	private JtextFieldPersonalizado tfExistencia;
	private JtextFieldPersonalizado tfCompra;
	private JtextFieldPersonalizado tfVenta;
	private JRadioButton rdbtnActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProductoVentana dialog = new ProductoVentana();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setUpController();
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setUpController() {
		new ProductoController(this);
	}

	/**
	 * Create the dialog.
	 */
	public ProductoVentana() {
		setTitle("Productos");
		getLblTitulo().setText("Registros de productos");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		getjPanelFormulario().setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setBounds(12, 13, 91, 16);
		getjPanelFormulario().add(lblCategoria);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setBounds(12, 52, 91, 16);
		getjPanelFormulario().add(lblMarca);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdigo.setBounds(12, 92, 91, 16);
		getjPanelFormulario().add(lblCdigo);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcin.setBounds(12, 136, 91, 16);
		getjPanelFormulario().add(lblDescripcin);
		
		JLabel lblExistencia = new JLabel("Existencia:");
		lblExistencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblExistencia.setBounds(12, 175, 91, 16);
		getjPanelFormulario().add(lblExistencia);
		
		JLabel lblCompra = new JLabel("Compra:");
		lblCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCompra.setBounds(12, 221, 91, 16);
		getjPanelFormulario().add(lblCompra);
		
		JLabel lblVenta = new JLabel("Venta:");
		lblVenta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVenta.setBounds(12, 270, 91, 16);
		getjPanelFormulario().add(lblVenta);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 317, 91, 16);
		getjPanelFormulario().add(lblEstado);
		
		tfCategoria = new JtextFieldPersonalizado();
		tfCategoria.setEditable(false);
		tfCategoria.setBounds(111, 10, 221, 22);
		getjPanelFormulario().add(tfCategoria);
		tfCategoria.setColumns(10);
		
		tfMarca = new JtextFieldPersonalizado();
		tfMarca.setEditable(false);
		tfMarca.setColumns(10);
		tfMarca.setBounds(111, 51, 221, 22);
		getjPanelFormulario().add(tfMarca);
		
		tfCodigo = new JtextFieldPersonalizado();
		tfCodigo.setColumns(10);
		tfCodigo.setBounds(111, 91, 277, 22);
		getjPanelFormulario().add(tfCodigo);
		
		tfDescripcion = new JtextFieldPersonalizado();
		tfDescripcion.setColumns(10);
		tfDescripcion.setBounds(111, 135, 277, 22);
		getjPanelFormulario().add(tfDescripcion);
		
		tfExistencia = new JtextFieldPersonalizado();
		tfExistencia.setColumns(10);
		tfExistencia.setBounds(111, 174, 116, 22);
		tfExistencia.soloNumerosEnteros();
		getjPanelFormulario().add(tfExistencia);
		
		tfCompra = new JtextFieldPersonalizado();
		tfCompra.setColumns(10);
		tfCompra.setBounds(111, 220, 116, 22);
		tfCompra.separarMiles();
		getjPanelFormulario().add(tfCompra);
		
		tfVenta = new JtextFieldPersonalizado();
		tfVenta.setColumns(10);
		tfVenta.setBounds(111, 269, 116, 22);
		tfVenta.separarMiles();
		getjPanelFormulario().add(tfVenta);
		
		rdbtnActivo = new JRadioButton("Activo");
		rdbtnActivo.setBounds(111, 313, 127, 25);
		getjPanelFormulario().add(rdbtnActivo);
		
		btnCategoria = new JButton("...");
		btnCategoria.setBounds(344, 9, 44, 25);
		getjPanelFormulario().add(btnCategoria);
		
		btnMarca = new JButton("...");
		btnMarca.setBounds(344, 48, 44, 25);
		getjPanelFormulario().add(btnMarca);
	}

	public JtextFieldPersonalizado getTfCategoria() {
		return tfCategoria;
	}

	public void setTfCategoria(JtextFieldPersonalizado tfCategoria) {
		this.tfCategoria = tfCategoria;
	}

	public JtextFieldPersonalizado getTfMarca() {
		return tfMarca;
	}

	public void setTfMarca(JtextFieldPersonalizado tfMarca) {
		this.tfMarca = tfMarca;
	}

	public JButton getBtnMarca() {
		return btnMarca;
	}

	public void setBtnMarca(JButton btnMarca) {
		this.btnMarca = btnMarca;
	}

	public JButton getBtnCategoria() {
		return btnCategoria;
	}

	public void setBtnCategoria(JButton btnCategoria) {
		this.btnCategoria = btnCategoria;
	}

	public JtextFieldPersonalizado getTfCodigo() {
		return tfCodigo;
	}

	public void setTfCodigo(JtextFieldPersonalizado tfCodigo) {
		this.tfCodigo = tfCodigo;
	}

	public JtextFieldPersonalizado getTfDescripcion() {
		return tfDescripcion;
	}

	public void setTfDescripcion(JtextFieldPersonalizado tfDescripcion) {
		this.tfDescripcion = tfDescripcion;
	}

	public JtextFieldPersonalizado getTfExistencia() {
		return tfExistencia;
	}

	public void setTfExistencia(JtextFieldPersonalizado tfExistencia) {
		this.tfExistencia = tfExistencia;
	}

	public JtextFieldPersonalizado getTfCompra() {
		return tfCompra;
	}

	public void setTfCompra(JtextFieldPersonalizado tfCompra) {
		this.tfCompra = tfCompra;
	}

	public JtextFieldPersonalizado getTfVenta() {
		return tfVenta;
	}

	public void setTfVenta(JtextFieldPersonalizado tfVenta) {
		this.tfVenta = tfVenta;
	}

	public JRadioButton getRdbtnActivo() {
		return rdbtnActivo;
	}

	public void setRdbtnActivo(JRadioButton rdbtnActivo) {
		this.rdbtnActivo = rdbtnActivo;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}
	
}
