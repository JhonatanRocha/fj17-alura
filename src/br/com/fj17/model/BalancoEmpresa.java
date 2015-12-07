package br.com.fj17.model;

import java.util.HashMap;
import br.com.fj17.model.Pagamento;

public class BalancoEmpresa {

	private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
	public void registraDivida(Divida divida) {
		if (divida.getDocumentoCredor() != null) {
			dividas.put(divida.getDocumentoCredor(), divida);
		}
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.get(documentoCredor);
		if(divida != null){
			divida.registra(pagamento);
		}
	}
}
