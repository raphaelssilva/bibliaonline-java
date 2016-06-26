package biz.r2s.bibliaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.bibliaonline.model.Biblia;
import biz.r2s.bibliaonline.service.BibliaService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping("/admin/biblia")
public class BibliaController extends ControllerCRUDAbstract<Biblia>{
	
	@Autowired
	public void setBibliaService(BibliaService bibliaService) {
		this.serviceCRUD = bibliaService;
		this.path = "biblia";
	}
	
}
