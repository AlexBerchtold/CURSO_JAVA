package py.edu.cursojava.buscadores;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import py.edu.cursojava.dao.MarcaDao;
import py.edu.cursojava.entidades.Marca;
import py.edu.cursojava.interfaces.InterfaceMarca;
import py.edu.cursojava.tablas.ModeloTablaMarca;

public class BuscadorMarca extends JDialog {
	private JTextField tfBuscador;
	private JTable table;
	private MarcaDao dao;
	private List<Marca> marcas;
	private InterfaceMarca interfaceMarca;
	private ModeloTablaMarca modeloTablaMarca;
	
	public void setInterface(InterfaceMarca interfaceMarca) {
		this.interfaceMarca = interfaceMarca;
	}

	/**
	 * Create the dialog.
	 */
	public BuscadorMarca() {
		setTitle("Buscador Marca");
		setBounds(100, 100, 500, 500);
		setModal(true);
		setLocationRelativeTo(this);
		
		tfBuscador = new JTextField();
		tfBuscador.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar()==KeyEvent.VK_ENTER) {
					filtrarCategoria();
				}
			}
		});
		getContentPane().add(tfBuscador, BorderLayout.NORTH);
		tfBuscador.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(424, 105, 358, 394);
		getContentPane().add(scrollPane);
		
		modeloTablaMarca = new ModeloTablaMarca();
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount()==2) {
					seleccionarRegistro(table.getSelectedRow());
				}
			}
		});
		table.setModel(modeloTablaMarca);
		scrollPane.setViewportView(table);
		dao = new MarcaDao();
		filtrarCategoria();
	}
	
	private void filtrarCategoria() {
		marcas = dao.filtrarMarcas(tfBuscador.getText());
		modeloTablaMarca.setLista(marcas);
	}
	
	private void seleccionarRegistro(int index) {
		if(index<0) return;
		interfaceMarca.seleccionarMarca(marcas.get(index));
		dispose();
	}
	
	

}
