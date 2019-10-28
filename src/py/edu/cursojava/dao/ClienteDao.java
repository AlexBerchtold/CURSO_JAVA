package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidad.Cliente;


public class ClienteDao extends GenericDAO<Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from tb_clientes where nombre like :filtro or apellido like :filtro or documento like :filtro order by id ";
		Query<Cliente> query = getSession().createQuery(hql);
		query.setParameter("filtro", "%"+filtro+"%");		
		List<Cliente> lista = query.getResultList();
		commit();
		return lista;
	}

}
