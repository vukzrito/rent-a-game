package android.ksigauke.com.rag.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {

    private String name;
    private Date releaseDate;
    private String imageUrl;
    private String[] genres;
    private String description;
    private String[] platforms;
    private boolean isInStore;
    private List<Review> reviews;

    public Game(String name, String[] genres, String[] platforms, String description) {
        this.name = name;
        this.genres = genres;
        this.platforms = platforms;
        this.description = description;

        isInStore = false;
        releaseDate = new Date();
        reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public boolean isInStore() {
        return isInStore;
    }

    public void setInStore(boolean inStore) {
        isInStore = inStore;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

}
