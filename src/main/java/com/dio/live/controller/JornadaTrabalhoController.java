package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping("/listAll")
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public Optional<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long id){
        return jornadaService.findByID(id);
    }

    @PutMapping("/{descricao}/{idUpdate}")
    public JornadaTrabalho updateJornada(@PathVariable("descricao") String descricao, @PathVariable("idUpdate") Long id) throws Exception{
        if (jornadaService.findByID(id).isPresent()){
            JornadaTrabalho nnew = new JornadaTrabalho();
            nnew.setDescricao(descricao);
            nnew.setId(id);
            return jornadaService.updateJornada(nnew);
        }
        return null;
    }

    @DeleteMapping("/{idDelete}")
    public void deleteJornada(@PathVariable("idDelete") Long id){
        jornadaService.DeleteByID(id);
    }
}
