package produit;

public class Sanglier extends Produit{
	
	private String nomChasseur;
	private int poids;

	public Sanglier(int quantite ,String nomChasseur, int poids) {
		super("Sanglier",quantite);
		this.nomChasseur = nomChasseur;
		this.poids = poids;
	}

	@Override
	public void descriptionProduit() {
		// TODO Auto-generated method stub
		
	}
	
}
