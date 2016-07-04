package br.unb.cic.mh;


public abstract class TesteUtil {
	public ExpressaoSoma soma(Expressao exp1, Expressao exp2) {
		return new ExpressaoSoma(exp1, exp2);
	}
	
	public ExpressaoSubtracao sub(Expressao exp1, Expressao exp2) {
		return new ExpressaoSubtracao(exp1, exp2);
	}
	
	public ExpressaoMultiplicacao mult(Expressao exp1, Expressao exp2) {
		return new ExpressaoMultiplicacao(exp1, exp2);
	}

	public ExpressaoFatorial fat(Expressao exp1,Expressao exp2) {
		return new ExpressaoFatorial(exp1, exp2);
	}
	
	public ExpressaoIgualdade igual(Expressao exp1, Expressao exp2) {
		return new ExpressaoIgualdade(exp1, exp2);
	}
	
	public ExpressaoAnd and(Expressao exp1, Expressao exp2) {
		return new ExpressaoAnd(exp1, exp2);
	}
	
	public ExpressaoRefId ref(String id) {
		return new ExpressaoRefId(id);
	}
	
	public ExpressaoIfThenElse If(Expressao condicao, Expressao clausulaThen, Expressao clausulaElse) {
		return new ExpressaoIfThenElse(condicao, clausulaThen, clausulaElse);
	}
	
	public ExpressaoLet let(String id, Expressao exp, Expressao corpo) {
		return new ExpressaoLet(id, exp, corpo);
	}
	
	public ValorInteiro vi(Integer valor) {
		return new ValorInteiro(valor);
	}
	
	public ValorBooleano vb(Boolean valor) {
		return new ValorBooleano(valor);
	}
}
