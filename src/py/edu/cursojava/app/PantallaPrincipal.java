package py.edu.cursojava.app;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import py.edu.cursojava.componentes.JpanelPantallaPrincipal;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import py.edu.cursojava.componentes.BotonesPrincipales;

public class PantallaPrincipal extends JFrame {

	private JpanelPantallaPrincipal contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(1080,720));
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(this);
		setTitle("Ventas Basico Java");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistros = new JMenu("Registros");
		menuBar.add(mnRegistros);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnRegistros.add(mntmCliente);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionario");
		mnRegistros.add(mntmFuncionario);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mnRegistros.add(mntmCategoria);
		
		JMenuItem mntmMarca = new JMenuItem("Marca");
		mnRegistros.add(mntmMarca);
		
		JMenuItem mntmProducto = new JMenuItem("Producto");
		mnRegistros.add(mntmProducto);
		
		JMenu mnMovimiento = new JMenu("Movimiento");
		menuBar.add(mnMovimiento);
		
		JMenuItem mntmVenta = new JMenuItem("Venta");
		mnMovimiento.add(mntmVenta);
		
		JMenu mnListados = new JMenu("Listados");
		menuBar.add(mnListados);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mnListados.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mnListados.add(mntmProductos);
		
		JMenu mnInformes = new JMenu("Informes");
		menuBar.add(mnInformes);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mnInformes.add(mntmVentas);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmDatosDeLa = new JMenuItem("Datos de la Empresa");
		mnConfiguracin.add(mntmDatosDeLa);
		
		JMenuItem mntmInicializacinDeDatos = new JMenuItem("Inicializaci\u00F3n de datos");
		mnConfiguracin.add(mntmInicializacinDeDatos);

		contentPane = new JpanelPantallaPrincipal();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BotonesPrincipales btnsprncplsCliente = new BotonesPrincipales();
		btnsprncplsCliente.setLocation(31, 45);
		btnsprncplsCliente.setText("Cliente");
		contentPane.add(btnsprncplsCliente);
		
		BotonesPrincipales btnsprncplsProducto = new BotonesPrincipales();
		btnsprncplsProducto.setLocation(178, 45);
		btnsprncplsProducto.setText("Producto");
		contentPane.add(btnsprncplsProducto);
		
		BotonesPrincipales btnsprncplsVenta = new BotonesPrincipales();
		btnsprncplsVenta.setLocation(320, 45);
		btnsprncplsVenta.setText("Venta");
		contentPane.add(btnsprncplsVenta);
	}
}
