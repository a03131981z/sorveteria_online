package minha_sorveteria;
import javax.swing.JOptionPane;

public class SorveteBaunilha extends Sorvete{
	
	public SorveteBaunilha(Fabrica fabrica) {
		setFabrica(fabrica);
		setNome("sorvete baunilha");
		setTemperatura(-25);
		setTempo(15);
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
