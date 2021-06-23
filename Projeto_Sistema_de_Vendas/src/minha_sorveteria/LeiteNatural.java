package minha_sorveteria;

public class LeiteNatural implements Leite{

	@Override
	public String getDescricao() {
		return "Leite natural";
	}

	@Override
	public double getPreco() {
		return 4.50;
	}

}
