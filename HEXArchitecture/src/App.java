import Adapters.ConsolePrinter;
import Adapters.MovieReviewsRepo;
import Adapters.UserCommand;
import Application.MovieUser;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;
import Ports.IPrintMovieReviews;
import Ports.IUserInput;

public class App {
    public static void main(String[] args) throws Exception {

        /**
        * Создание экземпляра портов fetchMovieReviews и printMovieReviews
        */
        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();

        /**
        * Создание экземпляра порта userCommand, знающего о наличии fetchMovieReviews и printMovieReviews
        * Для взаймодействия портов
        */
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        /**
        * Создание экземпляра класса movieUser для выполнения начальной логики
        */
        MovieUser movieUser = new MovieUser(userCommand);
        
        /**
        * Создание экземпляров классов для создания запросов
        */
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        /**
        * Запуск работы архитектуры
        */
        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

    }
}
