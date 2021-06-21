
public class FavouriteAnime extends AlbumItem{
	
    String animeGenre;
    int MALSubscribers;

    public FavouriteAnime(String title, String imageSource, String animeGenre, String itemFacts, int MALSubscribers)
    {
        super(title, imageSource, itemFacts);
        this.animeGenre = animeGenre;
        this.MALSubscribers = MALSubscribers;
    }
    
    String getAnimeGenre() {
    	return this.animeGenre;
    }
    
    int getMALSubscribers() {
    	return this.MALSubscribers;
    }
}
