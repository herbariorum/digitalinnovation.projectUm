package com.dio.live.repository;

import com.dio.live.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

	
}
