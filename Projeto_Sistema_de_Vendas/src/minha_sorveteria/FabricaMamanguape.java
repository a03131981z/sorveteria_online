package minha_sorveteria;

public class FabricaMamanguape implements Fabrica {

	@Override
	public Leite criarLeite() {
		return new LeiteNatural();
	}

	@Override
	public Chocolate criarChocolate() {
		return new ChocolateSuico();
	}

	@Override
	public Fruta criarFruta() {
		return new FrutaMorango();
	}

	@Override
	public Acucar criarAcucar() {
		return new AcucarGrosso();
	}

	@Override
	public Recheio criarRecheio() {
		return new RecheioAveia();
	}
}
