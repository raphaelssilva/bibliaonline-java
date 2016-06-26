package biz.r2s.bibliaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.bibliaonline.model.Livro;
import biz.r2s.bibliaonline.service.LivroService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping("/livro")
public class LivroController extends ControllerCRUDAbstract<Livro>{
	
	@Autowired
	public void setLivroService(LivroService livroService) {
		this.serviceCRUD = livroService;
		this.path = "livro";
	}
	
}
