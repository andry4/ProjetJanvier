/**
 * Une classe pour caractérisé la chambre
 */
package projet;

/**
 * @author Andry, François, Christophe
 *
 */

public class Chambre extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 50000;
	protected static final float PRIXVENTE = 35000;
	protected static final float RECETTEMAX = 5000;
	protected static final float DEPENSE = 1000;

	public Chambre(){
		this.nom="Chambre";
		Etage.niveauEtage ++;
		nbr ++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}
	
}
