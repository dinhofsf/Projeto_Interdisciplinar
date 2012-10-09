package br.faccamp.domain;

public class OperacaoDeMultiplicacao extends Operacao {

	public OperacaoDeMultiplicacao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = Double.parseDouble(getPrimeiroOperador());
		double segundo = Double.parseDouble(segundoOperador);
		return (primeiro*segundo)+"";
		
	}


}
