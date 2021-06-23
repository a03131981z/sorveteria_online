package minha_sorveteria;

import javax.swing.JOptionPane;

public class Facade {

	private static Facade uniqueInstance;
	protected Sorveteria sorveteria = null;
	protected Sorvete sorvete = null;
	protected Fabrica fabrica = null;

	private Facade() {

	}

	public static Facade getInstance() {
		if (uniqueInstance == null) {

			synchronized (Facade.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Facade();
				}
			}
		}
		return uniqueInstance;
	}

	public void fazer_pedido() {

		String opcao = "";
		String opcao_fabrica = "";
		boolean fim = false;
		double preco = 0.0;
		
		JOptionPane.showMessageDialog(null, "FAÇA SEU SELF-SERVICE ONLINE! \n           Plataforma BondFaro");
		JOptionPane.showMessageDialog(null, "##########\t Sorveteria BondFaro \t##########\n");

		while (fim != true) {

			opcao = JOptionPane.showInputDialog(
					"Faça seu pedido\n\n1 Sorvete Baunilha\n2 Sorvete Aveia\n3 Sorvete Maçã\n4 Sorvete Morango\n5 Sair\nOpção: ");

			if (opcao.equals("1")) {
				opcao_fabrica = JOptionPane.showInputDialog(
						"Escolha o estilo do ingrediente:\n1 João Pessoa\n2 Campina Grande\n3 Mamanguape: ");

				if (opcao_fabrica.equals("1")) {
					fabrica = new FabricaJoaoPessoa();
					sorvete = new SorveteBaunilha(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("baunilha", "João Pessoa");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("2")) {
					fabrica = new FabricaCampinaGrande();
					sorvete = new SorveteBaunilha(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("baunilha", "Campina Grande");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("3")) {
					fabrica = new FabricaMamanguape();
					sorvete = new SorveteBaunilha(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("baunilha", "Mamanguape");
					System.out.println(sorvete);

				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				preco += sorvete.preco();

			} else if (opcao.equals("2")) {
				opcao_fabrica = JOptionPane.showInputDialog(
						"Escolha o estilo do ingrediente:\n1 João Pessoa\n2 Campina Grande\n3 Mamanguape: ");

				if (opcao_fabrica.equals("1")) {
					fabrica = new FabricaJoaoPessoa();
					sorvete = new SorveteAveia(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("aveia", "João Pessoa");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("2")) {
					fabrica = new FabricaCampinaGrande();
					sorvete = new SorveteAveia(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("aveia", "Campina Grande");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("3")) {
					fabrica = new FabricaMamanguape();
					sorvete = new SorveteAveia(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("aveia", "Mamanguape");
					System.out.println(sorvete);

				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				preco += sorvete.preco();

			} else if (opcao.equals("3")) {
				opcao_fabrica = JOptionPane.showInputDialog(
						"Escolha o estilo do ingrediente:\n1 João Pessoa\n2 Campina Grande\n3 Mamanguape: ");

				if (opcao_fabrica.equals("1")) {
					fabrica = new FabricaJoaoPessoa();
					sorvete = new SorveteMaca(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("maçã", "João Pessoa");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("2")) {
					fabrica = new FabricaCampinaGrande();
					sorvete = new SorveteMaca(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("maçã", "Campina Grande");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("3")) {
					fabrica = new FabricaMamanguape();
					sorvete = new SorveteMaca(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("maçã", "Mamanguape");
					System.out.println(sorvete);

				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				preco += sorvete.preco();

			} else if (opcao.equals("4")) {
				opcao_fabrica = JOptionPane.showInputDialog(
						"Escolha o estilo do ingrediente:\n1 João Pessoa\n2 Campina Grande\n3 Mamanguape: ");

				if (opcao_fabrica.equals("1")) {
					fabrica = new FabricaJoaoPessoa();
					sorvete = new SorveteMorango(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("morango", "João Pessoa");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("2")) {
					fabrica = new FabricaCampinaGrande();
					sorvete = new SorveteMorango(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("morango", "Campina Grande");
					System.out.println(sorvete);

				} else if (opcao_fabrica.equals("3")) {
					fabrica = new FabricaMamanguape();
					sorvete = new SorveteMorango(fabrica);
					sorveteria = new Sorveteria(fabrica);
					sorvete = sorveteria.pedirSorvete("morango", "Mamanguape");
					System.out.println(sorvete);

				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				preco += sorvete.preco();

			} else if (opcao.equals("5")) {
				JOptionPane.showMessageDialog(null, "Saindo do menu...");				
				if (preco != 0) {
					System.out.println("Preço final: " + preco + " reais, pagos só com cartão de crédito");

				} else {
					System.out.println("Você desistiu do sorvete! Ahh tão bom ele... Que pena!");
				}
				fim = true;

			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
