package Domain;

import Application.MovieApp;

/**
 * Класс модели, являющейся центром бизнес логики. 
 */
public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    /**
    * Метод для передачи запросов. 
    */
    public void Run(MovieSearchRequest userCommand)
    {
        movieApp.accept(userCommand);
    }
}