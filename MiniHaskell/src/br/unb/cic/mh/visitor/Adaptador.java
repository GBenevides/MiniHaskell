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
<<<<<<< HEAD
	public void visitar(ExpressaoMultiplicacao expressaoMultiplicacao) {
=======
	public void visitar(ExpressaoOr exp) {
>>>>>>> origin/master
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void visitar(ExpressaoDivisao expressaoDivisao) {
=======
	public void visitar(ExpressaoNot exp) {
>>>>>>> origin/master
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void visitar(ExpressaoDiferente expressaoDiferente) {
=======
	public void visitar(ExpressaoMenor exp) {
>>>>>>> origin/master
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void visitar(ExpressaoMenorIgual expressaoMenorIgual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaiorIgual expressaoMaiorIgual) {
=======
	public void visitar(ExpressaoMaior exp) {
>>>>>>> origin/master
		// TODO Auto-generated method stub
		
	}

}
