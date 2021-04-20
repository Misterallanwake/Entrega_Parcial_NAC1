// O conteúdo da entrega parcial da Nac está na classe 'Filme'.

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	public MeuLabel(String texto) {
		super(texto);
		init();
	}

	public void init() {
		this.setForeground(new Color(0, 0, 0));
		this.setFont(new Font(null, Font.BOLD, 16));
		this.setHorizontalAlignment(JLabel.CENTER);
	}
}
