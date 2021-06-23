package minha_sorveteria;
import javax.swing.JOptionPane;

public class SorveteMaca extends Sorvete{

	public SorveteMaca(Fabrica fabrica) {
		setFabrica(fabrica);
		setNome("sorvete maçã");
		setTemperatura(-100);
		setTempo(5);
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
