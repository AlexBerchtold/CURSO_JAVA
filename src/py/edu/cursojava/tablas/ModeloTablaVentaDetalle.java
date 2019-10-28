package py.edu.cursojava.tablas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.cursojava.entidad.VentaDetalle;
import py.edu.cursojava.utilidades.NumberUtil;

public class ModeloTablaVentaDetalle extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	private String[] columnas = {"Producto", "Precio", "Cantidad", "Sub Total"};
	private List<VentaDetalle> lista = new ArrayList<VentaDetalle>();
	
	public void setLista(List<VentaDetalle> lista) {
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
			return lista.get(r).getProducto().getDescripcion()+" "+lista.get(r).getProducto().getMarca().getDescripcion();
		case 1:
			return lista.get(r).getProducto().getPrecioVenta();
		case 2:
			return lista.get(r).getCantidad();
		case 3:
			return NumberUtil.doubleAString(lista.get(r).getCantidad()*lista.get(r).getProducto().getPrecioVenta());
		}
		return null;
	}
}
