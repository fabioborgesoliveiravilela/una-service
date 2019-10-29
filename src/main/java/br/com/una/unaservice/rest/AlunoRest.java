package br.com.una.unaservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.una.unaservice.entity.Aluno;
import br.com.una.unaservice.service.AlunoService;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "*")
public class AlunoRest {

	@Autowired
	private AlunoService service;

	@PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluno> create(@RequestBody Aluno aluno) {

		return ResponseEntity.ok(service.create(aluno));
	}

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Aluno>> read() {

		return ResponseEntity.ok(service.read());
	}

	@GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluno> read(@PathVariable Integer id) {

		return ResponseEntity.ok(service.read(id));
	}

	@PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Aluno> update(@RequestBody Aluno aluno) {

		return ResponseEntity.ok(service.update(aluno));
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> delete(@PathVariable Integer id) {

		service.delete(id);

		return ResponseEntity.ok().build();
	}
}
