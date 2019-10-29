package br.com.una.unaservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.una.unaservice.entity.Aluno;

@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Integer> {

}