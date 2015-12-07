package br.com.fj17.model;

public class CpfValidator implements Documento {
	private String valor;

    public CpfValidator(String valor) {
      this.valor = valor;
    }

    public String getValor() {
      return this.valor;
    }

    public boolean equals(Object o) {
      if (!(o instanceof CpfValidator)) {
        return false;
      }
      CpfValidator outro = (CpfValidator) o;
      return this.valor.equals(outro.valor);
    }

    public int hashCode() {
      return this.valor.hashCode();
    }

    public boolean ehValido() {
      return primeiroDigitoVerificadoEstaCorreto()
              && segundoDigitoVerificadorEstaCorreto();
    }

    private boolean primeiroDigitoVerificadoEstaCorreto() {
      // Calcula o primeiro digito verificador do CPF se
      // ele estiver correto e compara com o valor preenchido
    	return true;
    }

    private boolean segundoDigitoVerificadorEstaCorreto() {
      // Calcula o segundo digito verificador do CPF se
      // ele estiver correto e compara com o valor preenchido
    	return true;
    }

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public String getNumeroDocumento() {
		return null;
	}
}
