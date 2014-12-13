package graphique;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PartieBas extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1117714526775129860L;
	private JLabel Tdirecteur ;
	private JLabel TnomHotel;
	private JLabel nomDirecteur;
	private JLabel nomHotel;
	private JLabel solde;
	private JLabel TSolde;
	private JLabel taux;
	private JButton tauxBouton;
	
	GridBagConstraints gbc ;
	
	public PartieBas(String ht,String dic, String sl, String tx){
		super();
		TnomHotel = new JLabel ("NOM HOTEL");
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		nomHotel = new JLabel (ht);
		nomHotel.setPreferredSize(new Dimension(100, 40));
		Tdirecteur = new JLabel ("DIRECTEUR");
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		nomDirecteur = new JLabel (dic);
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		TSolde = new JLabel ("SOLDE");
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		solde = new JLabel (sl);
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		tauxBouton = new JButton ("Lancez"); 
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		taux = new JLabel (tx);
		TnomHotel.setPreferredSize(new Dimension(100, 40));
		
		this.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		
		gbc.gridheight = 1;
	    gbc.gridwidth = 1;
		
	    
		gbc.gridx = 0;
		gbc.gridy = 0;
	    this.add(TnomHotel, gbc);
	    gbc.gridy = 1;
	    this.add(nomHotel, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    this.add(Tdirecteur, gbc);
	    gbc.gridy = 1;
	    this.add(nomDirecteur, gbc);
		
	    gbc.gridx = 2;
	    gbc.gridy = 0;
	    this.add(TSolde, gbc);
	    gbc.gridy = 1;
	    this.add(solde, gbc);
	    
	    gbc.gridx = 3;
	    gbc.gridy = 0;
	    this.add(tauxBouton, gbc);
	    gbc.gridy = 1;
	    this.add(taux, gbc);

		
	}

	public JLabel getTdirecteur() {
		return Tdirecteur;
	}

	public void setTdirecteur(JLabel tdirecteur) {
		Tdirecteur = tdirecteur;
	}

	public JLabel getTnomHotel() {
		return TnomHotel;
	}

	public void setTnomHotel(JLabel tnomHotel) {
		TnomHotel = tnomHotel;
	}

	public JLabel getNomDirecteur() {
		return nomDirecteur;
	}

	public void setNomDirecteur(JLabel nomDirecteur) {
		this.nomDirecteur = nomDirecteur;
	}

	public JLabel getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(JLabel nomHotel) {
		this.nomHotel = nomHotel;
	}

	public JLabel getSolde() {
		return solde;
	}

	public void setSolde(JLabel solde) {
		this.solde = solde;
	}

	public JLabel getTSolde() {
		return TSolde;
	}

	public void setTSolde(JLabel tSolde) {
		TSolde = tSolde;
	}

	public JLabel getTaux() {
		return taux;
	}

	public void setTaux(JLabel taux) {
		this.taux = taux;
	}

	public JButton getTauxBouton() {
		return tauxBouton;
	}

	public void setTauxBouton(JButton tauxBouton) {
		this.tauxBouton = tauxBouton;
	}

}
