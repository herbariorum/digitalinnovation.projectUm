package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.live.model.TipoData;
import com.dio.live.repository.tipoDataRepository;

// REGRA DE NEG�CIO

@Service
public class tipoDataService {

	@Autowired
	tipoDataRepository tipoDataRepository;

	public TipoData saveTipoData(TipoData tipoData) {
		return tipoDataRepository.save(tipoData);

	}

	public TipoData updateTipoData(TipoData tipoData) {
		return tipoDataRepository.save(tipoData);

	}
	
	public List<TipoData> findAll() {
		return tipoDataRepository.findAll();
	}

	public Optional<TipoData> findByID(Long id) {
		return tipoDataRepository.findById(id);
	}
	
	public void DeleteByID(Long id) {
		tipoDataRepository.deleteById(id);
	}
}
