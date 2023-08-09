package Ports;


import java.util.List;

import Domain.MovieReview;

/**
 * Порт для подключения принтера. 
 */
public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}