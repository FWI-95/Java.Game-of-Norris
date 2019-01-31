package code;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame {
	
	BufferedImage bimageEnde;
	ImageIcon imicEnde;
	
	JLabel jlblEnde;
	
	public GameFrame(int intType){
		this.setSize(960,540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		jlblEnde = new JLabel("");

		if (intType==1){
			
			try {
				bimageEnde = ImageIO.read(getClass().getResourceAsStream("/gfx/Win.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (intType==2){
			
			try {
				bimageEnde = ImageIO.read(getClass().getResourceAsStream("/gfx/Lose.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		imicEnde = new ImageIcon(bimageEnde);
		
		jlblEnde.setIcon(imicEnde);
		
		this.add(jlblEnde);
		
	}

}
