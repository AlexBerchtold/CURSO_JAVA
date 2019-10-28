package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidad.Categoria;


public class CategoriaDao extends GenericDAO<Categoria> {

	public CategoriaDao() {
		super(Categoria.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from tb_categorias where descripcion like :filtro order by id ";
		Query<Categoria> query = getSession().createQuery(hql);
		query.setParameter("filtro", "%"+filtro+"%");		
		List<Categoria> lista = query.getResultList();
		commit();
		return lista;
	}

}
