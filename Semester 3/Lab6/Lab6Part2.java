import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;



public class Lab6Part2 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new Lab6Part2();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

    Container contentPane = getContentPane();

    String[] carManufacturers = {"BMW","Volkswagen","Audi"};

    JPanel displayPanel=new JPanel(),comboPanel = buildComboPanel(),listPanel = buildListPanel();

    JComboBox<String> carCombo = new JComboBox<String>(carManufacturers);
    JList<String> listCombo = new JList<String>(carManufacturers);

    Font textFont;

    JPanel buttons = new JPanel();
    JButton listButton = new JButton("List Button");
    JButton comboButton = new JButton("Combo button");

	public Lab6Part2() {

		buttons.add(listButton);

		listButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout)displayPanel.getLayout();

				card.first(displayPanel);

			}
		});
		buttons.add(comboButton);
		comboButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout)displayPanel.getLayout();

				card.last(displayPanel);

			}
		});
		displayPanel.setLayout(new CardLayout());
		displayPanel.add(comboPanel);
		displayPanel.add(listPanel);

		getContentPane().add(displayPanel, BorderLayout.CENTER);
		getContentPane().add(buttons,BorderLayout.SOUTH);

		setSize(300,300);
		setVisible(true);
	}

    public JPanel buildComboPanel() {

		JPanel panel = null;

		panel = new JPanel(new BorderLayout());

		JLabel card1Label = new JLabel("Select a combobox option below");
		textFont = new Font("Serif", Font.BOLD | Font.ITALIC, 20);
		card1Label.setFont(textFont);
		panel.add(card1Label,BorderLayout.NORTH);

		JComboBox<String> carCombo = new JComboBox<String>(carManufacturers);
		panel.add(carCombo,BorderLayout.CENTER);


		return panel;

	}

    public JPanel buildListPanel() {

		JPanel panel = null;

		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JLabel card2Label = new JLabel("Select a list option below");
		textFont = new Font("Serif", Font.BOLD | Font.ITALIC, 20);
		card2Label.setFont(textFont);
		panel.add(card2Label,BorderLayout.NORTH);

		JList<String> listCombo = new JList<String>(carManufacturers);
		panel.add(listCombo,BorderLayout.CENTER);

		return panel;

	}

}
