import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Lab6Part4 extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new Lab6Part4();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	}

    Container contentPane = getContentPane();
    JPanel displayPanel = new JPanel(new CardLayout());


    JPanel firstQuestionPanel = buildFirstQuestionPanel();
    JPanel secondQuestionPanel = buildSecondQuestionPanel();
    JPanel thirdQuestionPanel = buildThirdQuestionPanel();


    JButton selectButton = new JButton("Select");

    JLabel firstOption = new JLabel("Not selected an option");
    JLabel secondOption = new JLabel("Not selected an option");
    JLabel thirdOption = new JLabel("Not selected an option");

    JPanel resultPanel;

	public Lab6Part4() {

		displayPanel.add(firstQuestionPanel);
		displayPanel.add(secondQuestionPanel);
		displayPanel.add(thirdQuestionPanel);


		selectButton.addActionListener(new ActionListener() {

			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				CardLayout card = (CardLayout)displayPanel.getLayout();

				if(i == 2) { // Loop so it doesn't build the result panel before it gets to 3rd interface
				resultPanel = buildResultPanel();
				displayPanel.add(resultPanel);
				}
				else {
					i++;
					System.out.println(i); // Just for self testing purposes
				}

				card.next(displayPanel);
			}
		});

		contentPane.add(selectButton,BorderLayout.SOUTH);
		contentPane.add(displayPanel,BorderLayout.CENTER);

		setSize(400,300);
		setVisible(true);
	}

	public JPanel buildFirstQuestionPanel() {

		JPanel panel = null;

		panel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("What's your favourite animal?");
		panel.add(label,BorderLayout.NORTH);

		JPanel radioButtonPanel = new JPanel(new BorderLayout());

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				firstOption.setText(((JRadioButton) e.getSource()).getText());
			}
		};

		JRadioButton button1 = new JRadioButton("Cat");
		button1.addActionListener(actionListener);

		JRadioButton button2 = new JRadioButton("Dog");
		button2.addActionListener(actionListener);

		JRadioButton button3 = new JRadioButton("Bird");
		button3.addActionListener(actionListener);

		ButtonGroup group = new ButtonGroup();


		group.add(button1);
		group.add(button2);
		group.add(button3);
		radioButtonPanel.add(button1,BorderLayout.NORTH);
		radioButtonPanel.add(button2,BorderLayout.CENTER);
		radioButtonPanel.add(button3,BorderLayout.SOUTH);
		panel.add(radioButtonPanel,BorderLayout.CENTER);

		return panel;

	}
	public JPanel buildSecondQuestionPanel() {

		JPanel panel = null;

		panel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("What's your favourite language?");
		panel.add(label,BorderLayout.NORTH);

		JPanel radioButtonPanel = new JPanel(new BorderLayout());

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				secondOption.setText(((JRadioButton) e.getSource()).getText());
			}
		};

		JRadioButton button1 = new JRadioButton("English");
		button1.addActionListener(actionListener);

		JRadioButton button2 = new JRadioButton("French");
		button2.addActionListener(actionListener);

		JRadioButton button3 = new JRadioButton("German");
		button3.addActionListener(actionListener);


		ButtonGroup group = new ButtonGroup();

		group.add(button1);
		group.add(button2);
		group.add(button3);
		radioButtonPanel.add(button1,BorderLayout.NORTH);
		radioButtonPanel.add(button2,BorderLayout.CENTER);
		radioButtonPanel.add(button3,BorderLayout.SOUTH);
		panel.add(radioButtonPanel,BorderLayout.CENTER);

		return panel;

	}
	public JPanel buildThirdQuestionPanel() {

		JPanel panel = null;

		panel = new JPanel(new BorderLayout());
		JLabel label = new JLabel("What's your favourite sport?");
		panel.add(label,BorderLayout.NORTH);

		JPanel radioButtonPanel = new JPanel(new BorderLayout());

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thirdOption.setText(((JRadioButton) e.getSource()).getText());
			}
		};

		JRadioButton button1 = new JRadioButton("Football");
		button1.addActionListener(actionListener);
		JRadioButton button2 = new JRadioButton("Basketball");
		button2.addActionListener(actionListener);
		JRadioButton button3 = new JRadioButton("Tennis");
		button3.addActionListener(actionListener);
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		radioButtonPanel.add(button1,BorderLayout.NORTH);
		radioButtonPanel.add(button2,BorderLayout.CENTER);
		radioButtonPanel.add(button3,BorderLayout.SOUTH);
		panel.add(radioButtonPanel,BorderLayout.CENTER);

		return panel;

	}

	public JPanel buildResultPanel() {
		JPanel panel = null;

		panel = new JPanel(new BorderLayout());
		JPanel choicesPanel = new JPanel(new BorderLayout());

		JLabel choicesLabel = new JLabel("Your choices were as follows:");
		panel.add(choicesLabel,BorderLayout.NORTH);

		JLabel firstAnswer = new JLabel("Animal: " + firstOption.getText());
		JLabel secondChoice = new JLabel("Language: " + secondOption.getText());
		JLabel thirdChoice = new JLabel("Sport: " + thirdOption.getText());
		choicesPanel.add(firstAnswer,BorderLayout.NORTH);
		choicesPanel.add(secondChoice,BorderLayout.CENTER);
		choicesPanel.add(thirdChoice,BorderLayout.SOUTH);

		panel.add(choicesPanel,BorderLayout.CENTER);

		return panel;
	}




}