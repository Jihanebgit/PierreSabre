package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	public Ronin(String nom, String boisson_fav, int quantite_argent){
		super(nom,boisson_fav,quantite_argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don=getQuantite_argent() * 10/100;
		parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}

}
