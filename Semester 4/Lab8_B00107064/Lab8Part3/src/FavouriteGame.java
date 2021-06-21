
public class FavouriteGame extends AlbumItem{
	
    String gameGenre;
    double gamePrice;

    public FavouriteGame(String title, String imageSource, String gameGenre, String itemFacts, double gamePrice)
    {
        super(title, imageSource, itemFacts);
        this.gameGenre = gameGenre;
        this.gamePrice = gamePrice;
    }
    
    String getGameGenre() {
    	return this.gameGenre;
    }
    
    double getGamePrice() {
    	return this.gamePrice;
    }
}
