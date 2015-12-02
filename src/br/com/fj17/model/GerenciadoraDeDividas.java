package br.com.fj17.model;

public class GerenciadoraDeDividas {
	public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
}
