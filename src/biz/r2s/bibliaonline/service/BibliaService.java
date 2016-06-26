package biz.r2s.bibliaonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.bibliaonline.DAO.BibliaDAO;
import biz.r2s.bibliaonline.model.Biblia;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class BibliaService extends ServiceCRUDAbstract<Biblia> {
	
	@Autowired
	public void setBibliaDAO(BibliaDAO bibliaDAO){
		this.dao = bibliaDAO;
	}
	
	public Biblia findBySigla(String sigla){
		
		List<Biblia> b = dao.findBy("sigla=='"+sigla+"'");
		
		if(b!=null&&!b.isEmpty()){
			return b.get(0);
		}
				
		return null;
	}
	
}
