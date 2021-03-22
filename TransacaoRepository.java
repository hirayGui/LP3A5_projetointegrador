package projeto_integrador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransacaoRepository {

	private List<Transacao> transacoes = new ArrayList<>();
	
	public Transacao adicionarTransacao(Transacao trans) {
		transacoes.add(trans);
		return trans;
	}
	
	public void delete(Transacao trans) {
		transacoes.remove(trans);
	}
	
	public List<Transacao> getAll(){
		return transacoes;
	}
	
	public Transacao getByDate(Date data_transacao) {
		return transacoes.stream()
				.filter(trans -> trans.getData_transacao() == data_transacao)
				.findAny()
				.orElse(null);
	}
	
	public Transacao getById(int id) {
		return transacoes.stream()
				.filter(trans -> trans.getId() == id)
				.findAny()
				.orElse(null);
	}	
	

}
