package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.ListadoProductoController;

public class ListadoProductoVentana extends JDialog {
	private JtextFieldPersonalizado tfDesde;
	private JTable table;
	private JButton btnImprimir;
	private JtextFieldPersonalizado tfHasta;
	private JButton btnFiltrar;
	private JComboBox cbOrder;
	private JComboBox cbCategoria;
	private JComboBox cbMarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoProductoVentana dialog = new ListadoProductoVentana();
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
		new ListadoProductoController(this);
	}

	/**
	 * Create the dialog.
	 */
	public ListadoProductoVentana() {
		setTitle("Listado de Productos");
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(this);
		setModal(true);
		getContentPane().setLayout(null);
		
		JLabel lblDesdeNombre = new JLabel("Desde:");
		lblDesdeNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesdeNombre.setBounds(12, 34, 67, 16);
		getContentPane().add(lblDesdeNombre);
		
		JLabel lblHastaNombre = new JLabel("Hasta:");
		lblHastaNombre.setBounds(292, 34, 48, 16);
		getContentPane().add(lblHastaNombre);
		
		JLabel lblDesdeApellido = new JLabel("Categoria:");
		lblDesdeApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesdeApellido.setBounds(12, 83, 67, 16);
		getContentPane().add(lblDesdeApellido);
		
		JLabel lblHastaApellido = new JLabel("Marca:");
		lblHastaApellido.setBounds(292, 83, 48, 16);
		getContentPane().add(lblHastaApellido);
		
		tfDesde = new JtextFieldPersonalizado();
		tfDesde.setBounds(91, 32, 116, 22);
		getContentPane().add(tfDesde);
		tfDesde.setColumns(10);
		
		tfHasta = new JtextFieldPersonalizado();
		tfHasta.setColumns(10);
		tfHasta.setBounds(343, 32, 116, 22);
		getContentPane().add(tfHasta);
		
		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		lblOrdenarPor.setBounds(552, 34, 80, 16);
		getContentPane().add(lblOrdenarPor);
		
		cbOrder = new JComboBox();
		cbOrder.setModel(new DefaultComboBoxModel(new String[] {"Id", "Descripcion"}));
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
		
		cbCategoria = new JComboBox();
		cbCategoria.setBounds(91, 80, 116, 22);
		getContentPane().add(cbCategoria);
		
		cbMarca = new JComboBox();
		cbMarca.setBounds(343, 80, 116, 22);
		getContentPane().add(cbMarca);
	}

	public JtextFieldPersonalizado getTfDesde() {
		return tfDesde;
	}

	public void setTfDesde(JtextFieldPersonalizado tfDesde) {
		this.tfDesde = tfDesde;
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

	public JtextFieldPersonalizado getTfHasta() {
		return tfHasta;
	}

	public void setTfHasta(JtextFieldPersonalizado tfHasta) {
		this.tfHasta = tfHasta;
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

	public JComboBox getCbCategoria() {
		return cbCategoria;
	}

	public void setCbCategoria(JComboBox cbCategoria) {
		this.cbCategoria = cbCategoria;
	}

	public JComboBox getCbMarca() {
		return cbMarca;
	}

	public void setCbMarca(JComboBox cbMarca) {
		this.cbMarca = cbMarca;
	}

	
	
}
