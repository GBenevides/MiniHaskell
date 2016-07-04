package br.unb.cic.mh.visitor;

import br.unb.cic.mh.ExpressaoAnd;
import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoDiferente;
import br.unb.cic.mh.ExpressaoDivisao;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgualdade;
import br.unb.cic.mh.ExpressaoLet;
<<<<<<< HEAD
import br.unb.cic.mh.ExpressaoMaiorIgual;
import br.unb.cic.mh.ExpressaoMenorIgual;
import br.unb.cic.mh.ExpressaoMultiplicacao;
=======
import br.unb.cic.mh.ExpressaoMaior;
import br.unb.cic.mh.ExpressaoMenor;
import br.unb.cic.mh.ExpressaoNot;
import br.unb.cic.mh.ExpressaoOr;
>>>>>>> origin/master
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ExpressaoSubtracao;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;

public interface Visitor {
	public void visitar(ExpressaoIfThenElse exp);
	public void visitar(ExpressaoLet exp);
	public void visitar(ExpressaoSoma exp);
	public void visitar(ExpressaoSubtracao exp);
	public void visitar(ExpressaoIgualdade exp);
	public void visitar(ExpressaoRefId exp);
	public void visitar(ExpressaoAplicacao exp);
	public void visitar(ValorInteiro exp);
	public void visitar(ValorBooleano exp);
	public void visitar(ExpressaoAnd exp);
<<<<<<< HEAD
	public void visitar(ExpressaoMultiplicacao expressaoMultiplicacao);
	public void visitar(ExpressaoDivisao expressaoDivisao);
	public void visitar(ExpressaoDiferente expressaoDiferente);
	public void visitar(ExpressaoMenorIgual expressaoMenorIgual);
	public void visitar(ExpressaoMaiorIgual expressaoMaiorIgual);	
=======
	public void visitar(ExpressaoOr exp);
	public void visitar(ExpressaoNot exp);
	public void visitar(ExpressaoMenor exp);
	public void visitar(ExpressaoMaior exp);	
>>>>>>> origin/master
	
}
