package br.com.fj17.model;

import java.util.HashMap;
import br.com.fj17.model.Pagamento;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(Divida divida) {
        dividas.put(divida.getCnpjCredor().getCnpj(), divida);
	}

	public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
		Divida divida = dividas.get(cnpjCredor);
		
		if(divida != null){
			divida.registra(pagamento);
		}
	}
}
