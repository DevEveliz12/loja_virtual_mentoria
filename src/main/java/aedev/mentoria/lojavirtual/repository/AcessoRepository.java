package aedev.mentoria.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import aedev.mentoria.lojavirtual.model.Acesso;

@Repository
// Gerenciar as transações com o banco
// Responsavel pelos comando sql - JpaRepository
@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long> {

}
