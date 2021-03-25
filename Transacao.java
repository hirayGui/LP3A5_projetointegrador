package projeto_integrador;

public class Transacao {

	private int id;
	private static int countId;
	private double valor;
	/*Resolvi utilizar a data como String porque o programa tava dando erro de Unparseable Date,
	 *eu procurei em todos os lugares e não achei como resolver o erro*/
	private String data_transacao;
	private String tipo; //entrada ou saída
	
	public Transacao(double valor, String data_transacao, String tipo) {
		this.id = countId++;
		this.valor = valor;
		this.data_transacao = data_transacao;
		this.tipo = tipo;
	}
	
	public Transacao(int id, double valor, String data_transacao, String tipo) {
		this.id = id;
		this.valor = valor;
		this.data_transacao = data_transacao;
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getData_transacao() {
		return data_transacao;
	}
	
	public String getTipo() {
		return tipo;
	}

	public int getId() {
		return id;
	}
	
}
