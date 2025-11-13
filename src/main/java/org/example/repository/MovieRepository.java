package org.example.repository;

import org.example.model.Movie;

import java.util.ArrayList;
import java.util.List;


public class MovieRepository {
    private List<Movie> movies;

    public MovieRepository() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(Long id) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    public boolean deleteMovie(Long id) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                movies.remove(movie);
                return true;
            }
        }
        return false;
    }

    public boolean updateMovie(Long id, Movie movieNew) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                movie.setTitle(movieNew.getTitle());
                movie.setGenre(movieNew.getGenre());
                movie.setYear(movieNew.getYear());
                movie.setRating(movieNew.getRating());
                return true;
            }
        }
        return false;
    }
}

class MovieRepositoryTest {
    public static void main(String[] args) {
        MovieRepository repository = new MovieRepository();

        Movie movie1 = new Movie(1L, "Spider-man", "Драма", 2003, 9.0);
        Movie movie2 = new Movie(2L, "Один дома", "Комедия", 2001, 10.0);

        repository.addMovie(movie1);
        repository.addMovie(movie2);

        System.out.println("Все фильмы:");
        for (Movie movie : repository.getAllMovies()) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}