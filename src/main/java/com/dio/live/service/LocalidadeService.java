package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.live.model.Localidade;
import com.dio.live.repository.LocalidadeRepository;

// REGRA DE NEG�CIO

@Service
public class LocalidadeService {

	@Autowired
	LocalidadeRepository localidadeRepository;

	public Localidade saveLocalidade(Localidade localidade) {
		return localidadeRepository.save(localidade);

	}

	public Localidade updateLocalidade(Localidade localidade) {
		return localidadeRepository.save(localidade);

	}
	
	public List<Localidade> findAll() {
		return localidadeRepository.findAll();
	}

	public Optional<Localidade> findByID(Long id) {
		return localidadeRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		localidadeRepository.deleteById(id);
	}
}
