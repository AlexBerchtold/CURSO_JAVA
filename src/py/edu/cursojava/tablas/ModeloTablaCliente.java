package py.edu.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.cursojava.entidad.Cliente;

public class ModeloTablaCliente extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	private String[] columnas = {"Nombre", "Apellido", "Documento"};
	private List<Cliente> lista = new ArrayList<Cliente>();
	
	public void setLista(List<Cliente> lista) {
		this.lista = lista;
		fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.length;
	}
	
	@Override
	public String getColumnName(int i) {
		return columnas[i];
	}

	@Override
	public Object getValueAt(int r, int c) {
		switch (c) {
		case 0:
			return lista.get(r).getNombre();
		case 1:
			return lista.get(r).getApellido();
		case 2:
			return lista.get(r).getDocumento();
		}
		return null;
	}
}
