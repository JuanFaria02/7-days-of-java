package model.entities;


public class Movie implements Content, Comparable<Content> {
    private String title;
    private String urlImage;
    private String rating;
    private String year;

    public Movie() {
    }

    public Movie(String title, String urlImage, String rating, String year) {
        this.title = title;
        this.urlImage = urlImage;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "title: " + title  +
                ", urlImage: " + urlImage +
                ", rating: " + rating +
                ", year :" + year +
                '}';
    }

    @Override
    public int compareTo(Content other) {
        return this.getTitle().compareTo(other.getTitle());
    }

}
