/**/


import java.awt.Canvas;

import javax.swing.*;


public class Panel extends JFrame{
	
	private JFrame window;
	private Canvas spread = new Canvas();
	static int n;
	static long time;
	public static Controls para = new Controls(n, time);
	public static Dog Lexi = new Dog();
	
	 public Panel() {
		 setBounds(0,0,400,600);
		 setVisible(true);
		 this.add(Lexi.feed);
		 Lexi.feed.isVisible();
		 this.add(Lexi.pet); 
		 this.add(Lexi);
		 Lexi.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Need to do this to make sure we don't have a thread still looping in the background when "X" is clicked on
		 
	 }
	 
	 public static void command() {
		 
		 //System.out.print("Check args"); //IT DOES CHECK HERE
		 System.out.print("N: " + para.getN());
		 
		 
		if(para.getTimer() < 600000) {
			if(para.getN() == 10) {
				Lexi.paw();
			}
			if(para.getN() == 15) {
				Lexi.bark();
			}
			else {
				Lexi.sit();
			}
		}
		else{
			Lexi.sleep();
			}
	 }
	 
	public static void main(String[] args) {
			
		Panel pup = new Panel();
		
		//THIS CONTROLS EVERYTHING
		//Don't let the thread die... let it keep running in a loop
		while(true)
		{
			command();
			pup.repaint();
			System.out.println("Repaint");
			try{
			Thread.sleep(1750);
			}catch(Exception e)
			{}
		}
		
	}

}
