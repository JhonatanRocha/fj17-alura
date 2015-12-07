package br.com.fj17.application;

import br.com.fj17.model.Divida;
import br.com.fj17.model.Documento;

public interface ArmazenadorDeDividas {
	void salva(Divida divida);
	Divida carrega(Documento documentoCredor);
}
