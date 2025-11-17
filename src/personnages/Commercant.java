package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,int quantite_argent) {
		super(nom,"thé",quantite_argent);
	}
	
	public int seFaireExtorquer() {
        int argentExtorque = getQuantite_argent(); 
        parler("J'ai tout perdu ! Le monde est trop injuste...");
        setQuantite_argent(0); 
        return argentExtorque;
    }
	
	
	
	public void recevoir(int argent) {
        parler(argent + " sous ! Je te remercie généreux donateur !");
        setQuantite_argent(getQuantite_argent() + argent);
    }
	
	@Override
	public void parler(String texte) {
	    super.parler(texte);
	}
	

}
