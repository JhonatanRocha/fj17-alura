package br.com.fj17.test;

import br.com.fj17.model.Pagamento;
import br.com.fj17.model.Pagamentos;

public class TestaPagamentos {
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento = new Pagamento();
		Pagamento pagamentoSecond = new Pagamento();
		pagamento.setValor(105);
		pagamentoSecond.setValor(25);
		
		pagamentos.registra(pagamento);
		pagamentos.registra(pagamentoSecond);
		
		System.out.println("Valor total pago: " + pagamentos.getValorPago());
	}
}
