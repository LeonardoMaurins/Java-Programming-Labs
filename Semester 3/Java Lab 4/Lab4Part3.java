import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

class Lab4Part3 extends JFrame implements ListSelectionListener{

	public static void main(String[] args){
		JFrame frame = new Lab4Part3();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   JList<String> sportTeamList;

   String sportTeams[] = {"Man United","Chelsea","Aresenal","Liverpool","Real Madrid"};
   

public Lab4Part3(){
	Container contentPane = getContentPane();
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel listPanel = new JPanel();
		
		JTextArea responseArea = new JTextArea("Response will appear here");
			southPanel.add(responseArea);
			responseArea.setEditable(false);
		JList sportTeamList = new JList<String>(sportTeams);
			listPanel.add(sportTeamList);
			sportTeamList.addListSelectionListener(new ListSelectionListener(){
			
				public void valueChanged(ListSelectionEvent e) {
					Object source = e.getSource();
					if (source == sportTeamList)
					{
						int selectionNum = 0;
						selectionNum = sportTeamList.getSelectedIndex();
						String team = sportTeams[selectionNum];
						responseArea.setText(team);
					}
				}
			});
		JScrollPane pane = new JScrollPane(sportTeamList);
			listPanel.add(pane);
		JLabel favouriteTeamLabel = new JLabel("Please choose your favourite team!");
			northPanel.add(favouriteTeamLabel);

		
		contentPane.add(northPanel,BorderLayout.NORTH);
		contentPane.add(southPanel,BorderLayout.SOUTH);
		contentPane.add(listPanel,BorderLayout.CENTER);
		
		setTitle("Favourite Team");
		setSize(500, 300);
		setVisible(true);
   }


}