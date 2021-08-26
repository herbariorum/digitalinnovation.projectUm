package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornada){
        return jornadaRepository.save(jornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornada) {
        return jornadaRepository.save(jornada);

    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> findByID(Long id) {
        return jornadaRepository.findById(id);
    }

    public void DeleteByID(Long id) {
        jornadaRepository.deleteById(id);
    }

}
