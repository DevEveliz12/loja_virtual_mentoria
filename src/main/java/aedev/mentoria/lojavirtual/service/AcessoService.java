package aedev.mentoria.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aedev.mentoria.lojavirtual.model.Acesso;
import aedev.mentoria.lojavirtual.repository.AcessoRepository;

//Lógica de comandos CRUD
//Quando e como salvar os dados

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		return acessoRepository.save(acesso);
	}
	
	public void deleteAcesso(Acesso acesso) {
		 acessoRepository.delete(acesso);
	}
}
