package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Categoria;

public class CategoriaDao extends GenericDao<Categoria> {

	public CategoriaDao() {
		super(Categoria.class);
	}
	
	public List<Categoria> filtrarCategoria(String filtro){
		iniciarTransaccion();
		String sql = "from tb_categorias where UPPER(descripcion) like :filtro order by id";
		Query<Categoria> query = getSession().createQuery(sql);
		query.setParameter("filtro", "%"+filtro.toUpperCase()+"%");
		List<Categoria> lista = query.getResultList();
		commit();
		return lista;
	}
	
	public int crearNuevoid() {
		iniciarTransaccion();
		String sql = "select max(id) from tb_categorias";
		Query query = getSession().createQuery(sql);
		try {
			return ((int) query.getSingleResult())+1;
		} catch (Exception e) {
			return 0;
		}
	}

}
