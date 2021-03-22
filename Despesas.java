package projeto_integrador;

public class Despesas {

	private double valor;
	private String tipo;

	public Despesas(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getTipo() {
		return tipo;
	}

	
	
}
