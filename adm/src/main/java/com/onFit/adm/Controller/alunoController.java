package com.onFit.adm.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.onFit.adm.Service.alunoService;

import dto.alunoDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/alunos")
public class alunoController {
	
private alunoService AlunoService;

//construcao Add aluno rest api
@PostMapping
public ResponseEntity<alunoDto> createaluno(@RequestBody alunoDto AlunoDto){
	alunoDto savedaluno = alunoService.createaluno(AlunoDto);
	return new ResponseEntity<>(savedaluno, HttpStatus.CREATED);

}

public alunoService getAlunoService() {
	return AlunoService;
}

public void setAlunoService(alunoService alunoService) {
	AlunoService = alunoService;
}

// construcao Get aluno rest api
@GetMapping("{id}")
public ResponseEntity<alunoDto> getalunoById(@PathVariable("id") Long Aluno){
	alunoDto AlunoDto = alunoService.getalunoById(AlunoId);
	return ResponseEntity.ok(AlunoDto);
}

}
