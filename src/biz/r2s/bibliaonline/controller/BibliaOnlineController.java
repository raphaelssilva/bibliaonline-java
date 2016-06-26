package biz.r2s.bibliaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.r2s.bibliaonline.model.Biblia;
import biz.r2s.bibliaonline.service.BibliaService;

@Controller
public class BibliaOnlineController {
	
	@Autowired
	BibliaService bibliaService;
	
	@RequestMapping(value="/{siglaBiblia:[a-z-][a-z-][a-z-]}")
	@ResponseBody
	public String biblia(@PathVariable String siglaBiblia) {
		Biblia b = bibliaService.findBySigla(siglaBiblia);
		if(b!=null){
			return "Nome da biblia:"+b.getNome();
		}
		
		return "biblia: "+siglaBiblia;
	}
	
	@RequestMapping(value="/{siglaBiblia:[a-z-][a-z-][a-z-]}/{siglaLivro:[a-z-][a-z-]}")
	@ResponseBody
	public String livro(@PathVariable String siglaBiblia, @PathVariable String siglaLivro) {
		return "biblia: "+siglaBiblia+", livro: "+siglaLivro;
	}
	
	@RequestMapping(value="/{siglaBiblia:[a-z-][a-z-][a-z-]}/{siglaLivro:[a-z-][a-z-]}/{capitulo}")
	@ResponseBody
	public String capitulo(@PathVariable String siglaBiblia, @PathVariable String siglaLivro, @PathVariable int capitulo) {
		return "biblia: "+siglaBiblia+", livro: "+siglaLivro+", capitulo: "+capitulo;
	}
	
	@RequestMapping(value="/{siglaBiblia:[a-z-][a-z-][a-z-]}/{siglaLivro:[a-z-][a-z-]}/{capitulo}/{versiculo}")
	@ResponseBody
	public String versiculo(@PathVariable String siglaBiblia, @PathVariable String siglaLivro, @PathVariable int capitulo, @PathVariable int versiculo) {
		return  "biblia: "+siglaBiblia+", livro: "+siglaLivro+", capitulo: "+capitulo+", versiculo: "+versiculo;
	}
	

}
