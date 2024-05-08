package ecommerce.repository;

import ecommerce.model.Item;

public interface EcommerceRepository {
	
	public void listarTudo();
	public void procurarPorId(int idItem);
	public void cadastrar(Item item);
	public void atualizar(Item item);
	public void deletar(int idItem);
	

}

