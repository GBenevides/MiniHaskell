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
	
	public ExpressaoDivisao div(Expressao exp1, Expressao exp2) {
		return new ExpressaoDivisao(exp1, exp2);
	}

	public ExpressaoFatorial fat(Expressao exp1) {
		return new ExpressaoFatorial(exp1);
	}
	
	public ExpressaoIgualdade igual(Expressao exp1, Expressao exp2) {
		return new ExpressaoIgualdade(exp1, exp2);
	}
	
	public ExpressaoDiferente dif(Expressao exp1, Expressao exp2) {
		return new ExpressaoDiferente(exp1, exp2);
	}
	
	public ExpressaoMenor menor(Expressao exp1, Expressao exp2) {
		return new ExpressaoMenor(exp1, exp2);
	}
	
	public ExpressaoMenorIgual menorIgual(Expressao exp1, Expressao exp2) {
		return new ExpressaoMenorIgual(exp1, exp2);
	}
	
	public ExpressaoMaior maior(Expressao exp1, Expressao exp2) {
		return new ExpressaoMaior(exp1, exp2);
	}
	
	public ExpressaoMaiorIgual maiorIgual(Expressao exp1, Expressao exp2) {
		return new ExpressaoMaiorIgual(exp1, exp2);
	}
	
	public ExpressaoAnd and(Expressao exp1, Expressao exp2) {
		return new ExpressaoAnd(exp1, exp2);
	}
	
	public ExpressaoOr or(Expressao exp1, Expressao exp2) {
		return new ExpressaoOr(exp1, exp2);
	}
	
	public ExpressaoNot not(Expressao exp){
		return new ExpressaoNot(exp);
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
