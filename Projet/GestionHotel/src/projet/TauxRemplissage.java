/**
 * Une classe qui h�rite de random pour avoir un nombre au hasard
 */
package projet;

/**
 * @author Andry, Fran�ois, Christophe
 *
 */
import java.util.Random;

public class TauxRemplissage extends Random {
	
/*
 * Une methode permet d'avoir un nombre au hasard 
 * @return un nombre de 1 � 100
 */
	private static final long serialVersionUID = 1L; // ?????????
	public int taux(){
		return this.nextInt(100 - 1 + 1) + 1;
	}
}
