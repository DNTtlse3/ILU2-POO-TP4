package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	
	private Gaulois chasseur;
	private int poids;

	public Sanglier(int poids ,Gaulois chasseur) {
		super("Sanglier");
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public void descriptionProduit() {
		// TODO Auto-generated method stub
		
	}
	
}
