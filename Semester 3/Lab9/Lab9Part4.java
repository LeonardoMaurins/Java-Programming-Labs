import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab9Part4 extends JFrame{

	public static void main(String[]args){
		JFrame frame = new Lab9Part4();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public Lab9Part4(){
		Container contentPane = getContentPane();

		JButton startButton = new JButton("Begin or end your fate!");

		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String [] lifeChoices = {"Pull the Golden lever", "Pull the Bedrock lever", "Turn around and continue walking"};

				int n = JOptionPane.showOptionDialog(contentPane, "You appear in what seems to be a plain of void, before you are two levers, one with a lustrous\n"
						+ " golden marble design and another with a brimming red aura for a lever made out of bedrock.", "Question One",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, lifeChoices, lifeChoices[2]);

				if(n == 0){
					String [] firstPath = {"Knock on the gate", "Rush in without hesitation"};

					int s = JOptionPane.showOptionDialog(contentPane, "You are summoned before a bright silver gate with a door\n knocker on it as it floats in the air on clouds. \n" +
					"While what lays behind seems to be angels flying around in the background and exactly\n what you'd expect paradaise on earth to be like. Before entering do you:", "Question Two",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, firstPath, firstPath[0]);

						if(s == 0) {
							JOptionPane.showMessageDialog(contentPane, "You are surprised by an explosion of smoke before you\n as Gandalf the Great materializes right in front of your eyes, \n" +
							"thank you for your kind gesture of not barging in without manners, he accommodates you\n into utopia past the gates. "
							+ "You proceed to go on to live an infinite life of joy and pleasure.", "Atta boy!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path1.jpg"));
						}
						else{
							JOptionPane.showMessageDialog(contentPane, "Upon your entrance, suddenly all the angels disappear, the clouds turn grey, the weather worsens as a furiously enraged Gandalf thunders down before you,\n"
							+ " dressed in black as if it was your funeral that was due, he in huge disappointment banishes you\n"
							+ " right down to hell for your poor manners for where another fate shall bestall you.", "Unlucky mate!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path2.jpg"));
						}
				}

				else if(n == 1){
					String [] firstPath = {"Push the tree across the canyon gap", "Pull the tree back towards you"};

					int s = JOptionPane.showOptionDialog(contentPane, "You fall to what seems like a trapdoor through deep darkness before landing on your knees as a hellish lava filled canyon is crazed before your eyes,\n"
							+ " you see the other side with what appears to be your deepest desires having come to fruition and physical nature to your will,\n"
							+ " but to get across what only seems to be an option of is a broken down oak tree right beside the canyon which doesn't look like it has much of a lifespan left,\n"
							+ " atop it sits a white cat screeching for what seems to be aid, with the tree at its limits. Do you:", "Question Two",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, firstPath, firstPath[0]);

						if(s == 0) {
							JOptionPane.showMessageDialog(contentPane, "Your impulses cannot resist the urge of the satisfaction for what awaits you on the other end as you eagerly shove the tree over the canyon without care for the cat's well being.\n"
									+ " As the tree topples over, the cat frightened jumps and falls off down right into the canyon. Without care you rush across the plank only to find nothing but Satan himself standing there in front of you glaring with a huge smirk.\n"
									+ " \"You'll fit right in here\" he says before dragging you into the depths of hell.","Better luck next time kiddo!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path3.jpg"));
						}
						else{
							JOptionPane.showMessageDialog(contentPane, "The tree collapses on your side of the canyon crumbling into a bunch of sticks with a happy and purring cat now at your leg meowing for your attention and comfort.\n"
									+ " You pet it only to witness it instantly morph into a fallen angel who was trapped here in an infinite loop of dwellers passing by waiting for someone to save it and break the curse to prove human's have some faith worth believing in.\n"
									+ " In gratitude it offers to bring you back up into heaven with it as it spreads its wings and takes your hand.", "Lucky you!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path4.jpg"));
						}
				}

				else if(n == 2){
					String [] firstPath = {"Walk up the stairs", "Keep walking past"};

					int s = JOptionPane.showOptionDialog(contentPane, "You turn around and head right back into the void, not long before you come across a stairway\n"
							+ " with what seems to be a bright light at the entrance shining blindly at you, Do you:", "Question Two",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, firstPath, firstPath[0]);

						if(s == 0) {
							JOptionPane.showMessageDialog(contentPane, "You walk up the stairs and enter through the light as you feel all of a suddenly any memories of anything prior being wiped and all of a sudden you hear a loud \"Waaaaaa!!!\" noise,\n"
									+ " what is it you ponder? Well it's you!", "Welcome back for round 2!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path5.jpg"));
						}
						else{
							JOptionPane.showMessageDialog(contentPane, "You walk past the staircase further into the void, you keep walking for what seems to be eternity before realising it truly is that in itself.\n"
									+ " You are now lost in the middle of nowhere. Having gone insane, with your sanity sapped, you faint physically and out of existence.", "You boring fool, tis' not how you play a game!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("images/path6.jpg"));
						}
				}
			}
		});

		contentPane.add(startButton);

		setTitle("Lab9Part4");
		setSize(500,300);
		setVisible(true);
	}

}