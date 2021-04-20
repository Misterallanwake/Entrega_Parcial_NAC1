// O conteúdo da entrega parcial da Nac está na classe 'Filme'.

import java.awt.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Lista extends JFrame {
	
	public void init() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		JTabbedPane abas = new JTabbedPane();
		
		JPanel panelCadastro = new JPanel();
		
		panelCadastro.add(new JLabel(new ImageIcon("src/wandavision.jpeg")));
		JTextField textFieldTitulo = new JTextField(10);
		JTextField textFieldSinopse = new JTextField(10);
		JLabel Titulo = new MeuLabel("Titulo");
		JLabel Sinopse = new MeuLabel("Sinopse");
		JLabel Genero = new MeuLabel("Genero");
		JLabel OndeAssistir = new MeuLabel("Onde assistir");
		JLabel Avaliacao = new MeuLabel("Avaliação");
		JButton buttonSalvar = new JButton("Salvar");
		JButton buttonCancelar = new JButton("Cancelar");
		RadioGroup radioGroup = new RadioGroup(java.util.List.of("Netflix", "Prime Video", "Pirate Bay"));
		JCheckBox checkBox = new JCheckBox("Assistido");
		
		panelCadastro.add(Titulo);
		panelCadastro.add(textFieldTitulo);
		panelCadastro.add(Sinopse);
		panelCadastro.add(textFieldSinopse);
		panelCadastro.add(Genero);
		
		String[] GeneroCombo = {"                     ", "        Ação", "     Aventura", "     Comédia", "       Drama"};
		panelCadastro.add(new JComboBox<String>(GeneroCombo));
		
		panelCadastro.add(OndeAssistir);	
		panelCadastro.add(radioGroup);
		panelCadastro.add(checkBox);
		panelCadastro.add(Avaliacao);
		panelCadastro.add(new StarRater(5));
		panelCadastro.add(buttonSalvar);
		panelCadastro.add(buttonCancelar);
		

		CalculadoraListener listener = new CalculadoraListener(textFieldTitulo, textFieldSinopse);
		buttonSalvar.addActionListener(listener);
		textFieldTitulo.addMouseListener(listener);
		
		abas.add("Cadastro", panelCadastro);
		abas.add("Lista", new JLabel("Preparar para a entrega final"));
		
		add(abas);
		
		setSize(510, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Lista().init();
	}
}
