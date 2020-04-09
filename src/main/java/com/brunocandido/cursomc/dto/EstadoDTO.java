package com.brunocandido.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.brunocandido.cursomc.domain.Estado;

public class EstadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotEmpty(message = "Preenchimento obrigatório")
	private String nome;

	public EstadoDTO() {

	}

	public EstadoDTO(Estado obj) {
		id = obj.getId();
		nome = obj.getNome();

	} // Criado para lista no JASON quando chamar /categoria trazer somente a
		// categoria e não categoria e lista de produtos

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
