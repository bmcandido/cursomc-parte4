package com.brunocandido.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunocandido.cursomc.domain.Cidades;
import com.brunocandido.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	public List<Cidades> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}