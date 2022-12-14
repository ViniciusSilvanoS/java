package model;

public class Produto {

	private static int count = 1;
	
	private int id;
	private String nome;
	private double preco;
	
	
	
	public Produto(String nome, double preco) {
		super();
		this.id = Produto.count;
		this.nome = nome;
		this.preco = preco;
		
		Produto.count += 1;
	}

	//// ----------------------------------------------------

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
}
