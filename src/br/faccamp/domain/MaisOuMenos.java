package br.faccamp.domain;

public class MaisOuMenos extends Operacao {

	public MaisOuMenos(String primeiroOperador){
		super(primeiroOperador);
	}
	@Override
	public String calcula(String segundoOperador){
		double primeiro = Double.parseDouble(getPrimeiroOperador());
		double segundo = Double.parseDouble("-1");
		return(primeiro * segundo + "");
		
	}
}

