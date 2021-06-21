import javax.swing.*;
import java.awt.*;

public class Lab6Part1 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new Lab6Part1();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

    Container contentPane = getContentPane();

    String[] cities = {"Dublin", "London", "Paris", "Berlin","Brussels", "Anderlecht"};
    String[] countries = {"Ireland","France","Germany","Spain","Netherlands","Sweden"};

    JPanel panel1 = new JPanel();
    JLabel label1 = new JLabel("Select an option in the box below and press the button");
    JComboBox<String> combo1 = new JComboBox<String>(cities);
    JButton button1 = new JButton("Choose this city");

    JPanel panel2 = new JPanel();
    JLabel label2 = new JLabel("Select one country");
    JComboBox<String> combo2 = new JComboBox<String>(countries);
    JButton button2 = new JButton("Choose this country");


	public Lab6Part1() {

        contentPane.setLayout(new BorderLayout());
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));

        panel1.add(label1);
        panel1.add(combo1);
        panel1.add(button1);

        panel2.add(label2);
        panel2.add(combo2);
        panel2.add(button2);

        contentPane.add(panel1, BorderLayout.NORTH);
        contentPane.add(panel2, BorderLayout.CENTER);

        setTitle("2 Labels BoxLayout");
		setSize(500,150);
		setVisible(true);
	}

}
