package com.brunocandido.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brunocandido.cursomc.domain.Estado;

@Repository


//1º Camada

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	
	@Transactional(readOnly =true) //Anotação para melhorar a performace
	public List<Estado> findAllByOrderByNome();

}
