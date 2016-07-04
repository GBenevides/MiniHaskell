package br.unb.cic.mh.visitor;

import br.unb.cic.mh.ExpressaoAnd;
import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoDiferente;
import br.unb.cic.mh.ExpressaoDivisao;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgualdade;
import br.unb.cic.mh.ExpressaoLet;
import br.unb.cic.mh.ExpressaoMaiorIgual;
import br.unb.cic.mh.ExpressaoMenorIgual;
import br.unb.cic.mh.ExpressaoMultiplicacao;
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ExpressaoSubtracao;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;

public class Adaptador implements Visitor {

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
	}

	@Override
	public void visitar(ExpressaoLet exp) {
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
	}

	@Override
	public void visitar(ExpressaoRefId exp) {
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
	}

	@Override
	public void visitar(ValorInteiro exp) {
	}

	@Override
	public void visitar(ValorBooleano exp) {
	}

	@Override
	public void visitar(ExpressaoSubtracao exp) {
	}
	
	@Override
	public void visitar(ExpressaoIgualdade exp) {
	}

	@Override
	public void visitar(ExpressaoAnd exp) {
	}

	@Override
	public void visitar(ExpressaoMultiplicacao expressaoMultiplicacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoDivisao expressaoDivisao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoDiferente expressaoDiferente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMenorIgual expressaoMenorIgual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaiorIgual expressaoMaiorIgual) {
		// TODO Auto-generated method stub
		
	}

}
