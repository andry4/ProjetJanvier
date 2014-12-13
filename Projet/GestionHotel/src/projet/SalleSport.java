/**
 * Une classe pour caract�ris� le salle de sport
 */
package projet;

/**
 * @author Andry, Fran�ois, Christophe
 *
 */

public class SalleSport extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 10000;
	protected static final float PRIXVENTE = 7500;
	protected static final float RECETTEMAX = 1000;
	protected static final float DEPENSE = 100;
	
	public SalleSport(){
		this.nom="Salle de sport";
		niveauEtage ++;
		nbr++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}

}
