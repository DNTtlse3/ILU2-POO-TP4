package produit;

public abstract class Produit implements IProduit {
	
	private Unite unite;
	private String nomProduit;

	protected Produit(String nomProduit) {
		this.nomProduit = nomProduit;

	}

	@Override
	public String getNomProduit() {
		return nomProduit;
	}
	
	
	@Override
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	

	
}
