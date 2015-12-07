package br.com.fj17.model;

public class SequencialDeElementosArrayListHashSet implements SequencialDeElementos {
	
	private HashSet colecao;

	public SequencialDeElementosArrayListHashSet(HashSet colecao) {
		this.colecao = colecao;
		
	}
	
	@Override
	public Object proximo() {
		return null;
	}
}
