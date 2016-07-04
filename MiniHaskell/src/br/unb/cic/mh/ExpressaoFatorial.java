package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoFatorial implements Expressao{

	protected Expressao s1;

	public ExpressaoFatorial(Expressao s1) {
		this.s1 = s1;		
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
		
		/*
		ValorInteiro v1 = (ValorInteiro) new ExpressaoSubtracao(v,new ValorInteiro(1)).avaliar();
		System.out.println(v1.getValor());
		ExpressaoIfThenElse fat = new ExpressaoIfThenElse(new ExpressaoMenorIgual(new ExpressaoRefId("x"), new ValorInteiro(0)), 
				new ExpressaoSoma(new ExpressaoRefId("x"), new ValorInteiro(0)) , 
				(new ExpressaoMultiplicacao(new ExpressaoSoma(new ExpressaoRefId("x"),new ValorInteiro(0)) ,fat(v1))));
		
		
		DeclFuncao func = (new DeclFuncao()).nome("fat")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(fat);
		
		AmbienteExecucao.instance().declararFuncao(func);
		
		//Aplica essa nova funcao?
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("inc").parametro(v1);
		
		ValorInteiro ans = (ValorInteiro) ap.avaliar();
		
		System.out.println("Ans: "+ans.getValor());
		*/
		
	
	}
	
	@Override
	public Valor avaliar() {
		ValorInteiro v = (ValorInteiro)s1;
		ValorInteiro res = (fat(v));
		return res;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}


}
