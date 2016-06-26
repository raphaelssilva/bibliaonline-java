package biz.r2s.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.security.model.LogAcesso;
import biz.r2s.security.service.LogAcessoService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping("/logAcesso")
public class LogAcessoController extends ControllerCRUDAbstract<LogAcesso>{
	
	@Autowired
	public void setLogAcessoService(LogAcessoService logAcessoService) {
		this.serviceCRUD = logAcessoService;
		this.path = "logAcesso";
	}
	
}
