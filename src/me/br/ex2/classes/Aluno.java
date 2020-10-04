package me.br.ex2.classes;

import java.util.ArrayList;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Aluno extends Usuario {
	private ArrayList<Inscricao> historico;
	
	public Aluno(String nome, String cpf, String dataDeNascimento) {
		super(nome, cpf, dataDeNascimento);
	}
	
	public float calculaCR() throws NotImplementedException {
		throw new NotImplementedException("CR ainda nao implementado");
	}
	
	public void mostrarHistorico() throws NotImplementedException {
		throw new NotImplementedException("Mostrar historico nao implementado");		
	}
	
	public void addInscricao(Inscricao inscricao) {
		historico.add(inscricao);
	}
}
