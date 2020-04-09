package com.brunocandido.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brunocandido.cursomc.domain.Cidades;

@Repository

//1º Camada

public interface CidadeRepository extends JpaRepository<Cidades, Integer> {

	@Transactional(readOnly = true)
	@Query("SELECT obj FROM Cidades obj WHERE obj.estado.id = :estadoId ORDER BY obj.nome")
	public List<Cidades> findCidades(@Param("estadoId") Integer estado_id);

}
