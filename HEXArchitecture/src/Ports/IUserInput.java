package Ports;

/**
 * Порт для приема запроса пользователя. 
 */
public interface IUserInput {
    public void handleUserInput(Object userCommand);
}
