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
	
	
	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}

	public void provoquer(Yakuza adversaire) {
		int force=2*getHonneur();
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force>= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
            int gain = adversaire.perdre();
            setQuantite_argent(getQuantite_argent() + gain); 
            setHonneur(getHonneur()+1);
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            int perte = getQuantite_argent(); 
            adversaire.gagner(perte); 
            setQuantite_argent(0); 
            setHonneur(getHonneur()-1);
		}
	}
	

}
