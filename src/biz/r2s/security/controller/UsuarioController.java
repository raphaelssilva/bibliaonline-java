package biz.r2s.security.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.r2s.security.model.Usuario;
import biz.r2s.security.service.UsuarioService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping(value="/admin/user")
public class UsuarioController extends ControllerCRUDAbstract<Usuario>{
	
	public class UsuarioList extends ArrayList<Usuario>{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}
	
	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.serviceCRUD = usuarioService;
		this.path = "user";
	}
	
	@RequestMapping(value="/listUsuarioAjax", headers = "Accept=application/json")
	public @ResponseBody  UsuarioList listUsuarioAjax() {
		UsuarioList objList = new UsuarioList();
		objList.addAll(serviceCRUD.listar());
		return objList;
	}
	
	@RequestMapping(value="/deleteUsuarioAjax", headers = "Accept=application/json")
	public @ResponseBody  Usuario deleteUsuarioAjax(Long key) {
		Usuario usuario = serviceCRUD.consultar(key); 
		serviceCRUD.excluir(key);
		return usuario;
	}
}
