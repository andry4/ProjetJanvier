/**
 * Une classe pour caractérisé le discothèque
 */
package projet;

/**
 * @author Andry, François, Christophe
 *
 */

public class Discotheque extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 30000;
	protected static final float PRIXVENTE = 15000;
	protected static final float RECETTEMAX = 5000;
	protected static final float DEPENSE = 1000;
	
	public Discotheque(){
		this.nom="Discotheque";
		niveauEtage ++;
		nbr++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}

}
