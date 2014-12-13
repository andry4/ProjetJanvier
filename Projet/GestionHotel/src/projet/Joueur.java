/**
 * Une classe de joueur pour g�rer le solde
 */
package projet;

/**
 * @author Andry, Fran�ois, Christophe
 *
 */

public class Joueur {
	
	private String nomJoueur;
	private float solde;
	
	public Joueur(){
		this.nomJoueur ="inconnue";
		this.solde=100000;
	}
	public Joueur(String name){
		this.nomJoueur =name;
		this.solde=100000;
	}
	
	public void acheterEtage(float achat){
		this.solde = this.solde - achat;
	}
	
	public void vendreEtage(float vente){
		this.solde = this.solde + vente;
	}
	
	/*
	 * Une methode qui permet de calculer le solde 
	 * @param recette : le solde gagner
	 * @param depense : le solde d�penser
	 */
	public void solde (float recette, float depense){
		this.solde = this.solde + recette - depense;
	}
	
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nom) {
		this.nomJoueur = nom;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
	
}
