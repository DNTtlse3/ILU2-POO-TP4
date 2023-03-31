package produit;

public class Poisson extends Produit{
	
	private String date;

	public Poisson(int quantite ,String date) {
		super("Fish",quantite);
		this.date  = date;
	}
	
	@Override
	public void descriptionProduit() {
		// TODO Auto-generated method stub
		
	}
	

}
