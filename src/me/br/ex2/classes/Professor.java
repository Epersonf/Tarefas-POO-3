package me.br.ex2.classes;

import java.util.ArrayList;

public class Professor extends Usuario {
	
	ArrayList<Turma> turmas;
	
	public Professor(String nome, String cpf, String dataDeNascimento) {
		super(nome, cpf, dataDeNascimento);
		turmas = new ArrayList<Turma>();
	}
	
	public void addTurma(Turma t) {
		turmas.add(t);
	}
	
}
