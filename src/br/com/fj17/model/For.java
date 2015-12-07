package br.com.fj17.model;

public class For {
	public void percorreColecao(Iteravel colecao) {
		SequencialDeElementos sequencial = colecao.percorrerColecao();
		
		Object primeiro = sequencial.proximo();
		Object segundo = sequencial.proximo();
	
	}
}
