package aedev.mentoria.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import aedev.mentoria.lojavirtual.model.Acesso;
import aedev.mentoria.lojavirtual.repository.AcessoRepository;
import aedev.mentoria.lojavirtual.service.AcessoService;


@Controller
@RestController
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
		
	//@ResponseBody //Retorno Api - Resposta
	//@DeleteMapping(value = "/deletaAcesso") //Mapeando a URL para receber um JSON
	//public ResponseEntity<Acesso> deletaAcesso(@RequestBody Acesso acesso) { //Recebe o JSON e converte para objeto
	//	Acesso acessoSalvoAcesso = acessoService.acesso(acesso);
	 //   return new ResponseEntity<Acesso>(acessoSalvoAcesso, HttpStatus.OK);
	//}
	
	//@ResponseBody
	//@DeleteMapping("/deleteAcesso")
	//public ResponseEntity<Void> deleteAcesso(@RequestBody Acesso acesso) {
	   // acessoService.deleteAcesso(acesso);
	   // return ResponseEntity.ok().build(); // Sem retorno
	//}
	
	@DeleteMapping("/deleteAcesso")
	public ResponseEntity<Void> deleteAcesso(@RequestBody Acesso acesso) {
	    acessoService.deleteAcesso(acesso);
	    return ResponseEntity.noContent().build(); // mais REST
	}

	
	
	
}
