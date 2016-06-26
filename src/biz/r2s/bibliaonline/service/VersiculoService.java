package biz.r2s.bibliaonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.bibliaonline.DAO.VersiculoDAO;
import biz.r2s.bibliaonline.model.Versiculo;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class VersiculoService extends ServiceCRUDAbstract<Versiculo> {
	
	@Autowired
	public void setVersiculoDAO(VersiculoDAO versiculoDAO){
		this.dao = versiculoDAO;
	}
}
