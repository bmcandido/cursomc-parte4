package com.brunocandido.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunocandido.cursomc.domain.Pagamento;

@Repository

//1º Camada

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
