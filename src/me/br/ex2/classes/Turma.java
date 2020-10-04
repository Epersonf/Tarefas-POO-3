package me.br.ex2.classes;

import java.util.ArrayList;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Turma {
	private Disciplina materia;
	private String codigo;
	private Professor professor;
	private ArrayList<String> horarios;
	private ArrayList<Aluno> alunos;
	
	Turma(Professor professor, Disciplina materia, String codigo, ArrayList<String> horarios) {
		this.horarios = new ArrayList<String>(horarios);
		this.alunos = new ArrayList<Aluno>();
		this.professor = professor;
		this.professor.addTurma(this);
		this.materia = materia;
		this.codigo = codigo;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public float calculaMedia(Aluno aluno) throws NotImplementedException {
		throw new NotImplementedException("Nao implementada media de aluno na turma.");
	}
	
	public ArrayList<String> getHorarios() {
		return new ArrayList<String>(this.horarios);
	}
	
	public String getDescricaoEmenta() {
		return materia.getDescricaoEmenta();
	}
}
