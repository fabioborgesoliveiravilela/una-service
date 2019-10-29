package br.com.una.unaservice.service;

import java.util.List;

import br.com.una.unaservice.entity.Aluno;

public interface AlunoService {

	Aluno create(Aluno aluno);

	List<Aluno> read();

	Aluno read(Integer id);

	Aluno update(Aluno aluno);

	void delete(Integer id);
}
