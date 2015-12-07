package br.com.fj17.application;

import br.com.fj17.model.BalancoEmpresa;
import br.com.fj17.model.CnpjValidator;
import br.com.fj17.model.Divida;
import br.com.fj17.model.Pagamento;

public class MinhaAplicacao {
	public static void main(String[] args) {
		//BancoDeDados bd = new BancoDeDados("servidor", "usuario", "senha");
		Arquivo bd = new Arquivo();
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		registraDividas(balanco);
		realizaPagamentos(balanco);
		//bd.desconecta();
	}

	private static void registraDividas(BalancoEmpresa balanco) {
		Divida divida1 = new Divida();
		Divida divida2 = new Divida();
		// preenche dados das dividas
		balanco.registraDivida(divida1);
		balanco.registraDivida(divida2);
	}

	private static void realizaPagamentos(BalancoEmpresa balanco) {
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		CnpjValidator credor = new CnpjValidator("00.000.000/0001-01");
		// preenche dados dos pagamentos
		balanco.pagaDivida(credor, pagamento1);
		balanco.pagaDivida(credor, pagamento2);
	}
}
