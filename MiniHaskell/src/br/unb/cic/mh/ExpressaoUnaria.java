package br.unb.cic.mh;

public abstract class ExpressaoUnaria implements Expressao {
	
	protected Expressao sub;

	public ExpressaoUnaria(Expressao s) {
		this.sub = s;
	}
	
	public Expressao getSub() {
		return sub;
	}

}
