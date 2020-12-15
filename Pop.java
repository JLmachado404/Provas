package Streaming;

import java.text.DecimalFormat;

public class Pop extends Faixa {
	private int qtdTocadoSpotify;
	private int qtdDeProcessos;
	
	
	public Pop(String nome, int quantidadeDeVezesTocada, int qtdTocadoSpotify, int qtdDeProcessos) {
		super(nome, quantidadeDeVezesTocada);
		setQtdDeProcessos(qtdDeProcessos);
		setQtdTocadoSpotify(qtdTocadoSpotify);
	}
	
	
	public Pop() {
	}

	public int getQtdTocadoSpotify() {
		return qtdTocadoSpotify;
	}
	public void setQtdTocadoSpotify(int qtdTocadoSpotify) {
		this.qtdTocadoSpotify = qtdTocadoSpotify;
	}
	public int getQtdDeProcessos() {
		return qtdDeProcessos;
	}
	public void setQtdDeProcessos(int qtdDeProcessos) {
		this.qtdDeProcessos = qtdDeProcessos;
	}
	
	public String valorComercial() {
		DecimalFormat df = new DecimalFormat("0.00");
		double valor = 0;
		valor = (this.getQtdTocadoSpotify() *0.01) - (this.getQtdDeProcessos()*100);
		if(valor < -1) {
			return "\nA faixa de Pop teve tantos processos que não possui valor comercial!";
		}
		return "O valor da Faixa de pop " + this.getNome() + " é: R$" + df.format(valor);
		
		
	}

}
