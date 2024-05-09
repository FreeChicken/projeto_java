package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Item;
import ecommerce.repository.EcommerceRepository;
	
	public class EcommerceController implements EcommerceRepository{
		
		private ArrayList<Item> listaItens = new ArrayList<Item>();
		int idItem = 0;

		@Override
		public void listarTudo() {
			for (var item : listaItens) {
				item.visualizar();
			}
			
		}

		@Override
		public void procurarPorId(int idItem) {
			var item = buscarNaCollection(idItem);
			
			if (item != null) 
				item.visualizar();
			else
				System.out.println("\nO item número: " + idItem + " não foi encontrado!");
			
		}

		@Override
		public void cadastrar(Item item) {
				listaItens.add(item);
				System.out.println("\nO Item número: " + item.getIdItem() + " foi cadastrado com sucesso!");
			
		}

		@Override
		public void atualizar(Item item) {
			var buscaItem = buscarNaCollection(item.getIdItem());
			
			if (buscaItem != null) {
				listaItens.set(listaItens.indexOf(buscaItem), item);
				System.out.println("\nO item número: " + item.getIdItem() + " foi atualizado com sucesso!");
			}else
				System.out.println("\nO item número: " + item.getIdItem() + " não foi encontrado!");
			
		}

		@Override
		public void deletar(int idItem) {
			var item = buscarNaCollection(idItem);
			
			if (item != null) {
				if(listaItens.remove(item) == true)
					System.out.println("\nO item número: " + idItem + " foi deletado com sucesso!");
			}else
				System.out.println("\nO item número: " + idItem + " não foi encontrado!");
			
		}
		
		public int gerarIdItem() {
			return ++ idItem;
		}
		
		public Item buscarNaCollection(int idItem) {
			for (var item : listaItens) {
				if (item.getIdItem() == idItem) {
					return item;
				}
			}
			
			return null;
			
		}

}
