package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoNot extends ExpressaoUnaria {
	
	//	Tipagem
	//	Invertendo o valor de um booleano...
	//	Retornando booleano.
	
//	protected Expressao s1;

	public ExpressaoNot(Expressao s) {
		super(s);		
	}

	@Override
	public Tipo tipo() {
		Tipo t = sub.tipo();	
	
		if(t.equals(Tipo.BOOLEANO)) {
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
		ValorBooleano v = (ValorBooleano)sub.avaliar();
		
		return new ValorBooleano(!(v.getValor()));
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
