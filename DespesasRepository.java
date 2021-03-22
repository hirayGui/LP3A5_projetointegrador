package projeto_integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DespesasRepository {
//Repositório para guardar as despesas
	
private List<Despesas> desps = new ArrayList<>();
	
	public Despesas adicionarDespesa(Despesas desp) {
		desps.add(desp);
		return desp;
	}
	
	public void delete(Despesas desp) {
		desps.remove(desp);
	}
	
	//retorna todas as despesas
	public List<Despesas> getAll(){
		return desps;
	}
	
	//puxa a despesa pelo seu tipo
	public Despesas getByType(String tipo) {
		return desps.stream()
				.filter(desp -> desp.getTipo() == tipo)
				.findAny()
				.orElse(null);
	}
	
	//pega o valor total das despesas, para fazer o balanço dos gastos
	public double getDespesaTotal() {
		List<Double> lista = new ArrayList<>();
		
		for(Despesas desp : desps) {
			lista.add(desp.getValor());
		}
		Optional<Double> soma = lista.stream()
				.reduce((n1, n2) -> n1 + n2);
		
		return soma.get();
	}
	
}
