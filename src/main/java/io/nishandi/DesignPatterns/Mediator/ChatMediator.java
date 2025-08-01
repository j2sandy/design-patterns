package main.java.io.nishandi.DesignPatterns.Mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
