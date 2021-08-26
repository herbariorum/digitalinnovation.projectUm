package com.dio.live.service;

import com.dio.live.model.Calendario;
import com.dio.live.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;

    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }
    public Calendario updateCalendario(Calendario calendario) {
        return calendarioRepository.save(calendario);

    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> findByID(Long id) {
        return calendarioRepository.findById(id);
    }

    public void DeleteByID(Long id) {
        calendarioRepository.deleteById(id);
    }
}
