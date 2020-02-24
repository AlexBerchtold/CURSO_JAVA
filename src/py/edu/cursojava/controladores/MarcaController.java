package py.edu.cursojava.controladores;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JOptionPane;

import py.edu.cursojava.dao.MarcaDao;
import py.edu.cursojava.entidades.Marca;
import py.edu.cursojava.interfaces.InterfaceAcciones;
import py.edu.cursojava.tablas.ModeloTablaMarca;
import py.edu.cursojava.utilidades.EventosGenericos;
import py.edu.cursojava.vistas.MarcaVentana;

public class MarcaController implements InterfaceAcciones {
	
	private MarcaVentana ventana;
	private ModeloTablaMarca modeloTablaMarca;
	private Marca marca;
	private List<Marca> marcas;
	private MarcaDao dao;
	

	public MarcaController(MarcaVentana marcaVentana) {
		super();
		this.ventana= marcaVentana;
		this.ventana.setInterfaceAcciones(this);
		modeloTablaMarca = new ModeloTablaMarca();
		this.ventana.getTable().setModel(modeloTablaMarca);
		dao = new MarcaDao();
		consultarMarca();
		estadoinicial();
		setUpEvents();
	}
	
	private void setUpEvents() {
		ventana.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2) seleccionarRegistro(ventana.getTable().getSelectedRow());
			}
		});
		ventana.getTfBuscador().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar()==KeyEvent.VK_ENTER) consultarMarca();;
			}
		});
		
	}
	
	private void estadoinicial() {
		ventana.getBtnCancelar().setEnabled(false);
		ventana.getBtnModificar().setEnabled(false);
		ventana.getBtnEliminar().setEnabled(false);
		ventana.getBtnGuardar().setEnabled(false);
		ventana.getBtnNuevo().setEnabled(true);
		EventosGenericos.estadosJtexField(ventana.getjPanelFormulario(), false);
		EventosGenericos.limpiarJtexField(ventana.getjPanelFormulario());
		ventana.getChbEstado().setSelected(true);
		ventana.getChbEstado().setEnabled(false);
		ventana.getBtnGuardar().setText("Guardar");
		ventana.getTable().setEnabled(true);
	}

	@Override
	public void nuevo() {
		ventana.getBtnNuevo().setEnabled(false);
		ventana.getBtnSalir().setEnabled(false);
		ventana.getBtnGuardar().setEnabled(true);
		ventana.getBtnCancelar().setEnabled(true);
		EventosGenericos.estadosJtexField(ventana.getjPanelFormulario(), true);
		ventana.getChbEstado().setEnabled(true);
		ventana.getTable().setEnabled(false);
		ventana.getTfId().setText(dao.recuperarNuevoId()+"");
	}

	@Override
	public void modificar() {
		EventosGenericos.estadosJtexField(ventana.getjPanelFormulario(), true);
		ventana.getChbEstado().setEnabled(true);
		ventana.getBtnCancelar().setEnabled(true);
		ventana.getBtnGuardar().setEnabled(true);
		ventana.getBtnGuardar().setText("Actualizar");
	}

	@Override
	public void eliminar() {
		if (marca==null) {
			JOptionPane.showMessageDialog(null, "Cliente no encontrado");
			return;
		}
		int respuesta = JOptionPane.showConfirmDialog(null, "Estas deguro que desea eliminar la marca "+marca.getDescripcion(),
				"Antención", JOptionPane.YES_NO_OPTION);
		if (respuesta==JOptionPane.YES_OPTION) {
			try {
				dao.eliminar(marca);
				dao.commit();
				estadoinicial();
				consultarMarca();
			} catch (Exception e) {
				dao.rollback();
				e.printStackTrace();
			}
		}
	}

	@Override
	public void salir() {
		ventana.dispose();
	}

	@Override
	public void cancelar() {
		estadoinicial();
	}

	@Override
	public void guardar() {
		if (!validarCampos()) return;
		marca = new Marca();
		cargarEntidad();
		try {
			dao.guardar(marca);
			dao.commit();
			consultarMarca();
			estadoinicial();
		} catch (Exception e) {
			dao.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar() {
		if (!validarCampos()) return;
		cargarEntidad();
		try {
			dao.guardar(marca);
			dao.commit();
			consultarMarca();
			estadoinicial();
		} catch (Exception e) {
			dao.rollback();
			e.printStackTrace();
		}
	}
	
	private void cargarEntidad() {
		marca.setDescripcion(this.ventana.getTfDescripción().getText());
		marca.setEstado(this.ventana.getChbEstado().isSelected());
	}
	
	private void seleccionarRegistro(int index) {
		if(index<0)return;
		marca = marcas.get(index);
		ventana.getTfId().setText(marca.getId()+"");
		ventana.getTfDescripción().setText(marca.getDescripcion());
		ventana.getChbEstado().setSelected(marca.isEstado());
		ventana.getBtnNuevo().setEnabled(false);
		ventana.getBtnSalir().setEnabled(false);
		ventana.getBtnModificar().setEnabled(true);
		ventana.getBtnEliminar().setEnabled(true);
		
	}
	
	private void consultarMarca() {
		marcas = dao.filtrarMarcas(this.ventana.getTfBuscador().getText());
		modeloTablaMarca.setLista(marcas);
	}
	
	private boolean validarCampos() {
		if (ventana.getTfDescripción().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "El campo Nombre es obligatorio");
			return false;
		}
		return true;
	}
	
	

}
