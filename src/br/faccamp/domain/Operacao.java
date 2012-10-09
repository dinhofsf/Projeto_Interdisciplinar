package br.faccamp.domain;

public abstract class Operacao {

    private String primeiroOperador;

    public String getPrimeiroOperador() {
        return primeiroOperador;
    }

    public Operacao(String primeiroOperador) {
        this.primeiroOperador = primeiroOperador;
    }

    public abstract String calcula(String conteudo);

    public String processarPorcentagem(String conteudo) {
        return String.valueOf(Double.parseDouble(getPrimeiroOperador())
                * Double.parseDouble(conteudo) / 100);


    }
    
    
    
    //  public String processaLog(String conteudo) {
    //     return String.valueOf(Math.log(Double.parseDouble(conteudo)));
    //  + Double.parseDouble(getPrimeiroOperador()));
    //  }
    //  public String processaRaiz(String conteudo) {
    //      return String.valueOf(Math.sqrt(Double.parseDouble(conteudo)));
    // + Double.parseDouble(getPrimeiroOperador()));
}
