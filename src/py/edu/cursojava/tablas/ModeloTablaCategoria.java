package py.edu.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.cursojava.entidades.Categoria;

public class ModeloTablaCategoria extends AbstractTableModel {
	
	private String[] columnas = {"ID", "Descripción", "Estado"};
	private List<Categoria> lista = new ArrayList<Categoria>();
	
	public void setLista(List<Categoria> lista) {
		this.lista=lista;
		fireTableDataChanged();
	}

	@Override
	public int getColumnCount() {
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}
	
	public String getColumnName(int i) {
		return columnas[i];
	}

	@Override
	public Object getValueAt(int r, int c) {
		switch (c) {
		case 0:
			return lista.get(r).getId();
		case 1:
			return lista.get(r).getDescripcion();
		case 2:
			if(lista.get(r).isEstado()) {
				return "Activa";
			}else {
				return "Inactiva";
			}
		}
		return null;
	}

}
