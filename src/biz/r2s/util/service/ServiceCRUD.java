package biz.r2s.util.service;

import java.util.List;

public interface ServiceCRUD<T> {	
	
	public T inserir(T obj);
	public T alterar(T obj);
	public void excluir(Long key);
	public T consultar(Long key);
	public List<T> listar();

}
