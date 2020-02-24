package py.edu.cursojava.dao;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Venta;

public class VentaDao extends GenericDao<Venta> {

	public VentaDao() {
		super(Venta.class);
	}
	
	public int crearNuevoid() {
		iniciarTransaccion();
		String sql = "select max(id) from tb_ventas";
		Query query = getSession().createQuery(sql);
		try {
			return ((int) query.getSingleResult())+1;
		} catch (Exception e) {
			return 0;
		}
	}

}
