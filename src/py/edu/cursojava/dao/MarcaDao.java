package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidad.Marca;


public class MarcaDao extends GenericDAO<Marca> {

	public MarcaDao() {
		super(Marca.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Marca> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from tb_marcas where descripcion like :filtro order by id ";
		Query<Marca> query = getSession().createQuery(hql);
		query.setParameter("filtro", "%"+filtro+"%");		
		List<Marca> lista = query.getResultList();
		commit();
		return lista;
	}

}
