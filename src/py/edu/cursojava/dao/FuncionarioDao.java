package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;


public class FuncionarioDao extends GenericDAO<FuncionarioDao> {

	public FuncionarioDao() {
		super(FuncionarioDao.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<FuncionarioDao> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from tb_funcionarios where nombre like :filtro or apellido like :filtro or documento like :filtro order by id ";
		Query<FuncionarioDao> query = getSession().createQuery(hql);
		query.setParameter("filtro", "%"+filtro+"%");		
		List<FuncionarioDao> lista = query.getResultList();
		commit();
		return lista;
	}

}
