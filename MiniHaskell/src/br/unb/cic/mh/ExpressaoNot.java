package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoNot implements Expressao {
	
	//	Tipagem
	//	Invertendo o valor de um booleano...
	//	Retornando booleano.
	
	protected Expressao s1;

	public ExpressaoNot(Expressao s1) {
		this.s1 = s1;		
	}

	@Override
	public Tipo tipo() {
		Tipo t1 = s1.tipo();	
	
		if(t1.equals(Tipo.BOOLEANO)) {
			return Tipo.BOOLEANO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.BOOLEANO);
	}

	@Override
	public Valor avaliar() {
		ValorBooleano v = (ValorBooleano)s1.avaliar();
		
		return new ValorBooleano(!(v.getValor()));
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
