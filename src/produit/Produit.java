package produit;

public abstract class Produit {
	
	private Unite unite;
	private String nomProduit;

	public Produit(String nomProduit, Unite unite) {
		this.nomProduit = nomProduit;
		this.unite = unite;
	}

	public String getNomProduit() {
		return nomProduit;
	}
	/**/
	public abstract void descriptionProdiut();

	
}
