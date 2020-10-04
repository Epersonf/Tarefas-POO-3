package me.br.ex1.classes;

public class Carro {
	String placa;
	float preco;
	
	
	public void setCommonValues(String placa) {
		this.placa = placa;
	}
	
	
	//Locadora
	private float aluguel = 500;
	private String nomeDeLocatario;
	Carro(String placa, float aluguel, String nomeDeLocatario) {
		setCommonValues(placa);
		this.aluguel = aluguel;
		this.nomeDeLocatario = nomeDeLocatario;
	}
	
	
	//Revendedora
	private float kmRodados;
	private float precoRevenda;
	private String nomeVendedor;
	private boolean vendido;
	
	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	Carro(String placa, float kmRodados, float precoRevenda, String nomeVendedor, boolean vendido) {
		this.setCommonValues(placa);
		this.nomeVendedor = nomeVendedor;
		this.kmRodados = kmRodados;
		this.precoRevenda = precoRevenda;
		this.vendido = vendido;
	}
	
	//Oficina
	private float precoReparo;
	private boolean quebrado = false;
	Carro(float precoReparo) {
		setCommonValues(placa);
		this.quebrado = true;
		this.precoReparo = precoReparo;
	}
	
	//DETRAN
	private float IPVA;
	private boolean emDia = false;
	Carro(String placa, float IPVA, boolean emDia) {
		setCommonValues(placa);
		this.emDia = emDia;
	}
	
	public void setEmDia(boolean v) {
		emDia = v;
	}
	
	public boolean estaEmDia() {
		return emDia;
	}
}
