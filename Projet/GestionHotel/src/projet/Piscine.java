/**
 * Une classe pour caractérisé le piscine
 */
package projet;

/**
 * @author Andry, François, Christophe
 *
 */

public class Piscine extends Etage {
	protected static boolean EXISTE = false;
	protected static int nbr = 0;
	private static final float PRIXACHAT = 15000;
	protected static final float PRIXVENTE = 5000;
	protected static final float RECETTEMAX = 1000;
	protected static final float DEPENSE = 100;
	
	public Piscine(){
		this.nom="Piscine";
		niveauEtage ++;
		nbr++;
		EXISTE = true;
	}

	public static float getPrixachat() {
		return PRIXACHAT;
	}

	
	
}
