package br.com.fj17.model;

public class CnpjValidator {

	private String cnpj;
	
	public boolean isValid() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int segundoDigitoCorreto() {
		return 2;
	}

	private int segundoDigitoVerificador() {
		return 2;
	}

	private int primeiroDigitoVerificador() {
		return 1;
	}

	private int primeiroDigitoCorreto() {
		return 1;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
    public boolean equals(Object o) {
        if(!(o instanceof CnpjValidator)) {
            return false;
        } 
        CnpjValidator outro = (CnpjValidator) o;
        return this.cnpj.equals(outro.cnpj); // delegamos a comparação de dois Cnpj para seus atributos valor
    }
    
    public int hashCode() {
        return this.cnpj.hashCode(); // delegamos a geracao do hashCode da classe Cnpj para seu atributo String valor
    }
}
