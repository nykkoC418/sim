package com.onFit.adm.Mapper;

import Entity.aluno;
import dto.alunoDto;

public class alunoMapper {

	public static alunoDto mapToalunoDto(aluno Aluno) {
		return new alunoDto(
				Aluno.getId(),
				Aluno.getNome(),
				Aluno.getCPF(),
				Aluno.getSenha()
				);
	}
	
	public static aluno mapToaluno(alunoDto AlunoDto) {
		return new aluno(
				AlunoDto.getId(),
				AlunoDto.getNome(),
				AlunoDto.getCpf(),
				AlunoDto.getSenha()
				);
				
	}
}
