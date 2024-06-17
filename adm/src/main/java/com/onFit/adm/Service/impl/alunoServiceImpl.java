package com.onFit.adm.Service.impl;

import org.springframework.stereotype.Service;

import com.onFit.adm.Mapper.alunoMapper;
import com.onFit.adm.Service.alunoService;
import com.onFit.adm.exceptions.ResourceNotFoundException;

import Entity.aluno;
import dto.alunoDto;
import lombok.AllArgsConstructor;
import repository.alunoRepository;

@Service
@AllArgsConstructor
public class alunoServiceImpl implements alunoService {
	
	private alunoRepository AlunoRepository;
	@Override
	public alunoDto createaluno(alunoDto AlunoDto) {
		
		aluno Aluno = alunoMapper.mapToaluno(AlunoDto);
		aluno savedaluno = AlunoRepository.save(Aluno);
		return alunoMapper.mapToalunoDto(savedaluno);
		
	}
	public alunoRepository getAlunoRepository() {
		return AlunoRepository;
	}
	public void setAlunoRepository(alunoRepository alunoRepository) {
		AlunoRepository = alunoRepository;
	}
	
	@Override
	public alunoDto getalunoById(Long AlunoId) {
		aluno Aluno = AlunoRepository.findById(AlunoId)
			.orElseThrow(() ->
			new ResourceNotFoundException("aluno não existente com este id: " + AlunoId));
		return alunoMapper.mapToalunoDto(Aluno);
	}
	
	@Override
	public List<alunoDto> getAllaluno() {
		List<aluno> Alunos = AlunoRepository.findAll();
	return null;	
	}
}
