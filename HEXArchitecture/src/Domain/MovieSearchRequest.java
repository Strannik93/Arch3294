package Domain;

/**
 * Запрос. 
 */
public class MovieSearchRequest {
    String request;

    /**
    * Конструктор с искомым именем
    */
    public MovieSearchRequest(String name) {
        this.request = name;
    }

    /**
    * Метод для получения имени в запросе 
    */
    public String getMovieName() {
        return request;
    }
}