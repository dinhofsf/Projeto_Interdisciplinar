package br.faccamp.domain;

public class Raiz extends Operacao {

	public Raiz(String primeiroOperador){
		super(primeiroOperador);
		
	}
	
	@Override
	public String calcula(String primeiroOperador){
		double primeiro = Double.parseDouble(getPrimeiroOperador());
		double result = Math.sqrt(primeiro);
		return (result + "");
	}
}
