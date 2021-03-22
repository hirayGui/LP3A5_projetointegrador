package projeto_integrador;

import java.util.ArrayList;
import java.util.List;

public class DespesasRepository {

private List<Despesas> desps = new ArrayList<>();
	
	public Despesas adicionarDespesa(Despesas desp) {
		desps.add(desp);
		return desp;
	}
	
	public void delete(Despesas desp) {
		desps.remove(desp);
	}
	
	public List<Despesas> getAll(){
		return desps;
	}
	
	public Despesas getByType(String tipo) {
		return desps.stream()
				.filter(desp -> desp.getTipo() == tipo)
				.findAny()
				.orElse(null);
	}
	
}
