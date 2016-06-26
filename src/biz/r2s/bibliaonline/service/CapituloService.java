package biz.r2s.bibliaonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.bibliaonline.DAO.CapituloDAO;
import biz.r2s.bibliaonline.model.Capitulo;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class CapituloService extends ServiceCRUDAbstract<Capitulo> {
	
	@Autowired
	public void setCapituloDAO(CapituloDAO capituloDAO){
		this.dao = capituloDAO;
	}
}
