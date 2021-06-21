import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MyAlbum extends JFrame {

	private static final long serialVersionUID = 1L;
	
	Vector<AlbumItem> albumList = new Vector<AlbumItem>();
	
	public static void main(String[] args) {
		JFrame frame = new MyAlbum();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	int count = 0;
	
	public MyAlbum() {
		
		//String title, String imageSource, String gameGenre, String itemFacts, double gamePrice
		albumList.add(new FavouriteGame("Old School Runescape",
				"src/images/game1.png", 
				"MMO RPG", 
				"Fact 1: The game was released in 2013, Feburary 22nd. \n" +
				"Fact 2: It currently has 100,000 players on average playing daily! \n" +
				"Fact 3: Best game btw.", 
				11));
		
		//String title, String imageSource, String animeGenre, String itemFacts, int MALSubscribers
		albumList.add(new FavouriteAnime("Hunter x Hunter",
				 "src/images/anime1.png", 
				 "Action/Adventure/Fantasy", 
				 "Fact 1: The anime has 148 episodes! \n" +
				 "Fact 2: The show premiered in the Fall of 2011 \n" +
				 "Fact 3: Developed by the studio Madhouse.", 
				 876815));
		
		albumList.add(new FavouriteGame("Counter Strike: Global Offensive",
				"src/images/game2.png", 
				"First Person Shooter", 
				"Fact 1: The game was released in 2012, August 21st. \n" +
				"Fact 2: It currently has 400,000 players on average playing daily! \n" +
				"Fact 3: Trash game hehe.", 
				14.99));
		
		albumList.add(new FavouriteAnime("Steins; Gate",
				 "src/images/anime2.png", 
				 "Thriller/Sci-Fi/Time Travel", 
				 "Fact 1: The anime has 24 episodes! \n" +
				 "Fact 2: The show premiered in the Spring of 2011 \n" +
				 "Fact 3: Developed by the studio Funimation.", 
				 1173960));
		
		albumList.add(new FavouriteGame("Warcraft 3: Reign of Chaos",
				"src/images/game3.png", 
				"Real Time Strategy", 
				"Fact 1: The game was released in 2002, July 3rd. \n" +
				"Fact 2: It is somewhat in fact a dead game! \n" +
				"Fact 3: Developed by Blizzard, so as expected for above!", 
				14.99));
		
		albumList.add(new FavouriteAnime("Toradora!",
				 "src/images/anime3.png", 
				 "Slice of Life/Comedy/Romance", 
				 "Fact 1: The anime has 25 episodes! \n" +
				 "Fact 2: The show premiered in the Fall of 2008\n" +
				 "Fact 3: Developed by the studio J.C. Staff.", 
				 1037370));
		
		Container contentPane = getContentPane();
		
		JPanel albumPanel = new JPanel(new BorderLayout());
		
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		JLabel factLabel = new JLabel(albumList.elementAt(count).getTitle(), SwingConstants.CENTER);
		factLabel.setFont(new Font("ComicSans", Font.BOLD | Font.ITALIC, 30));
		
		JLabel genreLabel = new JLabel("Game Genre: " + albumList.elementAt(count).getGameGenre(), SwingConstants.CENTER);
		genreLabel.setFont(new Font("ComicSans", Font.ITALIC, 20));
		
		JLabel imageLabel = new JLabel(new ImageIcon(albumList.elementAt(count).getImage()));
		
		JLabel numbersLabel = new JLabel("Price: $" + albumList.get(count).getGamePrice(), SwingConstants.CENTER);
		numbersLabel.setFont(new Font("ComicSans", Font.BOLD, 20));
		
		JTextArea factTextArea = new JTextArea(3,20);
		factTextArea.setEditable(false);
		factTextArea.setLineWrap(true);
		factTextArea.setFont(new Font("SansSerif", Font.BOLD, 15));
		factTextArea.setText(albumList.elementAt(count).getFacts());
		
		JButton nextButton = new JButton("Next!");
		
		nextButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(count < albumList.size() - 1) {
					count++;
				}
				else {
					count = 0;
				}
					
				factLabel.setText(albumList.elementAt(count).getTitle());
				
				//Checks what class name the current albumList's element is at before using specific methods from those subclasses
				if(albumList.elementAt(count).getClass().getName() == "FavouriteGame") {
					genreLabel.setText("Game Genre: " + albumList.elementAt(count).getGameGenre());
				}
				else {
					genreLabel.setText("Anime Genre: " + albumList.elementAt(count).getAnimeGenre());
				}	
				
				if(albumList.elementAt(count).getClass().getName() == "FavouriteGame") {
					numbersLabel.setText("Price: $" + albumList.elementAt(count).getGamePrice());
				}
				else {
					numbersLabel.setText("MAL Subscribers: " + albumList.elementAt(count).getMALSubscribers());
				}	
				
				imageLabel.setIcon(new ImageIcon(albumList.elementAt(count).getImage()));
				
				factTextArea.setText(albumList.elementAt(count).getFacts());	
			}
		});
		
		albumPanel.add(genreLabel,BorderLayout.NORTH);
		albumPanel.add(imageLabel,BorderLayout.CENTER);
		albumPanel.add(numbersLabel,BorderLayout.SOUTH);
		
		bottomPanel.add(factTextArea,BorderLayout.NORTH);
		bottomPanel.add(nextButton,BorderLayout.SOUTH);
		
		contentPane.add(factLabel,BorderLayout.NORTH);
		contentPane.add(albumPanel);
		contentPane.add(bottomPanel,BorderLayout.SOUTH);
		
		setSize(500,500);
		setTitle("My Album!");
		setVisible(true);
	}
}
