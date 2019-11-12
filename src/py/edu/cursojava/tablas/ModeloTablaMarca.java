package py.edu.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.cursojava.entidades.Marca;

public class ModeloTablaMarca extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	private String[] columnas = {"ID", "Descripcion", "Estado"};
	private List<Marca> lista = new ArrayList<Marca>();
	
	public void setLista(List<Marca> lista) {
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
