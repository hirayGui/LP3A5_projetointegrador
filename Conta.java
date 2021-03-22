package projeto_integrador;

public class Conta {

	private String nome, numero_conta;
	private double saldo;
	
	public Conta(String nome, String numero_conta, double saldo) {
		this.nome = nome;
		this.numero_conta = numero_conta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero_conta() {
		return numero_conta;
	}
	
	public void setNumero_conta(String numero_conta) {
		this.numero_conta = numero_conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
