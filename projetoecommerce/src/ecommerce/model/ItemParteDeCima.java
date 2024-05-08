package ecommerce.model;

public class ItemParteDeCima extends Item {
	
	private String tamanhoManga;

	public ItemParteDeCima(int idItem, int quantidade, int tipo, String nomeDoItem, String marca, float precoItem, String tamanhoManga) {
		super(idItem, quantidade, tipo, nomeDoItem, marca, precoItem);
		this.tamanhoManga = tamanhoManga; 
	}

	public String getTamanhoManga() {
		return tamanhoManga;
	}

	public void setTamanhoManga(String tamanhoManga) {
		this.tamanhoManga = tamanhoManga;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho da Manga: " + this.tamanhoManga);
	}

}
