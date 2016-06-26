package biz.r2s.bibliaonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.bibliaonline.DAO.LivroDAO;
import biz.r2s.bibliaonline.model.Livro;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class LivroService extends ServiceCRUDAbstract<Livro> {
	
	@Autowired
	public void setLivroDAO(LivroDAO livroDAO){
		this.dao = livroDAO;
	}
}
