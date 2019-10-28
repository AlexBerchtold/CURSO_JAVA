package py.edu.cursojava.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import py.edu.cursojava.componentes.BotonPrincipalesPersonalizados;
import py.edu.cursojava.componentes.HomePanel;
import py.edu.cursojava.componentes.JMenuItemPersonalizado;



public class PantallaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private HomePanel contentPane;
	
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
	
	
	public PantallaPrincipal() {
		setMinimumSize(new Dimension(1080, 720));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Curso Java");
		setLocationRelativeTo(this);
		setExtendedState(MAXIMIZED_BOTH);		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistrar = new JMenu("Registros");
		mnRegistrar.setMargin(new Insets(0, 5, 0, 0));
		menuBar.add(mnRegistrar);
		
		JMenuItemPersonalizado mntmprsnlzdCategoria = new JMenuItemPersonalizado();
		mntmprsnlzdCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mntmprsnlzdCategoria.setText("Categoria");
		mnRegistrar.add(mntmprsnlzdCategoria);
		
		JMenuItemPersonalizado mntmprsnlzdCliente = new JMenuItemPersonalizado();
		mntmprsnlzdCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mntmprsnlzdCliente.setText("Cliente");
		mnRegistrar.add(mntmprsnlzdCliente);
		
		JMenuItemPersonalizado mntmprsnlzdFuncionario = new JMenuItemPersonalizado();
		mntmprsnlzdFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmprsnlzdFuncionario.setText("Funcionario");
		mnRegistrar.add(mntmprsnlzdFuncionario);
		
		JMenuItemPersonalizado mntmprsnlzdMarca = new JMenuItemPersonalizado();
		mntmprsnlzdMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmprsnlzdMarca.setText("Marca");
		mnRegistrar.add(mntmprsnlzdMarca);
		
		JMenuItemPersonalizado mntmprsnlzdProducto = new JMenuItemPersonalizado();
		mntmprsnlzdProducto.setText("Producto");
		mnRegistrar.add(mntmprsnlzdProducto);
		
		JMenu mnAsinganicn = new JMenu("Transacciones");
		mnAsinganicn.setMargin(new Insets(0, 5, 0, 0));
		menuBar.add(mnAsinganicn);
		
		JMenuItemPersonalizado mntmprsnlzdVenta = new JMenuItemPersonalizado();
		mntmprsnlzdVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntmprsnlzdVenta.setText("Venta");
		mnAsinganicn.add(mntmprsnlzdVenta);
		
		JMenu mnTransaccin = new JMenu("Listados");
		mnTransaccin.setMargin(new Insets(0, 5, 0, 0));
		menuBar.add(mnTransaccin);
		
		JMenuItemPersonalizado mntmprsnlzdClientes = new JMenuItemPersonalizado();
		mntmprsnlzdClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mntmprsnlzdClientes.setText("Clientes");
		mnTransaccin.add(mntmprsnlzdClientes);
		
		JMenuItemPersonalizado mntmprsnlzdFuncionarios = new JMenuItemPersonalizado();
		mntmprsnlzdFuncionarios.setText("Funcionarios");
		mnTransaccin.add(mntmprsnlzdFuncionarios);
		
		JMenuItemPersonalizado mntmprsnlzdProductos = new JMenuItemPersonalizado();
		mntmprsnlzdProductos.setText("Productos");
		mnTransaccin.add(mntmprsnlzdProductos);
		
		JMenu mnGraficos = new JMenu("Informes");
		mnGraficos.setMargin(new Insets(0, 5, 0, 0));
		menuBar.add(mnGraficos);
		
		JMenuItemPersonalizado mitemEstadisticas = new JMenuItemPersonalizado();
		mitemEstadisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mitemEstadisticas.setText("Ventas");
		mnGraficos.add(mitemEstadisticas);
		contentPane = new HomePanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstadisticasActuales = new JLabel("Accesos Rapidos");
		lblEstadisticasActuales.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEstadisticasActuales.setForeground(Color.BLUE);
		lblEstadisticasActuales.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblEstadisticasActuales.setBounds(10, 11, 196, 25);
		contentPane.add(lblEstadisticasActuales);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 435, 11);
		contentPane.add(separator);
		
		BotonPrincipalesPersonalizados btnClientes = new BotonPrincipalesPersonalizados();
		btnClientes.setText("Cliente");
		btnClientes.setBounds(10, 58, 102, 70);
		contentPane.add(btnClientes);
		setLocationRelativeTo(this);
	}
	
	
}
