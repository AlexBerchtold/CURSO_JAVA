package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Marca;

public class MarcaDao extends GenericDao<Marca> {

	public MarcaDao() {
		super(Marca.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Marca> filtrarMarcas(String filtro){
		iniciarTransaccion();
		String sql = "from tb_marcas where UPPER(descripcion) like :filtro order by id";
		Query<Marca> query = getSession().createQuery(sql);
		query.setParameter("filtro", "%"+filtro.toUpperCase()+"%");
		List<Marca> lista = query.getResultList();
		commit();
		return lista;
	}
	
	
	@SuppressWarnings("rawtypes")
	public int recuperarNuevoId() {
		iniciarTransaccion();
		String sql = "select max(id) from tb_marcas";
		Query query = getSession().createQuery(sql);
		try {
			return ((int)query.getSingleResult())+1;
		} catch (Exception e) {
			return 0;
		}
	}

}
