import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your name");
	String answer=JOptionPane.showInputDialog("I know what you did last summer, " +name+ ". You wanna know?");
	if(answer.equals("ok")) {
		JOptionPane.showMessageDialog(null, "You went to Hawaii and tried to surf, but you failed miserably.");
	}
	if(answer.equals("no")) {
		JOptionPane.showMessageDialog(null, "Well, I'm gonna tell you anyways.  You went to Hawaii and tried learning how to surf, but you failed miserably");
	}
}
}
