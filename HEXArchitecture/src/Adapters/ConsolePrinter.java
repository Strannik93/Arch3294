package Adapters;


import java.util.List;

import Domain.MovieReview;
import Ports.IPrintMovieReviews;

/**
 * Создание принтера с единтсенным методом вывода на экран. 
 */
public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
