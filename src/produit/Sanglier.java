package produit;

public class Sanglier extends Produit{
	
	private String nomChasseur;
	private int poids;

	public Sanglier(String nomProduit,Unite unite,String nomChasseur, int poids) {
		super(nomProduit,unite);
		this.nomChasseur = nomChasseur;
		this.poids = poids;
	}

	@Override
	public void descriptionProdiut() {
		// TODO Auto-generated method stub
		
	}
	
}
