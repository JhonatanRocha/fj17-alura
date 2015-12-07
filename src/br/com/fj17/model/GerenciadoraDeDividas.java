package br.com.fj17.model;

public class GerenciadoraDeDividas {
	public void efetuaPagamento(Divida divida, String nomePagador, Documento documentoPagador, double valor) {
		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoPagador(documentoPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.getPagamentos().registra(pagamento);
	}
}
