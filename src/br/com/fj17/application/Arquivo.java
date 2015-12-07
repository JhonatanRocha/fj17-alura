package br.com.fj17.application;

import br.com.fj17.model.Divida;
import br.com.fj17.model.Documento;

public class Arquivo implements ArmazenadorDeDividas{

	@Override
	public void salva(Divida divida) {
		
	}

	@Override
	public Divida carrega(Documento documentoCredor) {
		return null;
	}
}
