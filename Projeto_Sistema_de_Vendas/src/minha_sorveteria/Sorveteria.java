package minha_sorveteria;
public class Sorveteria {

	private Fabrica fabrica;
	
	public Sorveteria(Fabrica fabrica) {
		setFabrica(fabrica);
	}
	
	public Sorvete pedirSorvete(String tipo, String estilo){
		Sorvete sorvete = criarSorvete(tipo, estilo);
		sorvete.preparo();	
		sorvete.preparar();
		sorvete.box();
		System.out.println();
		return sorvete;
	}
	
	public Sorvete criarSorvete(String tipo, String estilo) {
		Sorvete sorvete = null;

		if (estilo.equals("João Pessoa")) {
			if (tipo.equals("baunilha")) {
				sorvete = new SorveteBaunilha(new FabricaJoaoPessoa());

			} else if (tipo.equals("aveia")) {
				sorvete = new SorveteAveia(new FabricaJoaoPessoa());

			} else if (tipo.equals("maçã")) {
				sorvete = new SorveteMaca(new FabricaJoaoPessoa());
				
			}else if(tipo.equals("morango")){
				sorvete = new SorveteMorango(new FabricaJoaoPessoa());
			}

		} else if (estilo.equals("Campina Grande")) {
			if (tipo.equals("baunilha")) {
				sorvete = new SorveteBaunilha(new FabricaCampinaGrande());

			} else if (tipo.equals("aveia")) {
				sorvete = new SorveteAveia(new FabricaCampinaGrande());

			} else if (tipo.equals("maçã")) {
				sorvete = new SorveteMaca(new FabricaCampinaGrande());
				
			}else if(tipo.equals("morango")){
				sorvete = new SorveteMorango(new FabricaCampinaGrande());
			}
			
		}else if(estilo.equals("Mamanguape")){
			if (tipo.equals("baunilha")) {
				sorvete = new SorveteBaunilha(new FabricaMamanguape());

			} else if (tipo.equals("aveia")) {
				sorvete = new SorveteAveia(new FabricaMamanguape());

			} else if (tipo.equals("maçã")) {
				sorvete = new SorveteMaca(new FabricaMamanguape());
			
			}else if(tipo.equals("morango")){
				sorvete = new SorveteMorango(new FabricaMamanguape());
			}
		}
		return sorvete;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}
}
