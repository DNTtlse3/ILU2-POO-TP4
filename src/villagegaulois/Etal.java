package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal <P extends IProduit> {
	
	private Gaulois vendeur;
	private P[] tabProduit;
	private int quantiteProduit;
	private int prixProduit; 
	
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.tabProduit = produit;
		this.prixProduit = prix;
		
	}
}
