package minha_sorveteria;

public class FabricaCampinaGrande implements Fabrica{

	@Override
	public Leite criarLeite() {
		return new LeiteCondensado();
	}

	@Override
	public Chocolate criarChocolate() {
		return new ChocolateBranco();
	}
	
	@Override
	public Acucar criarAcucar() {
		return new AcucarGrosso();
	}

	@Override
	public Fruta criarFruta() {
		return new FrutaMorango();
	}

	@Override
	public Recheio criarRecheio() {
		return new RecheioAcai();
	}
}
