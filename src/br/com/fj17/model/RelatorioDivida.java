package br.com.fj17.model;

import java.text.NumberFormat;

public class RelatorioDivida {

	private final Divida divida;

	public RelatorioDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("CNPJ do Credor: " + divida.getCnpjCredor());
		System.out.println("Credor: " + divida.getCredor());
		System.out.println("Valor da divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
}
