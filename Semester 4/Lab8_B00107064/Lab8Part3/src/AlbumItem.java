
public abstract class AlbumItem {

	String title;
	String imageSource;
	String itemFacts;
	
	public AlbumItem(String title, String imageSource, String itemFacts) {
		this.title = title;
		this.imageSource = imageSource;
		this.itemFacts = itemFacts;
	}
	
    String getTitle() {
    	return this.title;
    }
	
    String getImage(){ 
    	return this.imageSource; 
    }
    
    String getFacts() {
    	return this.itemFacts;
    }
    
    String getGameGenre() {
    	return null;
    }
    
    double getGamePrice(){
    	return 0;
    }
    
    String getAnimeGenre(){
    	return null;
    }
    
    int getMALSubscribers(){
    	return 0;
    }
}
