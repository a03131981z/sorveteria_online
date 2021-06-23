package minha_sorveteria;

public interface Fabrica {
	
	public Leite criarLeite();
	public Chocolate criarChocolate();
	public Fruta criarFruta();
	public Acucar criarAcucar();
	public Recheio criarRecheio();
}
