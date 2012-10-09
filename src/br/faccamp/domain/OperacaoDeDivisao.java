package br.faccamp.domain;


public class OperacaoDeDivisao extends Operacao {
	

	public OperacaoDeDivisao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public  String calcula(String segundoOperador) {
	double primeiro = Double.parseDouble(getPrimeiroOperador());
    double segundo = Double.parseDouble(segundoOperador);
		
			if (primeiro >= segundo) {
				return(primeiro / segundo) +"";

			}else {
                return ("Impossivel dividir por 0").toString();
            }
			
		
	

	}

}
