package projeto_integrador;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {
	//classe para guardar transações

	private List<Transacao> transacoes = new ArrayList<>();
	
	public Transacao adicionarTransacao(Transacao trans) {
		transacoes.add(trans);
		System.out.println("Transação adicionada com sucesso!");
		return trans;
	}
	
	//retorna todas as transações
	public void getAll(){
		for(Transacao T : transacoes){
			System.out.println("Tipo: " + T.getTipo() +
							 "\nValor: " + T.getValor() +
							 "\nData: " + T.getData_transacao());
		}
	}
	
	//retorna as transações de acordo com a data
	public Transacao getByDate(String data_transacao) {
		return transacoes.stream()
				.filter(trans -> trans.getData_transacao() == data_transacao)
				.findAny()
				.orElse(null);
	}
	
	//retorna a transação pelo id
	public Transacao getById(int id) {
		return transacoes.stream()
				.filter(trans -> trans.getId() == id)
				.findAny()
				.orElse(null);
	}	
	

}
