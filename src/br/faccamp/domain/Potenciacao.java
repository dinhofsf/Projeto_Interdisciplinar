
package br.faccamp.domain;

public class Potenciacao extends Operacao {

	public Potenciacao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = Double.parseDouble(getPrimeiroOperador());
		double segundo = Double.parseDouble(segundoOperador);
		double result = Math.pow(primeiro, segundo);
		return (result + "");
	}


}


