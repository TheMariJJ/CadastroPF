package aula;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame{
	JTextField txtNome = new JTextField();
	JLabel nome = new JLabel("NOME: ");
	JTextField txtEnd = new JTextField();
	JLabel end = new JLabel("ENDEREÇO: ");
	JTextField txtBairro = new JTextField();
	JLabel bairro = new JLabel("BAIRRO: ");
	JTextField txtCep = new JTextField();
	JLabel cep = new JLabel("CEP: ");
	JTextField txtCidade = new JTextField();
	JLabel cidade = new JLabel("CIDADE: ");
	JTextField txtEst = new JTextField();
	JLabel est = new JLabel("ESTADO: ");
	JTextField txtTel = new JTextField();
	JLabel tel = new JLabel("TELEFONE: ");	
	JTextField txtCel = new JTextField();
	JLabel cel = new JLabel("CELULAR: ");
	JTextField txtSexo = new JTextField();
	JLabel sexo = new JLabel("SEXO: ");
	JTextField txtRg = new JTextField();
	JLabel rg = new JLabel("RG: ");
	JTextField txtCpf = new JTextField();
	JLabel cpf = new JLabel("CPF: ");	

	public Cadastro(){
		super("Cadastro PF");
		
		Container paine = this.getContentPane();
		
		paine.add(nome);
		paine.add(txtNome);	
		nome.setBounds(10, 15, 45, 30);
		txtNome.setBounds(90, 15, 225, 30);
		
		paine.add(end);
		paine.add(txtEnd);	
		end.setBounds(10, 50, 70, 30);
		txtEnd.setBounds(90, 50, 225, 30);
		
		paine.add(cep);
		paine.add(txtCep);	
		cep.setBounds(335, 70, 40, 30);
		txtCep.setBounds(400, 70, 120, 30);
		
		paine.add(cidade);
		paine.add(txtCidade);	
		cidade.setBounds(10, 85, 70, 30);
		txtCidade.setBounds(90, 85, 225, 30);
		
		paine.add(est);
		paine.add(txtEst);	
		est.setBounds(335, 105, 70, 30);
		txtEst.setBounds(400, 105, 120, 30);
		
		paine.add(bairro);
		paine.add(txtBairro);	
		bairro.setBounds(10, 120, 70, 30);
		txtBairro.setBounds(90, 120, 225, 30);
		
		paine.add(tel);
		paine.add(txtTel);	
		tel.setBounds(10, 155, 70, 30);
		txtTel.setBounds(90, 155, 155, 30);		
		
		paine.add(cel);
		paine.add(txtCel);	
		cel.setBounds(335, 155, 70, 30);
		txtCel.setBounds(400, 155, 155, 30);
		
		paine.add(sexo);
		paine.add(txtSexo);	
		sexo.setBounds(335, 15, 55, 30);
		txtSexo.setBounds(400, 15, 65, 30);
		
		paine.add(rg);
		paine.add(txtRg);	
		rg.setBounds(10, 190, 55, 30);
		txtRg.setBounds(90, 190, 155, 30);
		
		paine.add(cpf);
		paine.add(txtCpf);	
		cpf.setBounds(335, 190, 70, 30);
		txtCpf.setBounds(400, 190, 155, 30);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Cadastro cadpf = new Cadastro();
	}
}