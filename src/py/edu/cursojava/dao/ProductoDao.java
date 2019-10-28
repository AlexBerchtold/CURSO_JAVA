package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidad.Producto;


public class ProductoDao extends GenericDAO<Producto> {

	public ProductoDao() {
		super(Producto.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from tb_productos where descripcion like :filtro or marca.descripcion like :filtro or categoria.descripcion like :filtro order by id ";
		Query<Producto> query = getSession().createQuery(hql);
		query.setParameter("filtro", "%"+filtro+"%");		
		List<Producto> lista = query.getResultList();
		commit();
		return lista;
	}

}
