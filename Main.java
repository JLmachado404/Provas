package Streaming;

import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		int opcao = 1;
		
		Scanner sc = new Scanner(System.in);
		
		Gravadora[] musicas = new Gravadora[100];
		
		int quantidadeDeMusicas = 0;
		
		do {
			System.out.println("1-Cadastrar um Funk:");
			System.out.println("2-Cadastrar um Pop");
			System.out.println("3-cadastrar um Rap");
			System.out.println("4-Listas faixas: ");
			System.out.println(("5-Listar valor comercial:"));
			System.out.println(("0-sair"));
			
			opcao = sc.nextInt();
			sc.nextLine();
			Faixa musica;
			
			switch(opcao) {
				case 1:
					musica = new Funk();
					System.out.println("Digite o nome do Funk:");
					musica.setNome(sc.nextLine());
					System.out.println("Quantas vezes foi tocada na rádio?:");
					musica.setQuantidadeDeVezesTocada(sc.nextInt());
					sc.nextLine();
					System.out.println("Escolha o estilo:");
					System.out.println("0 - Proibidão\n1 - Normal ");
					int escolha = sc.nextInt();
					sc.nextLine();
					if(escolha == 0) {
						musica.setEstilo("Funk Proibidão");
					}else if (escolha == 1) {
						musica.setEstilo("Funk Normal");
						}
					System.out.println("Há quantos  compositores?:");
					int qtdCompositores = sc.nextInt();
					sc.nextLine();
					if(qtdCompositores <= 10 && qtdCompositores > 0) {
					for(int i = 0; i < qtdCompositores;i++) {
						System.out.println("Digite o nome do compositor:");
						String compositor = sc.nextLine();
						((Funk)musica).adicionaParceiro(compositor);
					}
					musicas[quantidadeDeMusicas] = musica;
					quantidadeDeMusicas++;} else {
						System.out.println("\nO mínimo de compositores é 1 e o máximo é 10!\n");
					}
					
					break;
				case 2:
					musica = new Pop();
					musica.setEstilo("Pop");
					System.out.println("Digite o nome da Faixa:");
					musica.setNome(sc.nextLine());
					System.out.println("Quantas vezes foi tocada na rádio?");
					musica.setQuantidadeDeVezesTocada(sc.nextInt());
					sc.nextLine();
					System.out.println("Quantas vezes foi tocada no spotify?");
					((Pop)musica).setQtdTocadoSpotify(sc.nextInt());
					sc.nextLine();
					System.out.println("Quantos processos possui essa faixa?");
					((Pop)musica).setQtdDeProcessos(sc.nextInt());
					musicas[quantidadeDeMusicas] = musica;
					quantidadeDeMusicas++;
					break;
				case 3:
					musica = new Rap();
					System.out.println("Digite o nome do Rap: ");
					musica.setNome(sc.nextLine());
					System.out.println("Quantas vezes foi tocada na rádio?:");
					musica.setQuantidadeDeVezesTocada(sc.nextInt());
					sc.nextLine();
					System.out.println("Qual o estilo?");
					System.out.println("0 - FreeStyle:\n1 - Flow\n2 - Gangsta");
					int escolha2 = sc.nextInt();
					sc.nextLine();
					if(escolha2 == 0) {
						musica.setEstilo("Rap FreeStyle");
					}else if (escolha2 == 1) {
						musica.setEstilo("Flow Rap");
					} else if (escolha2 == 2) {
						musica.setEstilo("Gangsta Rap");
					}
					System.out.println("Esse rap tocou em quantos países?:");
					int qtdDePaises = sc.nextInt();
					sc.nextLine();
					if(qtdDePaises <= 5 && qtdDePaises > 0 ) {
						for(int i = 0;i < qtdDePaises;i++) {
						System.out.println("Digite o nome de um país:");
						String pais = sc.nextLine();
						((Rap)musica).adicionaPais(pais);
						}
					musicas[quantidadeDeMusicas] = musica;
					quantidadeDeMusicas++;
					} else {
						System.out.println("\nO mínimo de países é 1 e o máximo é 5!\n");
					}
					break;
				case 4:
					for(int i = 0; i < quantidadeDeMusicas;i++) {
						System.out.println(musicas[i]);
					}
					break;
				case 5:
					for(int i = 0;i < quantidadeDeMusicas;i++) {
						System.out.println(musicas[i].valorComercial());
					}
					break;

			}
			System.out.println("\nInsira algo para continuar!\n");
			sc.nextLine();
		}while(opcao != 0);
		System.out.println("Obrigado e até a próxima!");
		sc.close();

	}

}
