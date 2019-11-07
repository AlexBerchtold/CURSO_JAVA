package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class JDialogGenerico extends JDialog {
	private BotonesJtollsbarPersonalizados btnsjtlsbrprsnlzdsNuevo;
	private BotonesJtollsbarPersonalizados btnsjtlsbrprsnlzdsModificar;
	private BotonesJtollsbarPersonalizados btnsjtlsbrprsnlzdsEliminar;
	private BotonesJtollsbarPersonalizados btnsjtlsbrprsnlzdsSalir;
	private JTable table;
	private JPanel jPanelFormulario;
	private JtextFieldPersonalizado tfBuscador;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogGenerico dialog = new JDialogGenerico();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JDialogGenerico() {
		setBounds(100, 100, 800, 600);
		setResizable(false);
		setLocationRelativeTo(this);
		setModal(true);
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(12, 25, 400, 67);
		getContentPane().add(toolBar);
		
		btnsjtlsbrprsnlzdsNuevo = new BotonesJtollsbarPersonalizados();
		btnsjtlsbrprsnlzdsNuevo.setText("Nuevo");
		toolBar.add(btnsjtlsbrprsnlzdsNuevo);
		
		btnsjtlsbrprsnlzdsModificar = new BotonesJtollsbarPersonalizados();
		btnsjtlsbrprsnlzdsModificar.setText("Modificar");
		toolBar.add(btnsjtlsbrprsnlzdsModificar);
		
		btnsjtlsbrprsnlzdsEliminar = new BotonesJtollsbarPersonalizados();
		btnsjtlsbrprsnlzdsEliminar.setText("Eliminar");
		toolBar.add(btnsjtlsbrprsnlzdsEliminar);
		
		btnsjtlsbrprsnlzdsSalir = new BotonesJtollsbarPersonalizados();
		btnsjtlsbrprsnlzdsSalir.setText("Salir");
		toolBar.add(btnsjtlsbrprsnlzdsSalir);
		
		jPanelFormulario = new JPanel();
		jPanelFormulario.setBounds(12, 105, 400, 394);
		getContentPane().add(jPanelFormulario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(424, 105, 358, 394);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(424, 79, 56, 16);
		getContentPane().add(lblBuscar);
		
		tfBuscador = new JtextFieldPersonalizado();
		tfBuscador.setBounds(469, 77, 313, 23);
		getContentPane().add(tfBuscador);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(JDialogGenerico.class.getResource("/py/edu/cursojava/img/cancelar.png")));
		btnCancelar.setBounds(12, 512, 136, 40);
		getContentPane().add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(JDialogGenerico.class.getResource("/py/edu/cursojava/img/guardar.png")));
		btnGuardar.setBounds(284, 512, 128, 40);
		getContentPane().add(btnGuardar);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitulo.setBounds(424, 25, 358, 40);
		getContentPane().add(lblTitulo);

	}
}
