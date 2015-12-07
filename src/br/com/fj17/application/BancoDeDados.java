package br.com.fj17.application;

import java.util.HashMap;
import java.util.Map;

import br.com.fj17.model.Divida;
import br.com.fj17.model.Documento;

public class BancoDeDados implements ArmazenadorDeDividas {

	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();

    public BancoDeDados(String url, String usuario, String senha) {
      System.out.println("Conectado!");
    }

    public void salva(Divida divida) {
      dividasNoBanco.put(divida.getDocumentoCredor(), divida);
    }

    public Divida carrega(Documento documentoCredor) {
      return dividasNoBanco.get(documentoCredor);
    }

    public void desconecta() {
      System.out.println("Desconectado!");
    }
}
