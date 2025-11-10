package personnages;

public class Humain {
	private String nom;
	private String boisson_fav;
	private int quantite_argent;

	public Humain(String nom, String boisson_fav, int quantite_argent) {
		this.nom= nom;
		this.boisson_fav=boisson_fav;
		this.quantite_argent= quantite_argent;
	}

	public String getNom() {
		return nom;
	}

	public int getQuantite_argent() {
		return quantite_argent;
	}

	public void setQuantite_argent(int quantite_argent) {
		this.quantite_argent = quantite_argent;
	}

	public void direBonjour() {
		System.out.println("Bonjour ! Je m'apelle " + nom + " et j'aime boire du " + boisson_fav+".");

	}

	public void boire() {
		System.out.println("Mmmm, un bon verre de " + boisson_fav + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (getQuantite_argent() >= prix) {
		
			System.out.println("J'ai " + quantite_argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à "
					+ prix + " sous.");
			perdreArgent(prix);
		} else {
			System.out.println("Je n'ai plus que " + quantite_argent + " sous en poche. Je ne peux même pas m'offrir "
					+ bien + " à " + prix + " sous.");
		}

	}

	private void gagnerArgent(int gain) {
		setQuantite_argent(quantite_argent + gain);
	}

	private void perdreArgent(int perte) {
		setQuantite_argent(quantite_argent - perte);

	}

	private String prendreParole() {
		return "(" + getNom() + ") - ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

}
