package py.edu.cursojava.componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import py.edu.cursojava.interfaces.InterfaceAcciones;

public class JDialogGenerico extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JtextFieldPersonalizado tfBuscador;
	private BotonTolsBarPersonalizado btnNuevo, btnModificar, btnEliminar, btnSalir;
	private BotonSecundarioPersonalizado btnGuardar, btnCancelar;
	private InterfaceAcciones interfaceAcciones;
	private JLabel lblTitulo;
	private JScrollPane scrollPane;
	private JPanel jPanelFormulario;
	
	public void setAcciones(InterfaceAcciones interfaceAcciones) {
		this.interfaceAcciones = interfaceAcciones;
	}

	/**
	 * Create the dialog.
	 */
	public JDialogGenerico() {
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(this);
		setResizable(false);
		setModal(true);
		
		JToolBar jtoolBar = new JToolBar();
		jtoolBar.setFloatable(false);
		jtoolBar.setBounds(10, 11, 370, 82);
		contentPanel.add(jtoolBar);
		
		btnNuevo = new BotonTolsBarPersonalizado();
		btnNuevo.setText("Nuevo");
		jtoolBar.add(btnNuevo);
		
		JSeparator separator = new JSeparator();
		separator.setRequestFocusEnabled(false);
		separator.setVerifyInputWhenFocusTarget(false);
		separator.setMaximumSize(new Dimension(25, 0));
		separator.setFocusTraversalKeysEnabled(false);
		jtoolBar.add(separator);
		
		btnModificar = new BotonTolsBarPersonalizado();
		btnModificar.setText("Modificar");
		jtoolBar.add(btnModificar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setVerifyInputWhenFocusTarget(false);
		separator_1.setRequestFocusEnabled(false);
		separator_1.setMaximumSize(new Dimension(25, 0));
		separator_1.setFocusTraversalKeysEnabled(false);
		jtoolBar.add(separator_1);
		
		btnEliminar = new BotonTolsBarPersonalizado();
		btnEliminar.setText("Eliminar");
		jtoolBar.add(btnEliminar);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setVerifyInputWhenFocusTarget(false);
		separator_2.setRequestFocusEnabled(false);
		separator_2.setMaximumSize(new Dimension(25, 0));
		separator_2.setFocusTraversalKeysEnabled(false);
		jtoolBar.add(separator_2);
		
		btnSalir = new BotonTolsBarPersonalizado();
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalir.setText("Salir");
		jtoolBar.add(btnSalir);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(390, 94, 370, 466);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		jLabelPersonalizado lblBuscar = new jLabelPersonalizado("Buscar:");
		lblBuscar.setBounds(392, 69, 46, 14);
		contentPanel.add(lblBuscar);
		
		tfBuscador = new JtextFieldPersonalizado();
		tfBuscador.setBounds(442, 67, 318, 20);
		contentPanel.add(tfBuscador);
		tfBuscador.setColumns(10);
		
		btnCancelar = new BotonSecundarioPersonalizado();
		btnCancelar.setText("Cancelar");
		btnCancelar.setBounds(10, 525, 101, 35);
		contentPanel.add(btnCancelar);
		
		btnGuardar = new BotonSecundarioPersonalizado();
		btnGuardar.setText("Guardar");
		btnGuardar.setBounds(265, 525, 118, 35);
		contentPanel.add(btnGuardar);
		
		lblTitulo = new JLabel("tutulo");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(new Font("Rockwell", Font.PLAIN, 27));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(390, 11, 370, 44);
		contentPanel.add(lblTitulo);
		
		jPanelFormulario = new JPanel();
		jPanelFormulario.setBorder(null);
		jPanelFormulario.setBounds(10, 94, 370, 405);
		contentPanel.add(jPanelFormulario);
		
		setUpEvents();
	}

	private void setUpEvents() {
		btnNuevo.addActionListener(this);
		btnModificar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnSalir.addActionListener(this);
		btnCancelar.addActionListener(this);
		btnGuardar.addActionListener(this);
	}
	
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
		break;case "Actualizar":
			interfaceAcciones.actualizar();
			break;
		}
	}
	
	//Getters and Setters
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JtextFieldPersonalizado getTfBuscador() {
		return tfBuscador;
	}

	public void setTfBuscador(JtextFieldPersonalizado tfBuscador) {
		this.tfBuscador = tfBuscador;
	}

	public BotonTolsBarPersonalizado getBtnNuevo() {
		return btnNuevo;
	}

	public void setBtnNuevo(BotonTolsBarPersonalizado btnNuevo) {
		this.btnNuevo = btnNuevo;
	}

	public BotonTolsBarPersonalizado getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(BotonTolsBarPersonalizado btnModificar) {
		this.btnModificar = btnModificar;
	}

	public BotonTolsBarPersonalizado getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(BotonTolsBarPersonalizado btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public BotonTolsBarPersonalizado getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(BotonTolsBarPersonalizado btnSalir) {
		this.btnSalir = btnSalir;
	}

	public BotonSecundarioPersonalizado getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(BotonSecundarioPersonalizado btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public BotonSecundarioPersonalizado getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(BotonSecundarioPersonalizado btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public InterfaceAcciones getInterfaceAcciones() {
		return interfaceAcciones;
	}

	public void setInterfaceAcciones(InterfaceAcciones interfaceAcciones) {
		this.interfaceAcciones = interfaceAcciones;
	}

	public JPanel getjPanelFormulario() {
		return jPanelFormulario;
	}

	public void setjPanelFormulario(JPanel jPanelFormulario) {
		this.jPanelFormulario = jPanelFormulario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
