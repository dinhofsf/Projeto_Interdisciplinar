package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora {

	private CalculadoraGUI gui;
	private Display display;
	private Operacao operacao;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
	}

	public void processaMC() {
		display.MC();
	}

	public void processaMR() {
		display.MR();

	}

	public void processaMS() {
		display.MS();

	}

	public void processaMMais() {
		display.Mmais();

	}

	public void processaMMenos() {
		display.Mmenos();
	}

	public void processaCE() {
		display.limpa();

	}

	public void processaC() {
		display.limpaC();
		setOperacao(null);
	}

	public void processaMaisOuMenos() {
		setOperacao(new MaisOuMenos(display.getConteudo()));
	
		
	}

	public void processaFatorial() {
		display.fatorial();
		processaIgual();

	}

	public void processaSete() {
		display.atualiza("7");
	}

	public void processaOito() {
		display.atualiza("8");
	}

	public void processaNove() {
		display.atualiza("9");
	}

	public void processaDivisao() {
		display.atualizaOperacaoDeDivisao();

	}

	public void processaPorcentual() {
		display.porcentagem();
	}

	public void processaQuatro() {
		display.atualiza("4");
	}

	public void processaCinco() {
		display.atualiza("5");
	}

	public void processaSeis() {
		display.atualiza("6");
	}

	public void processaVezes() {
		display.atualizaOperacaoDeMultiplicacao();

	}

	public void processaUmSobreX() {
		display.umSobreX();
		processaIgual();
	}

	public void processaUm() {
		display.atualiza("1");
	}

	public void processaDois() {
		display.atualiza("2");
	}

	public void processaTres() {
		display.atualiza("3");
	}

	public void processaMenos() {
		display.atualizaOperacaoDeSubtracao();

	}

	public void processaXElevadoY() {
		display.atualizaPontenciacao();
		display.limpa();

	}

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaVirgula() {
		display.atualiza(",");
	}

	public void processaIgual() {
		display.igual();
	}

	public void processaLog() {
		display.log();
		
	}

	public void processaMais() {
		display.atualizaOperacaoDeSoma();
	}

	public void processaRaiz() {
		display.raiz();

	}

	public void processaRedo() {
		display.Redo();

	}

	public void processaUndo() {
		display.Undo();

	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

}
