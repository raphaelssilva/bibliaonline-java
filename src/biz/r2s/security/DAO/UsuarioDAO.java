package biz.r2s.security.DAO;

import java.util.List;

import javax.jdo.Query;

import org.springframework.stereotype.Repository;

import biz.r2s.security.model.Usuario;
import biz.r2s.util.persistencia.AbstractDAO;

@Repository
public class UsuarioDAO extends AbstractDAO<Usuario> {
	
	@SuppressWarnings("unchecked")
	public Usuario getUsuarioByLogin(String login) {

		Query q = createQuery();
		q.setFilter("login == loginParam");
		q.declareParameters("String loginParam");
		
		List<Usuario> usuarios = (List<Usuario>) q.execute(login);
		
		if(usuarios!=null&&!usuarios.isEmpty()){
			return usuarios.get(0);
		}
		return null;

	}
}
