package ecommerce.model;

public class ItemParteDeBaixo extends Item{

	private String tipoTecido;

	public ItemParteDeBaixo(int idItem, int quantidade, int tipo, String nomeDoItem, String marca, float precoItem, String tipoTecido) {
		super(idItem, quantidade, tipo, nomeDoItem, marca, precoItem);
		this.tipoTecido = tipoTecido; 
	}

	public String getTipoTecido() {
		return tipoTecido;
	}

	public void setTipoTecido(String tipoTecido) {
		this.tipoTecido = tipoTecido;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de tecido: " + this.tipoTecido);
	}
	
}
