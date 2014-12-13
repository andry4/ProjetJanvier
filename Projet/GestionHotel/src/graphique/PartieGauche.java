package graphique;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projet.Bar;
import projet.Casino;
import projet.Chambre;
import projet.Discotheque;
import projet.Piscine;
import projet.Restaurant;
import projet.SalleSport;

@SuppressWarnings("serial")
public class PartieGauche extends JPanel {
	
	private JLabel info = new JLabel("Choix d'etage et son prix");
	private Dimension dimBouton = new Dimension(100,50);
	String[] tabEtage = {"Bar", "Casino", "Chambre", "Discothèque", "Piscine", "Restaurant", "Salle de Sport"};
	JButton[] boutonEtage = new JButton[tabEtage.length];
	String[] tabPrix = {Float.toString(Bar.getPrixachat()),Float.toString(Casino.getPrixachat())
						,Float.toString(Chambre.getPrixachat()),Float.toString(Discotheque.getPrixachat())
						,Float.toString(Piscine.getPrixachat()),Float.toString(Restaurant.getPrixachat())
						,Float.toString(SalleSport.getPrixachat())};
	JLabel[] prix = new JLabel[tabEtage.length];
	
	public PartieGauche(){
		super();
		this.add(info);
		for(int i = 0; i < tabEtage.length; i++){
			boutonEtage[i] = new JButton(tabEtage[i]);
			this.add(boutonEtage[i]);
			boutonEtage[i].setPreferredSize(dimBouton);
			prix[i] = new JLabel(tabPrix[i]);
			this.add(prix[i]);
		}
		
	}
}
