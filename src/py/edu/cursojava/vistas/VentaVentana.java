package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import py.edu.cursojava.componentes.BotonesPrincipales;
import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.VentaController;
import py.edu.cursojava.utilidades.UtilidadesFecha;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentaVentana extends JDialog {
	private JTable table;
	private JLabel lblTotal;
	private JButton btnCancelar;
	private JButton btnFinalizar;
	private JButton btnProducto;
	private JtextFieldPersonalizado tfCodigoproducto;
	private JtextFieldPersonalizado tfProducto;
	private JSpinner tfCantidad;
	private JButton btnAnadir;
	private JButton btnQuitar;
	private JtextFieldPersonalizado tfCedulaCliente;
	private JtextFieldPersonalizado tfCliente;
	private JButton btnCliente;
	private JButton btnFuncionario;
	private JtextFieldPersonalizado tfFuncionario;
	private JtextFieldPersonalizado tfCodigoFuncionario;
	private BotonesPrincipales btnNuevo;
	private BotonesPrincipales btnAnular;
	private BotonesPrincipales btnSalir;
	private VentaController ventaController;
	private JtextFieldPersonalizado tfNumero;
	private JFormattedTextField tfFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaVentana dialog = new VentaVentana();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setUpController();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setUpController() {
		new VentaController(this);
	}

	/**
	 * Create the dialog.
	 */
	public VentaVentana() {
		setTitle("Ventas");
		setBounds(100, 100, 950, 800);
		getContentPane().setLayout(null);
		
		btnNuevo = new BotonesPrincipales();
		btnNuevo.setLocation(545, 13);
		btnNuevo.setText("Nuevo");
		getContentPane().add(btnNuevo);
		
		btnSalir = new BotonesPrincipales();
		btnSalir.setText("Salir");
		btnSalir.setBounds(820, 13, 100, 100);
		getContentPane().add(btnSalir);
		
		btnAnular = new BotonesPrincipales();
		btnAnular.setText("Anular");
		btnAnular.setBounds(688, 13, 100, 100);
		getContentPane().add(btnAnular);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(12, 13, 71, 16);
		getContentPane().add(lblNumero);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFecha.setBounds(12, 51, 71, 16);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Funcionario:");
		lblHora.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHora.setBounds(0, 95, 83, 16);
		getContentPane().add(lblHora);
		
		tfNumero = new JtextFieldPersonalizado();
		tfNumero.setBounds(94, 11, 116, 22);
		getContentPane().add(tfNumero);
		tfNumero.setColumns(10);
		
		tfFecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfFecha.setBounds(95, 48, 115, 22);
		getContentPane().add(tfFecha);
		tfFecha.setColumns(10);
		
		tfFuncionario = new JtextFieldPersonalizado();
		tfFuncionario.setEditable(false);
		tfFuncionario.setColumns(10);
		tfFuncionario.setBounds(166, 91, 283, 22);
		getContentPane().add(tfFuncionario);
		
		btnFuncionario = new JButton("...");
		btnFuncionario.setBounds(461, 88, 53, 25);
		getContentPane().add(btnFuncionario);
		
		tfCodigoFuncionario = new JtextFieldPersonalizado();
		tfCodigoFuncionario.setColumns(10);
		tfCodigoFuncionario.setBounds(95, 91, 59, 22);
		getContentPane().add(tfCodigoFuncionario);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCliente.setBounds(0, 144, 83, 16);
		getContentPane().add(lblCliente);
		
		tfCliente = new JtextFieldPersonalizado();
		tfCliente.setEditable(false);
		tfCliente.setColumns(10);
		tfCliente.setBounds(215, 143, 283, 22);
		getContentPane().add(tfCliente);
		
		tfCedulaCliente = new JtextFieldPersonalizado();
		tfCedulaCliente.setColumns(10);
		tfCedulaCliente.setBounds(94, 143, 116, 22);
		getContentPane().add(tfCedulaCliente);
		
		btnCliente = new JButton("...");
		btnCliente.setBounds(510, 141, 53, 25);
		getContentPane().add(btnCliente);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 175, 908, 16);
		getContentPane().add(separator);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProducto.setBounds(1, 202, 83, 16);
		getContentPane().add(lblProducto);
		
		tfCodigoproducto = new JtextFieldPersonalizado();
		tfCodigoproducto.setColumns(10);
		tfCodigoproducto.setBounds(159, 201, 116, 22);
		getContentPane().add(tfCodigoproducto);
		
		tfProducto = new JtextFieldPersonalizado();
		tfProducto.setEditable(false);
		tfProducto.setColumns(10);
		tfProducto.setBounds(285, 201, 283, 22);
		getContentPane().add(tfProducto);
		
		btnProducto = new JButton("...");
		btnProducto.setBounds(94, 200, 53, 25);
		getContentPane().add(btnProducto);
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(724, 198, 92, 25);
		getContentPane().add(btnAnadir);
		
		btnQuitar = new JButton("Quitar");
		btnQuitar.setBounds(828, 198, 92, 25);
		getContentPane().add(btnQuitar);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(580, 202, 56, 16);
		getContentPane().add(lblCantidad);
		
		tfCantidad = new JSpinner();
		tfCantidad.setBounds(644, 200, 64, 22);
		getContentPane().add(tfCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 244, 908, 417);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(466, 680, 97, 60);
		getContentPane().add(btnCancelar);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(823, 680, 97, 60);
		getContentPane().add(btnFinalizar);
		
		JLabel JlabelTotal = new JLabel("Total:");
		JlabelTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		JlabelTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JlabelTotal.setBounds(12, 680, 83, 60);
		getContentPane().add(JlabelTotal);
		
		lblTotal = new JLabel("0,0");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTotal.setBounds(108, 680, 180, 60);
		getContentPane().add(lblTotal);

	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JLabel getLblTotal() {
		return lblTotal;
	}

	public void setLblTotal(JLabel lblTotal) {
		this.lblTotal = lblTotal;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public void setBtnFinalizar(JButton btnFinalizar) {
		this.btnFinalizar = btnFinalizar;
	}

	public JButton getBtnProducto() {
		return btnProducto;
	}

	public void setBtnProducto(JButton btnProducto) {
		this.btnProducto = btnProducto;
	}

	public JtextFieldPersonalizado getTfCodigoproducto() {
		return tfCodigoproducto;
	}

	public void setTfCodigoproducto(JtextFieldPersonalizado tfCodigoproducto) {
		this.tfCodigoproducto = tfCodigoproducto;
	}

	public JtextFieldPersonalizado getTfProducto() {
		return tfProducto;
	}

	public void setTfProducto(JtextFieldPersonalizado tfProducto) {
		this.tfProducto = tfProducto;
	}

	public JSpinner getTfCantidad() {
		return tfCantidad;
	}

	public void setTfCantidad(JSpinner tfCantidad) {
		this.tfCantidad = tfCantidad;
	}

	public JButton getBtnAnadir() {
		return btnAnadir;
	}

	public void setBtnAnadir(JButton btnAnadir) {
		this.btnAnadir = btnAnadir;
	}

	public JButton getBtnQuitar() {
		return btnQuitar;
	}

	public void setBtnQuitar(JButton btnQuitar) {
		this.btnQuitar = btnQuitar;
	}

	public JtextFieldPersonalizado getTfCedulaCliente() {
		return tfCedulaCliente;
	}

	public void setTfCedulaCliente(JtextFieldPersonalizado tfCedulaCliente) {
		this.tfCedulaCliente = tfCedulaCliente;
	}

	public JtextFieldPersonalizado getTfCliente() {
		return tfCliente;
	}

	public void setTfCliente(JtextFieldPersonalizado tfCliente) {
		this.tfCliente = tfCliente;
	}

	public JButton getBtnCliente() {
		return btnCliente;
	}

	public void setBtnCliente(JButton btnCliente) {
		this.btnCliente = btnCliente;
	}

	public JButton getBtnFuncionario() {
		return btnFuncionario;
	}

	public void setBtnFuncionario(JButton btnFuncionario) {
		this.btnFuncionario = btnFuncionario;
	}

	public JtextFieldPersonalizado getTfFuncionario() {
		return tfFuncionario;
	}

	public void setTfFuncionario(JtextFieldPersonalizado tfFuncionario) {
		this.tfFuncionario = tfFuncionario;
	}

	public JtextFieldPersonalizado getTfCodigoFuncionario() {
		return tfCodigoFuncionario;
	}

	public void setTfCodigoFuncionario(JtextFieldPersonalizado tfCodigoFuncionario) {
		this.tfCodigoFuncionario = tfCodigoFuncionario;
	}

	public BotonesPrincipales getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(BotonesPrincipales btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public BotonesPrincipales getBtnAnular() {
		return btnAnular;
	}

	public void setBtnAnular(BotonesPrincipales btnAnular) {
		this.btnAnular = btnAnular;
	}

	public BotonesPrincipales getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(BotonesPrincipales btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JtextFieldPersonalizado getTfNumero() {
		return tfNumero;
	}

	public void setTfNumero(JtextFieldPersonalizado tfNumero) {
		this.tfNumero = tfNumero;
	}

	public VentaController getVentaController() {
		return ventaController;
	}

	public void setVentaController(VentaController ventaController) {
		this.ventaController = ventaController;
	}

	public JFormattedTextField getTfFecha() {
		return tfFecha;
	}

	public void setTfFecha(JFormattedTextField tfFecha) {
		this.tfFecha = tfFecha;
	}
	
	
}
