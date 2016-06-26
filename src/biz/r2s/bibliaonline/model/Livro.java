package biz.r2s.bibliaonline.model;

import java.io.Serializable;
import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Livro  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;
	
	@Persistent
	private String nome;
	@Persistent
	private Biblia biblia;
	
		
	@Persistent(mappedBy="livro", defaultFetchGroup="true", nullValue=NullValue.NONE)
	@Element(dependent = "true")
	private List<Capitulo> capitulos;
	
	@Persistent
	private Testamento testamento;

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	public Testamento getTestamento() {
		return testamento;
	}

	public void setTestamento(Testamento testamento) {
		this.testamento = testamento;
	}
	
	public Biblia getBiblia() {
		return biblia;
	}
	
	public void setBiblia(Biblia biblia) {
		this.biblia = biblia;
	}
	
}
