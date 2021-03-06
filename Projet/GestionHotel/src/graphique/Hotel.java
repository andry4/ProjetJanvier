package graphique;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Hotel extends JPanel {
	
	
	private String[] img;
	private int [] a = new int [15];
	Image [] image;
	
	public Hotel(int []copy ){
		super();
		img = new String[8];
		img[0] = "images/fond.jpg";
		img[1] = "images/casino.jpg";
		img[2] = "images/chambre.jpg";
		img[3] = "images/discotheque.jpg";
		img[4] = "images/piscine.jpg";
		img[5] = "images/salleSport.jpg";
		img[6] = "images/restaurant.jpg";
		img[7] = "images/bar.jpg";
		
		image = new Image[8];
		a=copy;
		setPreferredSize(new Dimension(750, 100*16));
		a= (int[])copy.clone();
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		
		try {
			for(int i=0;i<8;i++){
				image[i] = ImageIO.read(new File(this.img[i]));
			}
			for(int i=0;i<15;i++){
				g.drawImage(image[a[i]], 0,1500-(100*i), this);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
