package br.faccamp.domain;

import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

import br.faccamp.view.CalculadoraGUI;

public class Display {

    protected static final UndoableEdit undo = null;
	private CalculadoraGUI gui;
    private Operacao ope;
    private String memoria = "0";

    public Display(CalculadoraGUI gui) {
        this.gui = gui;
    }

    public String getConteudo() {
        return gui.getDisplay();
    }

    private void mostraDisplay(String texto) {
        if (getConteudo().equalsIgnoreCase("")) {
            gui.atualizaDisplay(texto);
        } else {
            gui.atualizaDisplay((getConteudo() + texto));
        }
    }

    public void atualiza(String texto) {
        if (isCarecterEspecial(texto)) {
            if (deveMostrarCaracter(texto)) {
                mostraDisplay(texto);
            }
        } else {
            mostraDisplay(texto);
        }
    }

    private boolean isCarecterEspecial(String texto) {
        if (texto.equalsIgnoreCase(",")) {
            return true;
        }

        return false;
    }

    private boolean deveMostrarCaracter(String texto) {
        if (!getConteudo().equalsIgnoreCase("") && getConteudo().indexOf(",") == -1) {
            return true;
        }

        return false;
    }

    public void atualizaOperacaoDeSoma() {
        if (!getConteudo().equalsIgnoreCase("")) {
            ope = new OperacaoDeSoma(getConteudo());
            limpa();
        }
    }

    public void limpaC() {
        ope = null;
        limpa();
    }

    public void atualizaOperacaoDeSubtracao() {
        if (!getConteudo().equalsIgnoreCase("")) {
            ope = new OperacaoDeSubtracao(getConteudo());
            limpa();
        }
    }

    public void atualizaOperacaoDeMultiplicacao() {
        if (!getConteudo().equalsIgnoreCase("")) {
            ope = new OperacaoDeMultiplicacao(getConteudo());
            limpa();
        }
    }

    public void atualizaOperacaoDeDivisao() {
        if (!getConteudo().equalsIgnoreCase("")) {
            ope = new OperacaoDeDivisao(getConteudo());
            limpa();
        }
    }

    public void limpa() {
        gui.atualizaDisplay("");
    }

    public void igual() {
        if ((ope != null) && (!getConteudo().equalsIgnoreCase(""))) {
            gui.atualizaDisplay(ope.calcula(getConteudo()));
        }
    }

    public void MC() {
        this.memoria = "0";
    }

    public void MR() {
        gui.atualizaDisplay(memoria);
    }

    public void MS() {
        this.memoria = getConteudo();
    }

    public void Mmais() {
        this.memoria = String.valueOf(Double.parseDouble(this.memoria)
        		+ Double.parseDouble(getConteudo()));
    }

    public void Mmenos() {
        this.memoria = String.valueOf(Double.parseDouble(this.memoria)
        		- Double.parseDouble(getConteudo()));
    }

    public void atualizaPontenciacao() {
        if (!getConteudo().equalsIgnoreCase("")) {
            ope = new Potenciacao(getConteudo());

        }
    }

    public void MaisOuMenos() {
        if (!getConteudo().equalsIgnoreCase("")) {
            gui.atualizaDisplay(String.valueOf(Double.parseDouble(getConteudo()) * -1));
        }
    }
    
    public void umSobreX() {
        if (!getConteudo().equalsIgnoreCase("")) {
            gui.atualizaDisplay(String.valueOf(1 / Double.parseDouble(getConteudo())));
        }
    }

    public void porcentagem() {
        if ((ope != null) && (!getConteudo().equalsIgnoreCase(""))) {
            gui.atualizaDisplay(ope.processarPorcentagem(getConteudo()));
        }

    }

    public void fatorial() {

        if (!getConteudo().equalsIgnoreCase("")) {
            double num = 1;

            if (Double.parseDouble(getConteudo()) == 0) {
                num = 0;
            } else {
                for (int i = 1; i <= Double.parseDouble(getConteudo()); i++) {
                    num *= i;
                }
            }

            gui.atualizaDisplay(String.valueOf(num));
        }
    }
    
    public void raiz() {
        if (!getConteudo().equalsIgnoreCase("")) {
            gui.atualizaDisplay(String.valueOf(Math.sqrt(Double.parseDouble(getConteudo()))));
        }

    }


    public void log() {
        if (!getConteudo().equalsIgnoreCase("")) {
            gui.atualizaDisplay(String.valueOf(Math.log(Double.parseDouble(getConteudo()))));
        }
    }

    public void Undo() {
    	
   
    	final UndoManager undo = new UndoManager();
    	try{
    		if(undo.canUndo()){
            	undo.undo();
    	}
    	} 
    	catch(CannotUndoException cue){
    	// possiveis erros são tratados aqui 
    	}
    	
    	};

    	
	public void Redo() {
    	 
		final UndoManager undo = new UndoManager();
    	  
     try{
    	if(undo.canRedo()){
    	undo.redo();
    	}
    	} 
    	catch(CannotUndoException cue){
    	// possiveis erros são tratados aqui 
    	}
    	}
    	
    }

    

