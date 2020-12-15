package Streaming;
@SuppressWarnings("unused")
public class Funk extends Faixa {
	private String[] parceiros;
	//private String estilo;
	private int quantidadeDeParceiros;
	
	
	public Funk(String nome, int quantidadeDeVezesTocada, String[] parceiros, String estilo) {
		super(nome, quantidadeDeVezesTocada);
		setParceiros(parceiros);
		setEstilo(estilo);;
	}
	
	
	
	
	public Funk() {
		parceiros = new String[10];
		quantidadeDeParceiros = 0;
	}




	public String[] getParceiros() {
		return parceiros;
	}
	public void setParceiros(String[] parceiros){
		this.parceiros = parceiros;
		quantidadeDeParceiros++;
	}

	
	public void adicionaParceiro(String parceiro) {
		this.parceiros[quantidadeDeParceiros] = parceiro;
		quantidadeDeParceiros++;
	}
	@Override
	public String valorComercial() {
		if(this.getEstilo().equals("Funk Proibidão")) {
			return ("O valor comercial do funk proibidão é: R$ 1000");

		}else {
			float preco = 0;
			for(int i = 0; i < quantidadeDeParceiros;i++) {
				String parceiros = this.getParceiros()[i];
				if(parceiros.equalsIgnoreCase("Jojo Toddynho")) {
					preco+= 100000;
				}else {
					preco+= 50000;
				}
				
				
			}
			return "\nO valor comercial do funk normal: "+ this.getNome() + " é: R$" + preco + "\n";
		}
		
	}
}