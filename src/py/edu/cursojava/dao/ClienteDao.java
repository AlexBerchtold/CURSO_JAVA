package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Cliente;

public class ClienteDao extends GenericDao<Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> filtrarClientes(String filtro){
		iniciarTransaccion();
		String sql = "from tb_clientes where UPPER(nombre) like :filtro or UPPER(apellido) like :filtro or UPPER(documento) like :filtro order by id";
		Query<Cliente> query = getSession().createQuery(sql);
		query.setParameter("filtro", "%"+filtro.toUpperCase()+"%");
		List<Cliente> lista = query.getResultList();
		commit();
		return lista;
	}
	
	public Cliente verificarCedula(String ci) {
		iniciarTransaccion();
		String sql = "from tb_clientes where UPPER(documento) like :filtro";
		Query<Cliente> query = getSession().createQuery(sql);
		query.setParameter("filtro", ci.toUpperCase());
		Cliente cliente;
		try {
			cliente = query.getSingleResult();
		} catch (Exception e) {
			cliente =null;
		}
		commit();
		return cliente;
	}

}
