package main;
import minha_sorveteria.*;

public class Cliente {

	public static void main(String args[]) {
		
		Facade fachada = Facade.getInstance(); //pegamos a única instância de facade
		fachada.fazer_pedido();
	}
}
