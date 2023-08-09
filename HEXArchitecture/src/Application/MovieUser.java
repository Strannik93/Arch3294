package Application;

import Domain.MovieSearchRequest;
import Ports.IUserInput;

/**
 * Класс, имеющий одну переменную для подключения пользователя и метод передачи запроса адаптеру
 */
public class MovieUser {
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}