package produit;

public abstract class Produit implements IProduit {
	
	private Unite unite;
	private int quantite;
	private String nomProduit;

	protected Produit(String nomProduit, int quantite) {
		this.nomProduit = nomProduit;
		this.quantite = quantite;
	}

	@Override
	public String getNomProduit() {
		return nomProduit;
	}
	/**/
	//@Override
	//public abstract void descriptionProduit();
	
	
	@Override
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	

	
}
