package android.ksigauke.com.rag.model;

public class Review {

    private String reviewerName;
    private String photoUrl;
    private int rating;
    private String comment;

    public Review(String reviewerName, String comment,int rating){
        this.reviewerName = reviewerName;
        this.comment = comment;
        this.rating = rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
