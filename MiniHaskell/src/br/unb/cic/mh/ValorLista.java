package br.unb.cic.mh;

import java.util.List;

import br.unb.cic.mh.visitor.Visitor;

public class ValorLista<T> extends ValorConcreto<T> {
	
	protected ValorLista<T> next;
	
	public ValorLista(T s1, ValorLista<T> next){
		// Construtor
		super(s1);
		
		if (next != null)
			if (next.checarTipo() == this.checarTipo())
				this.next = next;
			else this.next = null;
		else this.next = null;
		
	}

	@Override
	public Tipo tipo() {
		return null;
	}

	@Override
	public boolean checarTipo() {
		return true;//valor.checarTipo();
	}

	@Override
	public Valor avaliar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
		
	}

	public ValorLista<T> getNext() {
		return next;
	}
	
}
