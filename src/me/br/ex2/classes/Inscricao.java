package me.br.ex2.classes;

public class Inscricao {
	private final Turma turma;
	private final float nota;
	
	public Inscricao(Turma turma, float nota) {
		this.turma = turma;
		this.nota = nota;
	}
	
	public Turma getTurma() {
		return this.turma;
	}
	
	public float getNota() {
		return nota;
	}
}
