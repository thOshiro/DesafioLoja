package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Loja;

public class RepoLoja {

	List<Loja> repoLojas = new ArrayList<>();
	
	private RepoLoja (){
		
	}
	
	public static RepoLoja novo(){
		return new RepoLoja();
	}
	
	public boolean inserir(Loja loja){
		
		if(repoLojas.add(loja)){
			return true;
		}
		return false;
	}
	
	public Loja selecionar(Loja lojaParaSelecionar){
		
		for (Loja loja : repoLojas){
			if(repoLojas.equals(lojaParaSelecionar.getNome())){
				return loja;
			}
		}
		return null;
	}
	
	public List<Loja> selecionarTudo(){
		return repoLojas;
	}
	
	/**
	 * Remove loja da lista de lojas
	 * Retorna:
	 *  Se sucesso retorna loja removida 
	 *  Se falhar retorna null
	 * */
	public Loja remover(Loja lojaParaRemover){
		int indice = 0;
		
		for(Loja loja: repoLojas){
			if(loja.equals(lojaParaRemover.getNome())){
				return repoLojas.remove(indice);
			}
		}
		return null;
	}
	
	
}
