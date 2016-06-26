package biz.r2s.bibliaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.bibliaonline.model.Capitulo;
import biz.r2s.bibliaonline.service.CapituloService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping("/capitulo")
public class CapituloController extends ControllerCRUDAbstract<Capitulo>{
	
	@Autowired
	public void setCapituloService(CapituloService capituloService) {
		this.serviceCRUD = capituloService;
		this.path = "capitulo";
	}
	
}
