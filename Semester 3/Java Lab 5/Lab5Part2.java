import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Lab5Part2 extends JFrame implements ActionListener{

	public static void main(String[] args){
		JFrame frame = new Lab5Part2();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

public Lab5Part2(){
		Container contentPane = new Container();
		JPanel panel = new JPanel();
		

		Icon bankIcon = new ImageIcon("images/aib.png");
	
		JLabel bankLogoLabel = new JLabel();
		bankLogoLabel.setIcon(bankIcon);
		bankLogoLabel.setPreferredSize(new Dimension(512,512));
		bankLogoLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(bankLogoLabel);


		JMenuBar mb = new JMenuBar();

		JMenu banksMenu = new JMenu("Banks");
			mb.add(banksMenu);
		
		JMenuItem aibItem = new JMenuItem("Allied Irish Bank");
			banksMenu.add(aibItem);
			aibItem.addActionListener(new ActionListener(){
			
				/*public void actionPerformed(ActionEvent e) {
					bankLogoLabel.setIcon(new ImageIcon("images/aib.png"));
				}*/
			});
		JMenuItem ulsterItem = new JMenuItem("Ulster Bank");
			banksMenu.add(ulsterItem);
		JMenuItem boiItem = new JMenuItem("Bank of Ireland");
			banksMenu.add(boiItem);
			

		//setJMenuBar(mb);

		contentPane.add(panel);

		setTitle("Banks");
		setSize(500, 300);
		setVisible(true);
   }

}