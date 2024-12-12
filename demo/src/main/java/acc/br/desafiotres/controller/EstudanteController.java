package acc.br.desafiotres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import acc.br.desafiotres.entity.EstudanteEntity;
//import acc.br.desafiotres.repository.EstudanteRepository;
import acc.br.desafiotres.service.EstudanteService;


@Controller
public class EstudanteController {
	
	//@Autowired
	//public EstudanteRepository estudanteRepo;
	@Autowired
	public EstudanteService estudanteServ;
	
	@ResponseBody
	@GetMapping("/teste")
	public String teste() {
		
		return "revisao";
	}

	
	
	/*
	public String teste(@RequestParam(name="escolha")String aEscolha, Model model) {
		String saida = "default";
		EstudanteEntity estudante;
		
		try {
			estudante = estudanteRepo.findById(new Integer(1)).get();
		}
		catch (Exception e) {
			estudante = new EstudanteEntity ("Yasmin","01/01/1900","000000","Sao Paulo","Secretaria");
			estudanteRepo.save(estudante);
		}
		
		
		if (aEscolha.equalsIgnoreCase("registroTeste")) {
			saida = "Sucesso";
		}
		model.addAttribute("saida", saida);
		model.addAttribute("aEscolha", aEscolha);
		return "revisao";
	}
	*/
	
	@PostMapping
	public void inserir (@RequestBody EstudanteEntity estudante) {
		estudanteServ.inserir(estudante);
	}
	
	@PutMapping
	public EstudanteEntity alterar (@RequestBody EstudanteEntity estudante) {
		return estudanteServ.alterar(estudante);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> excluir(@PathVariable("id") Integer id){
		estudanteServ.excluir(id);
		return ResponseEntity.ok().build();
	}

}
