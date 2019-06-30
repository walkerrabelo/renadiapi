/**
 * 
 */
package org.renadi.restapi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Walker
 *
 */
@Entity
public class TratadorDenuncia {
	
	@Id
	private Long id;
	private String nome;
	private String instituicao;
	
	@ManyToMany
	private List<Denuncia> denuncias;

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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the instituicao
	 */
	public String getInstituicao() {
		return instituicao;
	}

	/**
	 * @param instituicao the instituicao to set
	 */
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	/**
	 * @return the denuncias
	 */
	public List<Denuncia> getDenuncias() {
		return denuncias;
	}

	/**
	 * @param denuncias the denuncias to set
	 */
	public void setDenuncias(List<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}
}
