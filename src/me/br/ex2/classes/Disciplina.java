package me.br.ex2.classes;

public class Disciplina {
	private final String nome;
	private final String codigo;
	private String descricaoEmenta;

	public Disciplina(String nome, String codigo, String descricaoEmenta) {
		this.nome = nome;
		this.codigo = codigo;
		this.descricaoEmenta = descricaoEmenta;
	}
	
	public String getDescricaoEmenta() {
		return descricaoEmenta;
	}
}
