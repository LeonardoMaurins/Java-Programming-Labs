import javax.swing.*;
import java.awt.*;

class Lab3Part4 extends JFrame{

	public static void main(String[] args){
		JFrame frame = new Lab3Part4();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

public Lab3Part4(){
	Container contentPane = getContentPane();
	JPanel leftPanel = new JPanel(new GridLayout(3,2,100,150));
	JPanel rightPanel = new JPanel(new GridLayout(3,2,100,150));
	JPanel helpPanel = new JPanel();
	JPanel iconPanel = new JPanel();
	
	leftPanel.setPreferredSize(new Dimension(200,100));
	rightPanel.setPreferredSize(new Dimension(200,100));

	JButton balance = new JButton("Balance");
		leftPanel.add(balance);
		balance.setBackground(Color.green);
		balance.setFont(new Font("Courier", Font.BOLD,20));
	JButton services = new JButton("Services");
		leftPanel.add(services);
		services.setBackground(Color.green);
		services.setFont(new Font("Courier", Font.BOLD,20));
	JButton withdraw = new JButton("Withdraw");
		leftPanel.add(withdraw);
		withdraw.setBackground(Color.green);
		withdraw.setFont(new Font("Courier", Font.BOLD,20));
	JButton enquiry = new JButton("Enquiry");
		rightPanel.add(enquiry);
		enquiry.setBackground(Color.green);
		enquiry.setFont(new Font("Courier", Font.BOLD,20));	
	JButton deposit = new JButton("Deposit");
		rightPanel.add(deposit);
		deposit.setBackground(Color.green);
		deposit.setFont(new Font("Courier", Font.BOLD,20));
	JButton pinChange = new JButton("Pin Change");
		rightPanel.add(pinChange);
		pinChange.setBackground(Color.green);
		pinChange.setFont(new Font("Courier", Font.BOLD,20));
	
	Icon bankIcon = new ImageIcon("bank.png");
	
	JLabel iconLabel = new JLabel();
		iconLabel.setIcon(bankIcon);
		iconLabel.setPreferredSize(new Dimension(512,512));
		iconLabel.setHorizontalAlignment(JLabel.CENTER);
		iconPanel.add(iconLabel);

	JLabel tip = new JLabel("Please select an option below!");
		helpPanel.add(tip);
		tip.setFont(new Font("Courier", Font.BOLD,30));
		tip.setForeground(Color.red);
		tip.setBorder(BorderFactory.createLineBorder(Color.BLACK));

	contentPane.add(iconPanel, BorderLayout.CENTER);
	contentPane.add(rightPanel, BorderLayout.EAST);
	contentPane.add(leftPanel, BorderLayout.WEST);
	contentPane.add(helpPanel, BorderLayout.NORTH);

		setTitle("ATM");
		setSize(1000, 600);
		setVisible(true);
   }

}