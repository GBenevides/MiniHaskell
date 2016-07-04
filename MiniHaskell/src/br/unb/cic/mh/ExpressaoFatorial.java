package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoFatorial extends ExpressaoBinaria {

	protected Expressao s1;
	public ValorInteiro multiplier;
	
	
	
	public ExpressaoFatorial(Expressao s1, Expressao s2) {
		super(s1, s2);
		this.multiplier = (ValorInteiro)s1;
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public Tipo tipo() {
		Tipo t1 = s1.tipo();	
		
		if(t1.equals(Tipo.INTEIRO)) {
			return Tipo.INTEIRO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.INTEIRO);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro)s1;
		
		if(v1.getValor() == 0){	
			return this.multiplier;
		}else{
			ExpressaoSubtracao sub1 = new ExpressaoSubtracao(v1,new ValorInteiro(1));
			this.s1 = (ValorInteiro)sub1.avaliar();
			
			ExpressaoMultiplicacao mult1 = new ExpressaoMultiplicacao(this.s1, this.multiplier);
			v1 = (ValorInteiro)s1;
			if(v1.getValor() != 0)
				this.multiplier = (ValorInteiro)mult1.avaliar();
			
			return avaliar();
			
		}
	}

	@Override
	public void aceitar(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
