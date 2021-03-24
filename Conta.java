package projeto_integrador;

public class Conta {

	private String nome, numero_conta;
	private double saldo, salario;
	
	public Conta(String nome, String numero_conta, double saldo, double salario) {
		this.nome = nome;
		this.numero_conta = numero_conta;
		this.saldo = saldo;
		this.salario = salario;
	}
	
	public void updateSaldo(String tipo, double valor) {
		if(tipo == "entrada" || tipo == "Entrada") {
			this.saldo = this.saldo + valor;
		}else
			if(tipo == "saida" || tipo == "Saida") {
				this.saldo = this.saldo - valor;
			}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero_conta() {
		return numero_conta;
	}
	
	public double getSaldo() {
		return saldo;
	}	
	
	public double getSalario() {
		return salario;
	}
	
}
