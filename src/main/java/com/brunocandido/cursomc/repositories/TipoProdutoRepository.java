package com.brunocandido.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.brunocandido.cursomc.domain.TipoProduto;

@Repository

public interface TipoProdutoRepository extends JpaRepository<TipoProduto, Integer> {
	
	

}
