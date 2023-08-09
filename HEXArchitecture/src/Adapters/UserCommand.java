package Adapters;

import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;
import Ports.IPrintMovieReviews;
import Ports.IUserInput;

/**
 * Класс, к которому подключают 2 адаптера для создания общей модели. 
 */
public class UserCommand implements IUserInput {
    private Model model;

    /**
    * Метод для объединения 2 адапетеров в одну модель.
    */
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    /**
    * Метод для для начала обработки запросов
    */
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}