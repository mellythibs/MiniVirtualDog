import java.awt.Graphics;
import java.awt.Graphics2D; // NOT Used
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.*;



@SuppressWarnings("serial")
public class Dog extends JPanel{
	
	JButton feed; //Activates the eat() method
	JButton pet;  //Activates the wagTail() method
	BufferedImage pose;
	
	
	
	public Dog() {
		
		feed = new JButton();
		feed.setSize(300,300);	//paintComponent will not be called if JPanel is not given a size
		feed.setText("Feed");
		feed.setBounds(0, 0, 100, 20);
		feed.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				eat();
			}});
		//this.add(feed);	
		pet = new JButton(); 
		pet.setSize(300, 300);	
		pet.setEnabled(true);
		pet.setOpaque(false);
		pet.setContentAreaFilled(false);
		pet.setBorderPainted(false);
		pet.setBounds(100, 100, 300, 300); 
		pet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				wagTail();
			}});
		sit();
		
		
	}
	
	public void paintComponent(Graphics g) {
		 super.paintComponent(g);
	        g.drawImage(pose, 0, 0, this);
	        System.out.println("PAINT"); // Debugging: Seeing if paintComponent is ever reached
	       /* try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		} 
	
	
	
	public void sit() {
	//Sit pic	
	
			try{
			   	pose = ImageIO.read(new File("poses/Sit.jpg"));
			   	System.out.println("SIT");
			   	//repaint();
			}
			catch(Exception e) {
				System.out.println("Image Missing");
			}
		
	}
	
	public void sleep() {
	//sleep pic if inactive for 10 mins	
		
			try{
				pose = ImageIO.read(new File("poses/Sleep.jpg"));
				System.out.println("SLEEP");
				repaint();
			}
			catch(Exception e) {
				System.out.println("Image Missing");
			}
		
	}
	
	public void wagTail() {
	//wag tail once player returns	
		
			try{
			   	pose = ImageIO.read(new File("poses/Wag.jpg"));
			   	System.out.println("WAG");
			   	repaint();
			}
			catch(Exception e) {
				System.out.println("Image Missing");
			}
		
	}
	
	public void paw() {
	//paws camera at random:: random of 10?
		
			try{
			   	pose = ImageIO.read(new File("poses/Paw1.jpg"));
			   	System.out.println("PAW1");
			   	repaint();
			   	TimeUnit.SECONDS.sleep(5);
			   	pose = ImageIO.read(new File("poses/Paw2.jpg")); 
			   	System.out.println("PAW2");
			   	repaint();
			}
			catch(Exception e) {
				System.out.println("Image Missing");
			}
		
	}
	
	public void bark() {
	//barks at random:: random of 20?	
		
			try{
			   	pose = ImageIO.read(new File("poses/Bark.jpg"));
			   	System.out.println("BARK");
			   	repaint();
			}
			catch(Exception e) {
				System.out.println("Image Missing");
			}
		
	}
	
	public void eat() {
	//eats if the player hits the feed JButton	
		try{
			   pose = ImageIO.read(new File("poses/Eat.jpg"));
			   System.out.println("EAT");
			   repaint();
			  
		
		}
		catch(Exception e) {
			System.out.println("Image Missing");
		}
	}
	
	
}

