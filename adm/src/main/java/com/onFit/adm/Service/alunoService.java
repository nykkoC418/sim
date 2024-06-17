package com.onFit.adm.Service;

import dto.alunoDto;

public interface alunoService {
	static alunoDto createaluno(alunoDto AlunoDto);
	
	alunoDto getalunoById(Long AlunoId);
	
	List<alunoDto> getAllaluno();
}
