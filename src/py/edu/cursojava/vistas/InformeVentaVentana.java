package py.edu.cursojava.vistas;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import py.edu.cursojava.componentes.JtextFieldPersonalizado;
import py.edu.cursojava.controladores.InformeVentasController;
import py.edu.cursojava.utilidades.UtilidadesFecha;

public class InformeVentaVentana extends JDialog {
	private JtextFieldPersonalizado tfCliente;
	private JTable table;
	private JButton btnImprimir;
	private JtextFieldPersonalizado tfFuncionario;
	private JButton btnFiltrar;
	private JComboBox cbInforme;
	private JFormattedTextField tfDesdefecha, tfHastaFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformeVentaVentana dialog = new InformeVentaVentana();
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
		new InformeVentasController(this);
	}

	/**
	 * Create the dialog.
	 */
	public InformeVentaVentana() {
		setTitle("Informe de Ventas");
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
		
		JLabel lblDesdeApellido = new JLabel("Cliente:");
		lblDesdeApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesdeApellido.setBounds(12, 83, 67, 16);
		getContentPane().add(lblDesdeApellido);
		
		JLabel lblHastaApellido = new JLabel("Funcionario:");
		lblHastaApellido.setBounds(260, 83, 80, 16);
		getContentPane().add(lblHastaApellido);
		
		tfCliente = new JtextFieldPersonalizado();
		tfCliente.setBounds(89, 81, 116, 22);
		getContentPane().add(tfCliente);
		tfCliente.setColumns(10);
		
		tfFuncionario = new JtextFieldPersonalizado();
		tfFuncionario.setColumns(10);
		tfFuncionario.setBounds(341, 81, 116, 22);
		getContentPane().add(tfFuncionario);
		
		JLabel lblOrdenarPor = new JLabel("Tpo de Informe:");
		lblOrdenarPor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrdenarPor.setBounds(526, 34, 106, 16);
		getContentPane().add(lblOrdenarPor);
		
		cbInforme = new JComboBox();
		cbInforme.setModel(new DefaultComboBoxModel(new String[] {"Simples", "Detallado"}));
		cbInforme.setBounds(644, 31, 116, 22);
		getContentPane().add(cbInforme);
		
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
		
		tfDesdefecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfDesdefecha.setBounds(89, 31, 80, 22);
		getContentPane().add(tfDesdefecha);
		tfDesdefecha.setColumns(10);
		
		tfHastaFecha = new JFormattedTextField(UtilidadesFecha.getFormato());
		tfHastaFecha.setColumns(10);
		tfHastaFecha.setBounds(341, 31, 80, 22);
		getContentPane().add(tfHastaFecha);
	}

	public JtextFieldPersonalizado getTfCliente() {
		return tfCliente;
	}

	public JTable getTable() {
		return table;
	}

	public JButton getBtnImprimir() {
		return btnImprimir;
	}

	public JtextFieldPersonalizado getTfFuncionario() {
		return tfFuncionario;
	}

	public JButton getBtnFiltrar() {
		return btnFiltrar;
	}

	public JComboBox getCbInforme() {
		return cbInforme;
	}

	public JFormattedTextField getTfDesdefecha() {
		return tfDesdefecha;
	}

	public JFormattedTextField getTfHastaFecha() {
		return tfHastaFecha;
	}

	
}
