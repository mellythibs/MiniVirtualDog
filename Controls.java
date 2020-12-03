import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.Timer;

public class Controls implements MouseListener, MouseMotionListener{
	
	private long timer;
	MouseEvent arg0;
	boolean touched;
	int currentTime = 0;
	
	/*Timer watch= new Timer(currentTime, watchTask);
	TimerTask watchTask = new TimerTask() {
		public void run() {
			currentTime++;
		}
	};*/
	
	public Random rand = new Random();
	private int n;
	
	public Controls(int n, long timer){
		this.n = n;
		this.timer = timer;
		
	}
	
	public long getTimer() {
		//watch.start();
		mouseEntered(arg0);
		if (touched == true) {		
			timer = 0;
		}
			return timer;
	}
	
	public int getN() {
		n = rand.nextInt(20);
		return n;
	}
	

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override 
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		touched = true;
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
