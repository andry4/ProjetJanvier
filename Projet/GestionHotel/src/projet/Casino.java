/**
 * Une classe pour caractérisé le casino
 */
package projet;

/**
 * @author Andry, François, Christophe
 *
 */

public class Casino extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 99000;
	protected static final float PRIXVENTE = 50000;
	protected static final float RECETTEMAX = 15000;
	protected static final float DEPENSE = 2500;
	
	public Casino(){
		this.nom="Casino";
		niveauEtage ++;
		nbr++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}
	
}
