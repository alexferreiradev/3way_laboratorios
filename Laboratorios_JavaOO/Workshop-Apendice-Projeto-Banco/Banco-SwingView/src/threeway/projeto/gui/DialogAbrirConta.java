package threeway.projeto.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import threeway.projeto.modelo.Cliente;
import threeway.projeto.modelo.Conta;
import threeway.projeto.modelo.enums.EnumTipoConta;
import threeway.projeto.modelo.util.UtilData;
import threeway.projeto.service.ContaService;
import threeway.projeto.service.excecoes.CamposObrigatoriosException;
import threeway.projeto.service.excecoes.NumeroDeContaJaExistenteException;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class DialogAbrirConta extends JDialog {
	private ContaService service;
	private Cliente clienteSelecionado;
	private Conta conta;
	private JTextField tfSaldo;
	private JComboBox<EnumTipoConta> comboTipoConta;
	private JTextField tfNumero;
	private JButton btnCancelar;
	private JButton btnSalvar;
	private JLabel lblCamposObrigatrios;
	private JTextField txDtAbertura;
	
	/**
	* Responsável pela criação de novas instâncias desta classe.
	*
	* @param service
	*
	* @param cliente
	*
	* @throws ParseException
	*/
	public DialogAbrirConta( ContaService service, Cliente cliente ) throws ParseException {
		this.service = service;
		this.clienteSelecionado = cliente;
		this.conta = new Conta();
		initialize();
		tfSaldo.setText("0");
		
		caregaComboTiposConta();
		acaoBotaoCancelar();
		acaoBotaoSalvar();
	}
	
	
	/**
	* Método responsável por inicializar componentes da tela
	*
	* @throws ParseException
	*/
	private void initialize() throws ParseException {

		setModal(true);
		this.setLocationRelativeTo(null);
	
		setTitle("Abertura de Conta");
		setBounds(100, 100, 300, 250);
		getContentPane().setLayout(null);
	
		JLabel lblNumero = new JLabel("Numero *:");
		lblNumero.setBounds(10, 39, 80, 14);
		getContentPane().add(lblNumero);
	
		JLabel lblDataDeAbertura = new JLabel("Abertura:");
		lblDataDeAbertura.setBounds(10, 11, 80, 14);
		getContentPane().add(lblDataDeAbertura);
	
		JLabel lblSaldoInicial = new JLabel("Saldo Inicial:");
		lblSaldoInicial.setBounds(10, 67, 80, 14);
		getContentPane().add(lblSaldoInicial);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(175, 166, 99, 35);
		getContentPane().add(btnCancelar);
	
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(55, 166, 99, 35);
		getContentPane().add(btnSalvar);
	
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 153, 264, 2);
		getContentPane().add(separator);
	
		tfNumero = new JTextField();
		tfNumero.setBounds(110, 36, 75, 20);
		getContentPane().add(tfNumero);
	
		tfSaldo = new JTextField();
		tfSaldo.setBounds(110, 64, 75, 20);
		getContentPane().add(tfSaldo);
		tfSaldo.setColumns(10);
	
		lblCamposObrigatrios = new JLabel("(*) Campos Obrigatórios");
		lblCamposObrigatrios.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCamposObrigatrios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCamposObrigatrios.setBounds(138, 120, 136, 24);
		getContentPane().add(lblCamposObrigatrios);

		
		txDtAbertura = new JTextField();
		txDtAbertura.setBounds(110, 9, 170, 19);
		txDtAbertura.setEnabled(false);
		Date date = new Date();
		txDtAbertura.setText(UtilData.formataData(date));
		getContentPane().add(txDtAbertura);
		txDtAbertura.setColumns(10);
	}
	
	/**
	* Método responsável por adicionar evento ao botão salvar
	*
	*/
	private void acaoBotaoSalvar() {
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					montaObjetoConta();
					service.salvar(conta);
					JOptionPane.showMessageDialog(null, "Abertura de conta realizada com sucesso!");
					OperacoesBanco.recuperaContaCliente();
					OperacoesBanco.mudaStatusContaCriada(Boolean.TRUE);
					OperacoesBanco.defineEnabledBotoes();
					setVisible(Boolean.FALSE);
				} catch (CamposObrigatoriosException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}catch (NumeroDeContaJaExistenteException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				} catch (Exception ex1) {
					JOptionPane.showMessageDialog(null, "Algum campo pode ter sido preenchido inválido. Verifique e tente novamente!");
				}
			}
		});
	}

	/**
	* Método responsável por adicionar evento ao botão cancelar
	*
	*/
	private void acaoBotaoCancelar() {
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(Boolean.FALSE);
			}
		});
	}

	/**
	* Método responsável por carregar combo com o EnumTiposConta
	*
	*/
	private void caregaComboTiposConta() {
		for (EnumTipoConta tipoConta : EnumTipoConta.values()) {
			comboTipoConta.addItem(tipoConta);
		}
	}

	/**
	* Método responsável por montar objeto conta de acordo com os dados que o usuario informar
	*
	* @author Wilker Machado
	*
	* @throws Exception
	*/
	public void montaObjetoConta() throws Exception {
		this.conta = new Conta(this.clienteSelecionado, Integer.parseInt(tfNumero.getText()));
		this.conta.setSaldo(Double.parseDouble(tfSaldo.getText()));
		Date date = new Date();
		this.conta.setDataAbertura(date);
	}
}
