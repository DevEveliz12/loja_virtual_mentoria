package aedev.mentoria.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import aedev.mentoria.lojavirtual.controller.AcessoController;
import aedev.mentoria.lojavirtual.model.Acesso;
import aedev.mentoria.lojavirtual.repository.AcessoRepository;
import aedev.mentoria.lojavirtual.service.AcessoService;
import junit.framework.TestCase;


//TestCase - Teste Unitário
@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
class LojaVirtualMentoriaApplicationTests extends TestCase {
	
	@Autowired
	private AcessoController acessoController;

	@Autowired
	private AcessoRepository acessoRepository;
	
	@Test
	public void testCadastraAcesso() {
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
	    //acesso = acessoController.deleteAcesso(acesso).getBody();
		ResponseEntity<Void> response = acessoController.deleteAcesso(acesso);
	    
	    assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}

}