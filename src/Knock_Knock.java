import javax.swing.JOptionPane;

public class Knock_Knock {
public static void main(String[] args) {
	String joke=JOptionPane.showInputDialog(null, "Knock Knock");
	if(joke.equals("Who's There")) {
		
		String Mom=JOptionPane.showInputDialog(null, "Mom");
		if(Mom.equals("Mom Who")) {
			JOptionPane.showMessageDialog(null, "Your Mom let me in now!");
			for(int i=0; i<20;i++) {
				JOptionPane.showMessageDialog(null, "Ha");
				}
		}else {
			JOptionPane.showMessageDialog(null, "You ruined the joke! :(");
		}
	}else {
		JOptionPane.showMessageDialog(null, "That's not how you're supposed to do the joke!  RESTART");
	}
	
}
}
