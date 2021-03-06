package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoDiferente extends ExpressaoBinaria{

	public ExpressaoDiferente(Expressao s1, Expressao s2) {
		super(s1, s2);
	}

	@Override
	public Tipo tipo() {
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		
		if(t1.equals(Tipo.BOOLEANO) && t2.equals(Tipo.BOOLEANO)) {
			return Tipo.BOOLEANO;
		}
		if(t1.equals(Tipo.INTEIRO) && t2.equals(Tipo.INTEIRO)) {
			return Tipo.INTEIRO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.BOOLEANO);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Valor avaliar() {
		ValorConcreto v1 = (ValorConcreto)sub1.avaliar();
		ValorConcreto v2 = (ValorConcreto) sub2.avaliar();
		
		return new ValorBooleano(v1.getValor() != v2.getValor());
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
