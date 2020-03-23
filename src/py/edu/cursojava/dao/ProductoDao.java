package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Producto;

public class ProductoDao extends GenericDao<Producto> {

	public ProductoDao() {
		super(Producto.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> filtrarProducto(String filtro){
		iniciarTransaccion();
		String sql = "from tb_productos where UPPER(descripcion) like :filtro order by id";
		Query<Producto> query = getSession().createQuery(sql);
		query.setParameter("filtro", "%"+filtro.toUpperCase()+"%");
		List<Producto> lista = query.getResultList();
		commit();
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public Producto filtrarProductoPorCodigo(String filtro){
		iniciarTransaccion();
		String sql = "from tb_productos where UPPER(codigoBarra) like :filtro";
		Query<Producto> query = getSession().createQuery(sql);
		query.setParameter("filtro", filtro.toUpperCase());
		Producto producto;
		try {
			producto = query.getSingleResult();
		} catch (Exception e) {
			producto=null;
		}
		commit();
		return producto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> filtroListadoProducto(String desde, String hasta, String categoria, String marca, String order){
		if (marca.equals("Todo")) {
			marca = "";
		}else {
			marca = "and UPPER(marca.descripcion) like '"+marca.toUpperCase()+"'";
		}
		if (categoria.equals("Todo")) {
			categoria = "";
		}else {
			categoria = "and UPPER(categoria.descripcion) like '"+categoria.toUpperCase()+"'";
		}
		iniciarTransaccion();
		String sql = "from tb_productos where UPPER(descripcion) BETWEEN :desde and :hasta "+marca+" "+categoria
				+ " order by "+order.toLowerCase();
		
		Query<Producto> query = getSession().createQuery(sql);
		query.setParameter("desde", desde.toUpperCase());
		query.setParameter("hasta", hasta.toUpperCase()+"zzzzzz");
		
		System.out.println(sql);
		
		List<Producto> lista = query.getResultList();
		commit();
		return lista;
	}

}
