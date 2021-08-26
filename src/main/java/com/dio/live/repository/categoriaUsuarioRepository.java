package com.dio.live.repository;

import com.dio.live.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// PERSISTIR OS DADOS

@Repository
public interface categoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

	
}
