package Adapters;



import java.util.*;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;

/**
 * Класс для подключения репозитория. 
 */
public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    /**
    * Конструктор с вызовом приватного метода
    */
    public MovieReviewsRepo() {
        initialize();
    }

    /**
    * Метод, возвращающий список фильмов, собранных по запросам
    */
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    /**
    * Метод, подключающий репозитории
    */
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}