package py.edu.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.cursojava.entidad.Venta;
import py.edu.cursojava.utilidades.FechaUtil;

public class ModeloTablaVenta extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	private String[] columnas = {"Id", "Hora y Fecha", "Funcionario", "Cliente", "Monto"};
	private List<Venta> lista = new ArrayList<Venta>();
	
	public void setLista(List<Venta> lista) {
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
			return FechaUtil.fechaHoraAString(lista.get(r).getFecha());
		case 2:
			return lista.get(r).getFuncionario().getNombre();
		case 3:
			return lista.get(r).getCliente().getNombre();
		case 4:
			return lista.get(r).getTotal();
		}
		return null;
	}
}
