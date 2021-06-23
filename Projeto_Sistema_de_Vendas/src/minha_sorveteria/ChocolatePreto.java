package minha_sorveteria;

public class ChocolatePreto implements Chocolate{

	@Override
	public String getDescricao() {
		return "Chocolate preto";
	}

	@Override
	public double getPreco() {
		return 3.50;
	}

}
