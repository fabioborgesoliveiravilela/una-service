package br.com.una.unaservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import br.com.una.unaservice.dao.AlunoDAO;
import br.com.una.unaservice.entity.Aluno;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	private AlunoDAO dao;

	@Override
	public Aluno create(Aluno aluno) {

		return dao.save(aluno);
	}

	@Override
	public List<Aluno> read() {

		return dao.findAll();
	}

	@Override
	public Aluno read(Integer id) {

		return dao.getOne(id);
	}

	@Override
	public Aluno update(Aluno aluno) {

		return dao.save(aluno);
	}

	@Override
	public void delete(Integer id) {

		dao.deleteById(id);
	}
}
