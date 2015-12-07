package br.com.fj17.model;

public class SequencialDeElementosArrayList implements SequencialDeElementos {
	
	private ArrayList colecao;

	public SequencialDeElementosArrayList(ArrayList colecao) {
		this.colecao = colecao;
		
	}
	
	@Override
	public Object proximo() {
		return null;
	}
}
