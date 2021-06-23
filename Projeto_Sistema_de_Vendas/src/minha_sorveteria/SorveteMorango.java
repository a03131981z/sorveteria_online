package minha_sorveteria;
import javax.swing.JOptionPane;

public class SorveteMorango extends Sorvete {

	public SorveteMorango(Fabrica fabrica) {
		setFabrica(fabrica);
		setNome("sorvete aveia");
		setTemperatura(-100);
		setTempo(8);
	}
	
	@Override
	public void preparar() {
		JOptionPane.showMessageDialog(null, "Preparando "+getNome()+"...");
		setLeite(getFabrica().criarLeite());
		setAcucar(getFabrica().criarAcucar());
		setChocolate(getFabrica().criarChocolate());
		setFruta(getFabrica().criarFruta());
		setRecheio(getFabrica().criarRecheio());
	}
}
