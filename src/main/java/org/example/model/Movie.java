package org.example.model;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int year;
    private double rating;

    Movie() {
    }

    public Movie(Long id1, String title1, String genre1, int year1, double rating1) {
        id = id1;
        title = title1;
        genre = genre1;
        year = year1;
        rating = rating1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
