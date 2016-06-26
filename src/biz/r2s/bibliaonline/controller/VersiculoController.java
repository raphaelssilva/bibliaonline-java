package biz.r2s.bibliaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.bibliaonline.model.Versiculo;
import biz.r2s.bibliaonline.service.VersiculoService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping("/versiculo")
public class VersiculoController extends ControllerCRUDAbstract<Versiculo>{
	
	@Autowired
	public void setVersiculoService(VersiculoService versiculoService) {
		this.serviceCRUD = versiculoService;
		this.path = "versiculo";
	}
	
}
