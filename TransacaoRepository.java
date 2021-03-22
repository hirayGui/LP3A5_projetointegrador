package projeto_integrador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransacaoRepository {
	//classe para guardar transações

	private List<Transacao> transacoes = new ArrayList<>();
	
	public Transacao adicionarTransacao(Transacao trans) {
		transacoes.add(trans);
		return trans;
	}
	
	//retorna todas as transações
	public List<Transacao> getAll(){
		return transacoes;
	}
	
	//retorna as transações de acordo com a data
	public Transacao getByDate(Date data_transacao) {
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
