package com.dio.live.repository;

import com.dio.live.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface nivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

	
}
