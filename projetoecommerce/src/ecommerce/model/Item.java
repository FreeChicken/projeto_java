package ecommerce.model;

public abstract class Item {
	
	private int idItem;
	private int quantidade;
	private int tipo;//camisetas, calcas...
	private String nomeDoItem;
	private String marca;
	private float precoItem;
	
	public Item(int idItem, int quantidade, int tipo, String nomeDoItem, String marca, float precoItem) {
		super();
		this.idItem = idItem;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.nomeDoItem = nomeDoItem;
		this.marca = marca;
		this.precoItem = precoItem;	
	
		
	}

	public int getIdItem() {
		return idItem;
	}






	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}






	public int getQuantidade() {
		return quantidade;
	}






	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}






	public int getTipo() {
		return tipo;
	}






	public void setTipo(int tipo) {
		this.tipo = tipo;
	}






	public String getNomeDoItem() {
		return nomeDoItem;
	}






	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}






	public String getMarca() {
		return marca;
	}






	public void setMarca(String marca) {
		this.marca = marca;
	}






	public float getPrecoItem() {
		return precoItem;
	}






	public void setPrecoItem(float precoItem) {
		this.precoItem = precoItem;
	}


	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Camisetas";
		break;
		case 2:
			tipo = "Calças";
		break;
		case 3:
			tipo = "Calçados";
		break; 
		case 4:
			tipo = "Meias";
		break; 
		case 5:
			tipo = "Roupas Intimas";
		break;
		case 6:
			tipo = "Adereços";
		break;
		}
		
		System.out.println("\n\n*****************************************************");
		System.out.println("Informaçoes do Item:");
		System.out.println("*****************************************************");
		System.out.println("ID: " + this.idItem);
		System.out.println("Tipo: " + tipo);
		System.out.println("Nome: " + this.nomeDoItem);
		System.out.println("Marca: " + this.marca);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço: " + this.precoItem);
		


	}
}
