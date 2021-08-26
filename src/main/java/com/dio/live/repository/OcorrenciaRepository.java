package com.dio.live.repository;

import com.dio.live.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

	
}
