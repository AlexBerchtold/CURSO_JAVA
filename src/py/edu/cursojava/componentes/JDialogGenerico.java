package py.edu.cursojava.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import py.edu.cursojava.interfaces.InterfaceAcciones;

public class JDialogGenerico extends JDialog implements ActionListener{
	
	private BotonesJtollsbarPersonalizados btnNuevo;
	private BotonesJtollsbarPersonalizados btnModificar;
	private BotonesJtollsbarPersonalizados btnEliminar;
	private BotonesJtollsbarPersonalizados btnSalir;
	private JTable table;
	private JPanel jPanelFormulario;
	private JtextFieldPersonalizado tfBuscador;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JLabel lblTitulo;
	private InterfaceAcciones interfaceAcciones;
	
	public void setInterfaceAcciones(InterfaceAcciones interfaceAcciones) {
		this.interfaceAcciones=interfaceAcciones;
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
		
		btnNuevo = new BotonesJtollsbarPersonalizados();
		btnNuevo.setText("Nuevo");
		toolBar.add(btnNuevo);
		
		btnModificar = new BotonesJtollsbarPersonalizados();
		btnModificar.setText("Modificar");
		toolBar.add(btnModificar);
		
		btnEliminar = new BotonesJtollsbarPersonalizados();
		btnEliminar.setText("Eliminar");
		toolBar.add(btnEliminar);
		
		btnSalir = new BotonesJtollsbarPersonalizados();
		btnSalir.setText("Salir");
		toolBar.add(btnSalir);
		
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
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(JDialogGenerico.class.getResource("/py/edu/cursojava/img/cancelar.png")));
		btnCancelar.setBounds(12, 512, 136, 40);
		getContentPane().add(btnCancelar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(JDialogGenerico.class.getResource("/py/edu/cursojava/img/guardar.png")));
		btnGuardar.setBounds(284, 512, 128, 40);
		getContentPane().add(btnGuardar);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitulo.setBounds(424, 25, 358, 40);
		getContentPane().add(lblTitulo);
	
		setearEventos();
	}
	
	private void setearEventos() {
		btnNuevo.addActionListener(this);
		btnModificar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnSalir.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnGuardar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Nuevo":
			interfaceAcciones.nuevo();
			break;
		case "Modificar":
			interfaceAcciones.modificar();
			break;
		case "Eliminar":
			interfaceAcciones.eliminar();
			break;
		case "Salir":
			interfaceAcciones.salir();
			break;
		case "Cancelar":
			interfaceAcciones.cancelar();
			break;
		case "Guardar":
			interfaceAcciones.guardar();
			break;
		case "Actualizar":
			interfaceAcciones.actualizar();
			break;
		}
	}

	public BotonesJtollsbarPersonalizados getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(BotonesJtollsbarPersonalizados btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public BotonesJtollsbarPersonalizados getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(BotonesJtollsbarPersonalizados btnModificar) {
		this.btnModificar = btnModificar;
	}

	public BotonesJtollsbarPersonalizados getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(BotonesJtollsbarPersonalizados btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public BotonesJtollsbarPersonalizados getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(BotonesJtollsbarPersonalizados btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JPanel getjPanelFormulario() {
		return jPanelFormulario;
	}

	public void setjPanelFormulario(JPanel jPanelFormulario) {
		this.jPanelFormulario = jPanelFormulario;
	}

	public JtextFieldPersonalizado getTfBuscador() {
		return tfBuscador;
	}

	public void setTfBuscador(JtextFieldPersonalizado tfBuscador) {
		this.tfBuscador = tfBuscador;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public InterfaceAcciones getInterfaceAcciones() {
		return interfaceAcciones;
	}

}
