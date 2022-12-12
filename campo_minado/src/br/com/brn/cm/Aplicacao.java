package br.com.brn.cm;

import br.com.brn.cm.modelo.Tabuleiro;
import br.com.brn.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
		
	}

}
