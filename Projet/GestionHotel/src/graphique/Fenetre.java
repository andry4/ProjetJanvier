/**
 * 
 */
package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.RootPaneContainer;

import projet.Bar;
import projet.Casino;
import projet.Chambre;
import projet.Discotheque;
import projet.Piscine;
import projet.Restaurant;
import projet.SalleSport;

/**
 * @author Andry, Froi�ois, Christophe
 *
 */
public class Fenetre extends JFrame{
	private JPanel contentPan;
	private JPanel partiBas;
	private JPanel partiGauche;
	private JPanel reste;
	private int [] struct;
	
	private JPanel test;
	
	JLabel image1 = new JLabel( new ImageIcon( "img3.jpg"));
	
	public Fenetre() throws IOException{
		this.setTitle("Gestion d'Hotel");
		this.setSize(900, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		contentPan = new JPanel();
		partiBas =  new PartieBas("Hilton","Gerrard","110000","65");
		partiGauche = new PartieGauche();
		reste = new JPanel();
		
		contentPan.setLayout(new BorderLayout(900, 650));
		setContentPane(contentPan);
		
		contentPan.setLayout(new BorderLayout());
		
		contentPan.add(partiBas, BorderLayout.SOUTH);
		partiBas.setPreferredSize(new Dimension(650,100));
		partiBas.setBackground(Color.WHITE);
		
		contentPan.add(partiGauche, BorderLayout.WEST);
		partiGauche.setPreferredSize(new Dimension(200,550));
		partiGauche.setBackground(Color.WHITE);
		
		contentPan.add(reste, BorderLayout.CENTER);
		//reste.add(image);
		
		this.getContentPane().add(new JScrollPane(reste));
		struct = new int [15];
		for(int i = 0;i<15;i++){
			struct[i] = 0;
		}
		ajouterImage(0, 2);
		ajouterImage(1,3);
		ajouterImage(2,1);
		reste.add(new Hotel(struct));

	}

	public void ajouterImage(int ind, int ref) {
		this.struct[ind]=ref;
	}
		
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Fenetre fn = new Fenetre();
						fn.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}


}
