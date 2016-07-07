package br.unb.cic.mh.visitor;

import java.util.ListIterator;

import br.unb.cic.mh.Expressao;
import br.unb.cic.mh.ExpressaoAnd;
import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoDiferente;
import br.unb.cic.mh.ExpressaoDivisao;
import br.unb.cic.mh.ExpressaoFatorial;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgualdade;
import br.unb.cic.mh.ExpressaoLet;
import br.unb.cic.mh.ExpressaoMaiorIgual;
import br.unb.cic.mh.ExpressaoMenorIgual;
import br.unb.cic.mh.ExpressaoMultiplicacao;
import br.unb.cic.mh.ExpressaoMaior;
import br.unb.cic.mh.ExpressaoMenor;
import br.unb.cic.mh.ExpressaoNot;
import br.unb.cic.mh.ExpressaoOr;
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ExpressaoSubtracao;
import br.unb.cic.mh.Tipo;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;
import br.unb.cic.mh.ValorLista;

//enum Tipo {
//	BOOLEANO,
//	INTEIRO,
//	ERRO;
//}

public class PPVisitor implements Visitor {
	
	@Override
	public void visitar(ValorInteiro exp) {
		System.out.print(exp.getValor());
	}

	@Override
	public void visitar(ValorBooleano exp) {
		if(exp.getValor()) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}
	

	@Override
	public void visitar(ValorLista exp) {
		ValorLista it = exp;
		System.out.print("(");
		
		while (it != null){	
			//System.out.print(((ValorConcreto) it.getValor().avaliar()).getValor());
			// =
			//it.getValor().avaliar().aceitar(this);
			
			it.getValor().aceitar(this);
			
			it = it.getNext();
			
			if(it != null)
				System.out.print(", ");
		}
		
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
		System.out.print("If (");
		exp.getCondicao().aceitar(this);
		System.out.print("), then (");
		exp.getClausulaThen().aceitar(this);
		System.out.print("), else (");
		exp.getClausulaElse().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoLet exp) {
		System.out.print("Let (" + exp.getId() + " = ");
		exp.getExp().aceitar(this);
		System.out.print(") in (");
		exp.getCorpo().aceitar(this);
		System.out.print(")");		
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" + ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoRefId exp) {
		System.out.print("(" + exp.getId());
		
		Tipo t1 = exp.tipo();
		
		
		//exp.tipo().equals(Tipo.INTEIRO);
		
		System.out.print(" = ");
		if(t1.equals(Tipo.INTEIRO)){
			System.out.print(((ValorInteiro) exp.avaliar()).getValor());
		}
		
		else if(t1.equals(Tipo.BOOLEANO)){
			System.out.print(((ValorBooleano) exp.avaliar()).getValor());
		}
		
		else
			System.out.print("null");
		
		System.out.print(")");
		
		/*
		 
		switch(exp.tipo()){
		}
		 
		 */
	
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
				
		System.out.print(exp.getNome() + "(");
		
		//List<Expressao> it = exp.getParametros();
		
		ListIterator<Expressao> ite = exp.getParametros().listIterator();
		
		while(ite.hasNext()){
			Expressao temp = ite.next();
			temp.aceitar(this);
		}
			
			
		System.out.print(")");
		
	}
	
	@Override
	public void visitar(ExpressaoSubtracao exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" - ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}

	@Override
	public void visitar(ExpressaoIgualdade exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" == ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoAnd exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" && ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoMultiplicacao exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" * ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}
	
	@Override
	public void visitar(ExpressaoOr exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" || ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoDivisao exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" / ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}
	
	@Override
	public void visitar(ExpressaoNot exp) {
		System.out.print("(");
		System.out.print("!");
		exp.getSub().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoDiferente exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" != ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}
	
	@Override
	public void visitar(ExpressaoMenor exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" < ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}

	@Override
	public void visitar(ExpressaoMenorIgual exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" <= ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}

	@Override
	public void visitar(ExpressaoMaiorIgual exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" >= ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
		
	}
	
	@Override
	public void visitar(ExpressaoMaior exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.print(" > ");
		exp.getSub2().aceitar(this);
		System.out.print(")");
	}

	@Override
	public void visitar(ExpressaoFatorial exp) {
		System.out.print("(");
		exp.getSub().aceitar(this);
		System.out.print("!");
		System.out.print(")");
		
	}


}
