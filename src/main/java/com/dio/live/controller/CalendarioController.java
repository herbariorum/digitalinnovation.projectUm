package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.saveCalendario(calendario);
    }

    @GetMapping("/listAll")
    public List<Calendario> getJornadaList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public Optional<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long id){
        return calendarioService.findByID(id);
    }

    @PutMapping("/{idUpdate}")
    public Calendario updateCadendario(@RequestBody Calendario empresa, @PathVariable("idUpdate") Long id) throws Exception{
        if(calendarioService.findByID(id).isPresent()){
            return calendarioService.updateCalendario(empresa);
        }
        return null;
    }


    @DeleteMapping("/{idDelete}")
    public void deleteCalendario(@PathVariable("idDelete") Long id){
        calendarioService.DeleteByID(id);
    }
}
