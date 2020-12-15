package Streaming;

@SuppressWarnings("unused")

public class Rap extends Faixa{
	private String[] paises;
	private int quantidadeDePaises;
	

	public Rap(String nome, int quantidadeDeVezesTocada, String estilo, String[] paises) {
		super(nome, quantidadeDeVezesTocada);
		setEstilo(estilo);
		setPaises(paises);
	}
	
	
	
	
	public Rap() {
		paises = new String[5];
		
	}

	public String[] getPaises() {
		return paises;
	}
	public void setPaises(String[] paises) {
		this.paises = paises;
	}
	
	public void adicionaPais(String pais) {
		this.paises[quantidadeDePaises] = pais;
		quantidadeDePaises++;
	}
	public String  valorComercial() {
		if(this.getEstilo().equals("Rap FreeStyle")) {
			return "\nO valor comercial de um Rap FreeStyle é: R$ 10.000,00";
		} 
		float valor = 1000;
		for(int i = 0; i< quantidadeDePaises;i++) {
			String paises = this.getPaises()[i];
			if(paises.equalsIgnoreCase("Japão")) {
				valor+= 15000;
			}else {
				valor+= 500;
			}

		}
		return "\nO valor comercial do Rap " + this.getNome() + " é: " + valor;
	}

}
