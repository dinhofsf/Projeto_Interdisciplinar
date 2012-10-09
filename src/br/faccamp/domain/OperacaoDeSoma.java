package br.faccamp.domain;

public class OperacaoDeSoma extends Operacao {

	public OperacaoDeSoma(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = Double.parseDouble(getPrimeiroOperador());
		double segundo = Double.parseDouble(segundoOperador);
		return (primeiro+segundo)+"";
	}

	
}
