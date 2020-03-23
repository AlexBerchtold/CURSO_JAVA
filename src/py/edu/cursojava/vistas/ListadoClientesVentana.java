package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.ListadoClienteController;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ListadoClientesVentana extends JDialog {
	private JtextFieldPersonalizado tfDesdeNombre;
	private JTable table;
	private JButton btnImprimir;
	private JtextFieldPersonalizado tfDesdeApellido;
	private JtextFieldPersonalizado tfHastaApellido;
	private JtextFieldPersonalizado tfHastaNombre;
	private JButton btnFiltrar;
	private JComboBox cbOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoClientesVentana dialog = new ListadoClientesVentana();
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
		new ListadoClienteController(this);
	}

	/**
	 * Create the dialog.
	 */
	public ListadoClientesVentana() {
		setTitle("Listado de Clientes");
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(this);
		setModal(true);
		getContentPane().setLayout(null);
		
		JLabel lblDesdeNombre = new JLabel("Desde Nombre:");
		lblDesdeNombre.setBounds(12, 34, 96, 16);
		getContentPane().add(lblDesdeNombre);
		
		JLabel lblHastaNombre = new JLabel("Hasta Nombre:");
		lblHastaNombre.setBounds(292, 34, 96, 16);
		getContentPane().add(lblHastaNombre);
		
		JLabel lblDesdeApellido = new JLabel("Desde Apellido:");
		lblDesdeApellido.setBounds(12, 83, 96, 16);
		getContentPane().add(lblDesdeApellido);
		
		JLabel lblHastaApellido = new JLabel("Hasta Apellido:");
		lblHastaApellido.setBounds(292, 83, 96, 16);
		getContentPane().add(lblHastaApellido);
		
		tfDesdeNombre = new JtextFieldPersonalizado();
		tfDesdeNombre.setBounds(109, 31, 116, 22);
		getContentPane().add(tfDesdeNombre);
		tfDesdeNombre.setColumns(10);
		
		tfDesdeApellido = new JtextFieldPersonalizado();
		tfDesdeApellido.setColumns(10);
		tfDesdeApellido.setBounds(109, 82, 116, 22);
		getContentPane().add(tfDesdeApellido);
		
		tfHastaNombre = new JtextFieldPersonalizado();
		tfHastaNombre.setColumns(10);
		tfHastaNombre.setBounds(385, 32, 116, 22);
		getContentPane().add(tfHastaNombre);
		
		tfHastaApellido = new JtextFieldPersonalizado();
		tfHastaApellido.setColumns(10);
		tfHastaApellido.setBounds(385, 82, 116, 22);
		getContentPane().add(tfHastaApellido);
		
		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		lblOrdenarPor.setBounds(552, 34, 80, 16);
		getContentPane().add(lblOrdenarPor);
		
		cbOrder = new JComboBox();
		cbOrder.setModel(new DefaultComboBoxModel(new String[] {"Id", "Nombre", "Apellido"}));
		cbOrder.setBounds(644, 31, 116, 22);
		getContentPane().add(cbOrder);
		
		btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setBounds(552, 79, 80, 25);
		getContentPane().add(btnFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 122, 758, 360);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setEnabled(false);
		btnImprimir.setBounds(663, 502, 97, 38);
		getContentPane().add(btnImprimir);
	}

	public JtextFieldPersonalizado getTfDesdeNombre() {
		return tfDesdeNombre;
	}

	public void setTfDesdeNombre(JtextFieldPersonalizado tfDesdeNombre) {
		this.tfDesdeNombre = tfDesdeNombre;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public void setBtnImprimir(JButton btnImprimir) {
		this.btnImprimir = btnImprimir;
	}

	public JtextFieldPersonalizado getTfDesdeApellido() {
		return tfDesdeApellido;
	}

	public void setTfDesdeApellido(JtextFieldPersonalizado tfDesdeApellido) {
		this.tfDesdeApellido = tfDesdeApellido;
	}

	public JtextFieldPersonalizado getTfHastaApellido() {
		return tfHastaApellido;
	}

	public void setTfHastaApellido(JtextFieldPersonalizado tfHastaApellido) {
		this.tfHastaApellido = tfHastaApellido;
	}

	public JtextFieldPersonalizado getTfHastaNombre() {
		return tfHastaNombre;
	}

	public void setTfHastaNombre(JtextFieldPersonalizado tfHastaNombre) {
		this.tfHastaNombre = tfHastaNombre;
	}

	public JButton getBtnFiltrar() {
		return btnFiltrar;
	}

	public void setBtnFiltrar(JButton btnFiltrar) {
		this.btnFiltrar = btnFiltrar;
	}

	public JComboBox getCbOrder() {
		return cbOrder;
	}

	public void setCbOrder(JComboBox cbOrder) {
		this.cbOrder = cbOrder;
	}
	
}
