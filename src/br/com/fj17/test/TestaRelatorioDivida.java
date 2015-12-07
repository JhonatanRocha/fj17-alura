package br.com.fj17.test;

import java.text.NumberFormat;
import java.util.Locale;

import br.com.fj17.model.CnpjValidator;
import br.com.fj17.model.Divida;
import br.com.fj17.model.Pagamento;
import br.com.fj17.model.RelatorioDivida;

public class TestaRelatorioDivida {
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("A Company");
		divida.setTotal(100);
		divida.setDocumentoCredor(new CnpjValidator("00.00.01-001.11"));

		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoPagador(new CnpjValidator("00.000.002/002-02"));
		pagamento.setPagador("Another Company");
		pagamento.setValor(20);
		divida.registra(pagamento);

		RelatorioDivida relatorio = new RelatorioDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorio.geraRelatorio(formatador);
	}
}
