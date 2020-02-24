package py.edu.cursojava.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.cursojava.entidades.Funcionario;

public class FuncionarioDao extends GenericDao<Funcionario> {

	public FuncionarioDao() {
		super(Funcionario.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> filtrarFuncionarios(String filtro){
		iniciarTransaccion();
		String sql = "from tb_funcionarios where UPPER(nombre) like :filtro or UPPER(apellido) like :filtro or UPPER(documento) like :filtro order by id";
		Query<Funcionario> query = getSession().createQuery(sql);
		query.setParameter("filtro", "%"+filtro.toUpperCase()+"%");
		List<Funcionario> lista = query.getResultList();
		commit();
		return lista;
	}
	
	public Funcionario verificarCedula(String ci) {
		iniciarTransaccion();
		String sql = "from tb_funcionarios where UPPER(documento) like :filtro";
		Query<Funcionario> query = getSession().createQuery(sql);
		query.setParameter("filtro", ci.toUpperCase());
		Funcionario funcionario;
		try {
			funcionario = query.getSingleResult();
		} catch (Exception e) {
			funcionario =null;
		}
		commit();
		return funcionario;
	}

}
