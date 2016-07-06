package br.unb.cic.mh;

import java.util.List;

import br.unb.cic.mh.visitor.Visitor;

public class ValorLista extends ValorConcreto<Expressao> {
	
	protected ValorLista next;
	
	public ValorLista(Expressao s1, ValorLista next){
		// Construtor 1 - Lista "cheia"
		super(s1);
		
		if (next != null)
			if (next.checarTipo() == this.checarTipo())
				this.next = next;
			else this.next = null;
		else this.next = null;
		
	}
	
	public ValorLista(Expressao s1){
		// Construtor 2 - Lista "cheia"
		super(s1);
		this.next = null;
	}
		
	public ValorLista(){
		// Construtor 3 - Lista "vazia"
		super(null);
		this.next = null;
	}

	@Override
	public Tipo tipo() {
		return null;
	}

	public void add(ValorLista lis){
		
		ValorLista temp = this;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = lis;
	}
	
	
	public ValorInteiro tamanho(){
		
		ValorLista temp = this;
		ValorInteiro res = new ValorInteiro(0);
		
		if(temp != null){
			
			
			while(temp != null){
				res = (ValorInteiro) new ExpressaoSoma(res, new ValorInteiro(1)).avaliar();
				temp = temp.next;
			}
		
		}
		return res;
	}
	
	public Expressao position(ValorInteiro index){
		// Retorna um termo em certa posicao index.

		ValorLista temp = this;		
		for(int i = 0;i< index.getValor(); i++ ){
			temp = this.next;
			if(temp == null)
				return (Expressao) new ValorInteiro(-1);
		}
		
		return (Expressao) temp.valor;
		
	}
	
//	@Override
//	public boolean checarTipo() {
//		return true;//valor.checarTipo();
//	}

//	@Override
//	public Valor avaliar() {
//		// Auto-generated method stub
//		return null;
//	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

	public ValorLista getNext() {
		return next;
	}
	
}
