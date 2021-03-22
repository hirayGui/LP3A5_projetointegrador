package projeto_integrador;

import java.util.Date;

public class Transacao {

	private int id;
	private static int countId;
	private double valor;
	private Date data_transacao;
	private String tipo; //entrada ou saída
	
	public Transacao(double valor, Date data_transacao, String tipo) {
		this.id = countId++;
		this.valor = valor;
		this.data_transacao = data_transacao;
		this.tipo = tipo;
	}
	
	public Transacao(int id, double valor, Date data_transacao, String tipo) {
		this.id = id;
		this.valor = valor;
		this.data_transacao = data_transacao;
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public Date getData_transacao() {
		return data_transacao;
	}
	
	public String getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}
	
}
