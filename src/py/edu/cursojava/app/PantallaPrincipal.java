package py.edu.cursojava.app;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import py.edu.cursojava.componentes.BotonesPrincipales;
import py.edu.cursojava.componentes.JpanelPantallaPrincipal;
import py.edu.cursojava.dao.CategoriaDao;
import py.edu.cursojava.dao.ClienteDao;
import py.edu.cursojava.dao.FuncionarioDao;
import py.edu.cursojava.dao.MarcaDao;
import py.edu.cursojava.dao.ProductoDao;
import py.edu.cursojava.dao.VentaDao;
import py.edu.cursojava.vistas.CategoriaVentana;
import py.edu.cursojava.vistas.ClienteVentana;
import py.edu.cursojava.vistas.FuncionarioVentana;
import py.edu.cursojava.vistas.InformeVentaVentana;
import py.edu.cursojava.vistas.ListadoClientesVentana;
import py.edu.cursojava.vistas.ListadoProductoVentana;
import py.edu.cursojava.vistas.MarcaVentana;
import py.edu.cursojava.vistas.ProductoVentana;
import py.edu.cursojava.vistas.VentaVentana;

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
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirCliente();
			}
		});
		mnRegistros.add(mntmCliente);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionario");
		mntmFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFuncionario();
			}
		});
		mnRegistros.add(mntmFuncionario);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirCategoria();
			}
		});
		mnRegistros.add(mntmCategoria);
		
		JMenuItem mntmMarca = new JMenuItem("Marca");
		mntmMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirMarca();
			}
		});
		mnRegistros.add(mntmMarca);
		
		JMenuItem mntmProducto = new JMenuItem("Producto");
		mntmProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirProducto();
			}
		});
		mnRegistros.add(mntmProducto);
		
		JMenu mnMovimiento = new JMenu("Movimiento");
		menuBar.add(mnMovimiento);
		
		JMenuItem mntmVenta = new JMenuItem("Venta");
		mntmVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVenta();
			}
		});
		mnMovimiento.add(mntmVenta);
		
		JMenu mnListados = new JMenu("Listados");
		menuBar.add(mnListados);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirListadoCliente();
			}
		});
		mnListados.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirListadoProducto();
			}
		});
		mnListados.add(mntmProductos);
		
		JMenu mnInformes = new JMenu("Informes");
		menuBar.add(mnInformes);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mntmVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirInformeVenta();
			}
		});
		mnInformes.add(mntmVentas);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmDatosDeLa = new JMenuItem("Datos de la Empresa");
		mnConfiguracin.add(mntmDatosDeLa);
		
		JMenuItem mntmInicializacinDeDatos = new JMenuItem("Inicializaci\u00F3n de datos");
		mntmInicializacinDeDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inizializarBaseDatos();
			}
		});
		mnConfiguracin.add(mntmInicializacinDeDatos);

		contentPane = new JpanelPantallaPrincipal();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BotonesPrincipales btnsprncplsCliente = new BotonesPrincipales();
		btnsprncplsCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirCliente();
			}
		});
		btnsprncplsCliente.setLocation(31, 45);
		btnsprncplsCliente.setText("Cliente");
		contentPane.add(btnsprncplsCliente);
		
		BotonesPrincipales btnsprncplsProducto = new BotonesPrincipales();
		btnsprncplsProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirProducto();
			}
		});
		btnsprncplsProducto.setLocation(178, 45);
		btnsprncplsProducto.setText("Producto");
		contentPane.add(btnsprncplsProducto);
		
		BotonesPrincipales btnsprncplsVenta = new BotonesPrincipales();
		btnsprncplsVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVenta();
			}
		});
		btnsprncplsVenta.setLocation(320, 45);
		btnsprncplsVenta.setText("Venta");
		contentPane.add(btnsprncplsVenta);
	}
	
	private void abrirProducto() {
		ProductoVentana productoVentana = new ProductoVentana();
		productoVentana.setUpController();
		productoVentana.setVisible(true);
	}
	
	private void abrirCategoria() {
		CategoriaVentana categoriaVentana = new CategoriaVentana();
		categoriaVentana.setUpController();
		categoriaVentana.setVisible(true);
	}
	
	private void abrirMarca() {
		MarcaVentana marcaVentana = new MarcaVentana();
		marcaVentana.setUpControlador();
		marcaVentana.setVisible(true);
	}
	
	private void abrirCliente() {
		ClienteVentana clienteVentana = new ClienteVentana();
		clienteVentana.setUpControlador();
		clienteVentana.setVisible(true);
	}
	
	private void abrirFuncionario() {
		FuncionarioVentana funcionarioVentana = new FuncionarioVentana();
		funcionarioVentana.setUpControlador();
		funcionarioVentana.setVisible(true);
	}
	
	private void abrirVenta() {
		VentaVentana ventaVentana = new VentaVentana();
		ventaVentana.setUpController();
		ventaVentana.setVisible(true);
	}
	
	private void abrirListadoProducto() {
		ListadoProductoVentana listadoProductoVentana = new ListadoProductoVentana();
		listadoProductoVentana.setUpController();
		listadoProductoVentana.setVisible(true);
	}
	
	private void abrirListadoCliente() {
		ListadoClientesVentana clientesVentana = new ListadoClientesVentana();
		clientesVentana.setUpController();
		clientesVentana.setVisible(true);
	}
	
	private void abrirInformeVenta() {
		InformeVentaVentana informeVentaVentana = new InformeVentaVentana();
		informeVentaVentana.setUpController();
		informeVentaVentana.setVisible(true);
	}
	
	private void inizializarBaseDatos() {
		int respuesta = JOptionPane.showConfirmDialog(null, "Deseas inicializar los datos?");
		if (respuesta==JOptionPane.YES_OPTION) {
			VentaDao ventaDao = new VentaDao();
			ventaDao.inizializarTabla("tb_ventas");
			ventaDao.commit();
			
			ProductoDao productoDao = new ProductoDao();
			productoDao.inizializarTabla("tb_productos");
			productoDao.commit();
			
			ClienteDao clienteDao = new ClienteDao();
			clienteDao.inizializarTabla("tb_clientes");
			clienteDao.commit();
			
			MarcaDao marcaDao = new MarcaDao();
			marcaDao.inizializarTabla("tb_marcas");
			marcaDao.commit();
			
			CategoriaDao categoriaDao = new CategoriaDao();
			categoriaDao.inizializarTabla("tb_categorias");
			categoriaDao.commit();
			
			FuncionarioDao funcionarioDao = new FuncionarioDao();
			funcionarioDao.inizializarTabla("tb_funcionarios");
			funcionarioDao.commit();
			
			
		}
	}
	
	
}
