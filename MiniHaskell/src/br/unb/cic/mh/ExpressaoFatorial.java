package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoFatorial extends ExpressaoUnaria {

//	protected Expressao s1;

	public ExpressaoFatorial(Expressao s) {
		super(s);
	}
	
	@Override
	public Tipo tipo() {
		Tipo t1 = sub.tipo();	
		
		if(t1.equals(Tipo.INTEIRO)) {
			return Tipo.INTEIRO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.INTEIRO);
	}

	public ValorInteiro fat(ValorInteiro v){
		
		
		ValorInteiro v2 = (ValorInteiro) new ExpressaoSubtracao(v,new ValorInteiro(1)).avaliar();
		ValorInteiro ans;
		
		if(v.getValor() == 0)
			ans = new ValorInteiro(1);
		else
			ans = (ValorInteiro) new ExpressaoMultiplicacao(v, fat(v2)).avaliar();
	
//		ExpressaoIfThenElse exp = new ExpressaoIfThenElse(new ExpressaoMenorIgual(v, new ValorInteiro(0)), 
//				new ExpressaoSoma(new ExpressaoRefId("x"), new ValorInteiro(0)) , 
//				(new ExpressaoMultiplicacao(new ExpressaoSoma(new ExpressaoRefId("x"),new ValorInteiro(0)) ,fat(v1))));
//		
//				
		
		return ans;
	
	}
	
	@Override
	public Valor avaliar() {
		ValorInteiro v = (ValorInteiro)sub;
		ValorInteiro res = (fat(v));
		return res;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}


}
