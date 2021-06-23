package minha_sorveteria;
import javax.swing.JOptionPane;

public class SorveteAveia extends Sorvete{

	public SorveteAveia(Fabrica fabrica) {
		setFabrica(fabrica);
		setNome("sorvete aveia");
		setTemperatura(-15);
		setTempo(7);
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
