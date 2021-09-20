package app;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

//public class InterfaceEx2  extends Frame implements WindowListener{
//public class InterfaceEx2 extends WindowAdapter{
public class InterfaceEx2 extends Frame{
		
	public InterfaceEx2() {
//		Frame f = new Frame();
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
//	public void	windowActivated(WindowEvent e) {}
//	
//	public void	windowClosed(WindowEvent e) {}
	
	public void	windowClosing(WindowEvent e) {
		System.exit(0);
		}
	
//	public void	windowDeactivated(WindowEvent e) {}
//	
//	public void	windowDeiconified(WindowEvent e) {}
//	
//	public void	windowIconified(WindowEvent e) {}
//	
//	public void	windowOpened(WindowEvent e) {}
	public static void main(String[] args) {
		new InterfaceEx2();
		
	}
}