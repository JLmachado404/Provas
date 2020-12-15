package Streaming;

public abstract class Faixa implements Gravadora {
	private String nome;
	private int quantidadeDeVezesTocada;
	private String faixaEstilo;
	
	public Faixa(String nome, int quantidadeDeVezesTocada) {
		setNome(nome);
		setQuantidadeDeVezesTocada(quantidadeDeVezesTocada);
	}
	


	public Faixa() {
	}
	
	public String getEstilo() {
		return faixaEstilo;
	}

	public void setEstilo(String estilo) {
		this.faixaEstilo = estilo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeDeVezesTocada() {
		return quantidadeDeVezesTocada;
	}
	public void setQuantidadeDeVezesTocada(int quantidadeDeVezesTocada) {
		this.quantidadeDeVezesTocada = quantidadeDeVezesTocada;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\nEstilo: " + faixaEstilo + " \n";
	}
	

}
