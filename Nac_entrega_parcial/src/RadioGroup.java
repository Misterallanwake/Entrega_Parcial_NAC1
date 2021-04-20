// O conteúdo da entrega parcial da Nac está na classe 'Filme'.

import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioGroup extends JPanel {
	
	private ButtonGroup grupo = new ButtonGroup();
	private List<String> opcoes;

	public RadioGroup(List<String> opcoes) {
		this.opcoes = opcoes;
		init();
	}

	private void init() {
		opcoes.forEach( opcao -> {
			JRadioButton button = new JRadioButton(opcao);
			grupo.add(button); 
			this.add(button);
		});
		
		
	}
	
	
	
	
}
