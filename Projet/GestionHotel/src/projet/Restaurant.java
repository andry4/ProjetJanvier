/**
 * Une classe pour caract�ris� le r�staurant
 */
package projet;

/**
 * @author Andry, Fran�ois, Christophe
 *
 */

public class Restaurant extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 50000;
	protected static final float PRIXVENTE = 35000;
	protected static final float RECETTEMAX = 5000;
	protected static final float DEPENSE = 2000;
	
	public Restaurant(){
		this.nom="Restaurant";
		niveauEtage ++;
		nbr++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}

	
}