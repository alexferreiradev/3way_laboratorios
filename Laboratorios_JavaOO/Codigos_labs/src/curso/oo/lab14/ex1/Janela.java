package curso.oo.lab14.ex1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public final class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel jlAgencia;
	private JTextField jtfAgencia;
	private JLabel jlConta;
	private JTextField jtfConta;
	private JSeparator jSeparator01;
	private JLabel jlNome;
	private JTextField jtfNome;
	private JLabel jlEndereco;
	private JTextField jtfEndereco;
	private JLabel jlTelefone;
	private JTextField jtfTelefone;
	private JLabel jlCpf;
	private JTextField jtfCpf;
	private JRadioButton jrbCorrente;
	private JRadioButton jrbPoupanca;
	private ButtonGroup bgContas;
	private JSeparator jSeparator02;
	private JButton jbConsultar;
	private JButton jbAtualizar;
	private JButton jbFechar;

	public Janela() {
		
		setSize(400, 255);
		setTitle("Linguagem de Programação II");
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centralizar();

		jlAgencia = new JLabel("Código da Agência:");
		jlAgencia.setBounds(10, 10, 110, 18);
		add(jlAgencia);

		jtfAgencia = new JTextField();
		jtfAgencia.setBounds(125, 10, 50, 20);
		add(jtfAgencia);

		jlConta = new JLabel("Número da Conta:");
		jlConta.setBounds(205, 10, 105, 18);
		add(jlConta);

		jtfConta = new JTextField();
		jtfConta.setBounds(315, 10, 60, 20);
		add(jtfConta);

		jSeparator01 = new JSeparator();
		jSeparator01.setBounds(10, 40, 365, 10);
		add(jSeparator01);

		jlNome = new JLabel("Nome:");
		jlNome.setBounds(10, 50, 60, 18);
		jlNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlNome);

		jtfNome = new JTextField();
		jtfNome.setBounds(75, 50, 300, 20);
		add(jtfNome);

		jlEndereco = new JLabel("Endereço:");
		jlEndereco.setBounds(10, 75, 60, 18);
		jlEndereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlEndereco);

		jtfEndereco = new JTextField();
		jtfEndereco.setBounds(75, 75, 300, 20);
		add(jtfEndereco);

		jlTelefone = new JLabel("Telefone:");
		jlTelefone.setBounds(10, 100, 60, 18);
		jlTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlTelefone);

		jtfTelefone = new JTextField();
		jtfTelefone.setBounds(75, 100, 300, 20);
		add(jtfTelefone);

		jlCpf = new JLabel("CPF:");
		jlCpf.setBounds(10, 125, 60, 18);
		jlCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		add(jlCpf);

		jtfCpf = new JTextField();
		jtfCpf.setBounds(75, 125, 300, 20);
		add(jtfCpf);

		jrbCorrente = new JRadioButton("Conta Corrente");
		jrbCorrente.setBounds(100, 150, 111, 20);
		jrbCorrente.setMnemonic('C');
		jrbCorrente.setSelected(true);
		add(jrbCorrente);

		jrbPoupanca = new JRadioButton("Conta Poupança");
		jrbPoupanca.setBounds(225, 150, 118, 20);
		jrbPoupanca.setMnemonic('P');
		add(jrbPoupanca);

		bgContas = new ButtonGroup();
		bgContas.add(jrbCorrente);
		bgContas.add(jrbPoupanca);

		jSeparator02 = new JSeparator();
		jSeparator02.setBounds(10, 180, 365, 10);
		add(jSeparator02);

		jbConsultar = new JButton("Consultar");
		jbConsultar.setBounds(35, 190, 100, 23);
		jbConsultar.setMnemonic('S');
		add(jbConsultar);

		jbAtualizar = new JButton("Atualizar");
		jbAtualizar.setBounds(145, 190, 100, 23);
		jbAtualizar.setMnemonic('A');
		jbAtualizar.setEnabled(false);
		add(jbAtualizar);

		jbFechar = new JButton("Fechar");
		jbFechar.setBounds(255, 190, 100, 23);
		jbFechar.setMnemonic('F');
		add(jbFechar);

	}

	private void centralizar() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension janela = getSize();

		if (janela.height > screen.height) {
			setSize(janela.width, screen.height);
		}
		if (janela.width > screen.width) {
			setSize(screen.width, janela.height);
		}

		setLocation((screen.width - janela.width) / 2,
				(screen.height - janela.height) / 2);
	}

	public static void main(String args[]) {
		Janela janela = new Janela();
		janela.setVisible(true);
	}
}