/**
 * Une classe d'hotel
 */
package projet;

/**
 * @author Andry, François, Christophe
 *
 */

public class Hotel extends Joueur{
	private String nomHotel;
	private int etoile;
	private int nbrEtage;
	
	public Hotel(){
		super();
		this.nomHotel = "inconnue";
		this.etoile=  0;
		this.nbrEtage= 0;
	}
	public Hotel(String nomHotel, String nomJoueur ){
		super(nomJoueur);
		this.nomHotel = nomHotel;
		this.etoile=  0;
		this.nbrEtage= 0;
	}
	
	public void ajouterEtoile(){
		this.etoile = this.etoile +1;
	}
	
	public void enleverEtoile(){
		this.etoile = this.etoile +1;
	}
	
	public void ajouterEtage(){
		this.nbrEtage = this.nbrEtage + 1;
	}
	
	public void enleverEtage(){
		this.nbrEtage = this.nbrEtage - 1;
	}
	
	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nom) {
		this.nomHotel = nom;
	}
	public int getEtoile() {
		return etoile;
	}
	public void setEtoile(int etoile) {
		this.etoile = etoile;
	}
	public int getNbrEtage() {
		return nbrEtage;
	}
	public void setNbrEtage(int nbrEtage) {
		this.nbrEtage = nbrEtage;
	}

	
}
