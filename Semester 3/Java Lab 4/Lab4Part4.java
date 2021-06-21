import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Lab4Part4 extends JFrame implements ActionListener{

	public static void main(String[] args){
		JFrame frame = new Lab4Part4();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   double balance = 0;

public Lab4Part4(){
	Container contentPane = getContentPane();
		JPanel balancePanel = new JPanel();
		JPanel costPanel = new JPanel(new GridLayout(0,1,0,25));
		JPanel topUpPanel = new JPanel();
		JPanel pricesPanel = new JPanel(new GridLayout(0,1,0,25));

		JLabel balanceLabel = new JLabel("Your current balance is: \u20ac" + balance);
			balancePanel.add(balanceLabel);
			balanceLabel.setFont(new Font("Calibri", Font.BOLD,20));
			balanceLabel.setForeground(Color.red);
			balanceLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JLabel callCostLabel = new JLabel("Call Cost: 40 Cent");
			pricesPanel.add(callCostLabel);
			callCostLabel.setFont(new Font("Courier", Font.BOLD,25));

		JLabel textCostLabel = new JLabel("Text Cost: 25 Cent");
			pricesPanel.add(textCostLabel);
			textCostLabel.setFont(new Font("Courier", Font.BOLD,25));

		JButton callButton = new JButton("Make Call");
			costPanel.add(callButton);
			callButton.setFont(new Font("Courier", Font.BOLD,35));
			callButton.setBackground(Color.cyan);
			callButton.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent e) {
					if(balance - 0.40 > 0){
					balance -= 0.40;
					balanceLabel.setText("Your current balance is: \u20ac" + (double) Math.round(balance * 100)/100);
					}
					else{
						balanceLabel.setText("You do not have enough credit to make a call (\u20ac" + (double) Math.round(balance * 100)/100 + ")");
					}
				}
			});

		JButton textButton = new JButton("Send Text");
			costPanel.add(textButton);
			textButton.setFont(new Font("Courier", Font.BOLD,35));
			textButton.setBackground(Color.cyan);
			textButton.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent e) {
					if(balance - 0.25 > 0){
					balance -= 0.25;
					balanceLabel.setText("Your current balance is: \u20ac" + (double) Math.round(balance * 100)/100);
					}
					else{
						balanceLabel.setText("You do not have enough credit to send a text (\u20ac" + (double) Math.round(balance * 100)/100 + ")");
					}
				}
			});

		JButton topUpButton = new JButton("Top up balance by \u20ac5");
			topUpPanel.add(topUpButton);
			topUpButton.setPreferredSize(new Dimension(250,30));
			topUpButton.setBackground(Color.green);
			topUpButton.setFont(new Font("Comic sans", Font.BOLD,20));
			topUpButton.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent e) {
					balance += 5;
					balanceLabel.setText("Your current balance is: \u20ac" + (double) Math.round(balance * 100)/100);
				}
			});

		contentPane.add(balancePanel,BorderLayout.NORTH);
		contentPane.add(costPanel,BorderLayout.EAST);
		contentPane.add(topUpPanel,BorderLayout.SOUTH);
		contentPane.add(pricesPanel,BorderLayout.WEST);

		setTitle("Mobile Application");
		setSize(500, 300);
		setVisible(true);
   }

}