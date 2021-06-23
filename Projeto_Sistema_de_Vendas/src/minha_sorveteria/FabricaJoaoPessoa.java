package minha_sorveteria;

public class FabricaJoaoPessoa implements Fabrica{

	@Override
	public Leite criarLeite() {
		return new LeiteNatural();
	}

	@Override
	public Chocolate criarChocolate() {
		return new ChocolatePreto();
	}
	
	@Override
	public Acucar criarAcucar() {
		return new AcucarGranulado();
	}

	@Override
	public Fruta criarFruta() {
		return new FrutaMelancia();
	}

	@Override
	public Recheio criarRecheio() {
		return new RecheioAcai();
	}
}
