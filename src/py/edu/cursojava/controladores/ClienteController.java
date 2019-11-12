package py.edu.cursojava.controladores;

import java.util.List;

import py.edu.cursojava.dao.ClienteDao;
import py.edu.cursojava.entidades.Cliente;
import py.edu.cursojava.interfaces.InterfaceAcciones;
import py.edu.cursojava.tablas.ModeloTablaCliente;
import py.edu.cursojava.utilidades.EventosGenericos;
import py.edu.cursojava.utilidades.UtilidadesFecha;
import py.edu.cursojava.vista.ClienteVentana;

public class ClienteController implements InterfaceAcciones {
	
	private ClienteVentana ventana;
	private Cliente cliente;
	private List<Cliente> clientes;
	private ClienteDao dao;
	private ModeloTablaCliente modeloTablaCliente;
	

	public ClienteController(ClienteVentana clienteVentana) {
		super();
		this.ventana= clienteVentana;
		this.ventana.setInterfaceAcciones(this);
		dao = new ClienteDao();
		modeloTablaCliente = new ModeloTablaCliente();
		ventana.getTable().setModel(modeloTablaCliente);
		filtrarClientes(ventana.getTfBuscador().getText());
		estadoinicial();
	}
	
	private void estadoinicial() {
		ventana.getBtnNuevo().setEnabled(true);
		ventana.getBtnModificar().setEnabled(false);
		ventana.getBtnEliminar().setEnabled(false);
		ventana.getBtnSalir().setEnabled(false);
		ventana.getBtnCancelar().setEnabled(false);
		ventana.getBtnGuardar().setEnabled(false);
		ventana.getRdbActivo().setEnabled(false);
		EventosGenericos.estadosJtexField(ventana.getjPanelFormulario(), false);
		
	}

	@Override
	public void nuevo() {
		ventana.getBtnNuevo().setEnabled(false);
		ventana.getBtnModificar().setEnabled(false);
		ventana.getBtnEliminar().setEnabled(false);
		ventana.getBtnSalir().setEnabled(false);
		ventana.getBtnCancelar().setEnabled(true);
		ventana.getBtnGuardar().setEnabled(true);
		ventana.getRdbActivo().setEnabled(true);
		EventosGenericos.estadosJtexField(ventana.getjPanelFormulario(), true);
		EventosGenericos.limpiarJtexField(ventana.getjPanelFormulario());
	}

	@Override
	public void modificar() {
		
	}

	@Override
	public void eliminar() {
		
	}

	@Override
	public void salir() {
		
	}

	@Override
	public void cancelar() {
		estadoinicial();
		EventosGenericos.limpiarJtexField(ventana.getjPanelFormulario());
	}

	@Override
	public void guardar() {
		cliente = new Cliente();
		cargarEntidad();
		try {
			dao.guardar(cliente);
			dao.commit();
			estadoinicial();
			EventosGenericos.limpiarJtexField(ventana.getjPanelFormulario());
			filtrarClientes("");
		} catch (Exception e) {
			dao.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar() {
		
	}
	
	private void cargarEntidad() {
		cliente.setNombre(ventana.getTfNombre().getText());
		cliente.setApellido(ventana.getTfApellido().getText());
		cliente.setDocumento(ventana.getTfDocumento().getText());
		cliente.setTelefono(ventana.getTfTelefono().getText());
		cliente.setEmail(ventana.getTfEmail().getText());
		cliente.setDireccion(ventana.getTfDireccion().getText());
		cliente.setEstado(ventana.getRdbActivo().isSelected());
		cliente.setFechaRegistro(UtilidadesFecha.stringAFecha(ventana.getTfFecha().getText()));
	}
	
	private void filtrarClientes(String filtro) {
		clientes = dao.filtrarClientes(filtro);
		modeloTablaCliente.setLista(clientes);
	}

}
