package com.dio.live.repository;

import com.dio.live.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	
}
