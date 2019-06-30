package org.renadi.restapi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
/**
 * @author Walker
 *
 */
@Entity
public class Denuncia {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String mensagem;
	private List<String> urlResorces;
	@ManyToMany
	private List<TipoDenuncia> tipos;
	
	@ManyToMany 
	private List<TratadorDenuncia> tratadoresDenuncias;
	
	/**
	 * @return the tipos
	 */
	public List<TipoDenuncia> getTipos() {
		return tipos;
	}
	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(List<TipoDenuncia> tipos) {
		this.tipos = tipos;
	}
	/**
	 * @return the tratadoresDenuncias
	 */
	public List<TratadorDenuncia> getTratadoresDenuncias() {
		return tratadoresDenuncias;
	}
	/**
	 * @param tratadoresDenuncias the tratadoresDenuncias to set
	 */
	public void setTratadoresDenuncias(List<TratadorDenuncia> tratadoresDenuncias) {
		this.tratadoresDenuncias = tratadoresDenuncias;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	/**
	 * @return the urlResorces
	 */
	public List<String> getUrlResorces() {
		return urlResorces;
	}
	/**
	 * @param urlResorces the urlResorces to set
	 */
	public void setUrlResorces(List<String> urlResorces) {
		this.urlResorces = urlResorces;
	}

}
