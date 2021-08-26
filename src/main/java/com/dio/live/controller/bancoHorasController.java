package com.dio.live.controller;

import java.util.List;
import java.util.Optional;

import com.dio.live.model.BancoHoras;
import com.dio.live.service.bancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bancohoras")
public class bancoHorasController {

	@Autowired
	bancoHorasService bancoService;

	@PostMapping
	public BancoHoras createBancoHoras(@RequestBody BancoHoras bancohoras) {
		return bancoService.saveBancoHoras(bancohoras);
	}
	
	@GetMapping("/listAll")
	public List<BancoHoras> getJornadaList(){
		return bancoService.findAll();
	}
	
	@GetMapping("/{idBancoHoras}")
	public Optional<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long id){
		return bancoService.findByID(id);
	}
	
	@PutMapping("/{idUpdate}")
	public BancoHoras updateBancoHoras
	(@RequestBody BancoHoras empresa, @PathVariable("idUpdate") Long id) throws Exception {
		if(bancoService.findByID(id).isPresent()) {
			return bancoService.updateBancoHoras(empresa);
		}
		return null;
	}
	
	@DeleteMapping("/{idDelete}")
	public void deleteBancoHoras(@PathVariable("idDelete") Long id) {
		bancoService.DeleteByID(id);
	}
}
