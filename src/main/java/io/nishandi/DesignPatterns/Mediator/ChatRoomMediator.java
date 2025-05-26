package main.java.io.nishandi.DesignPatterns.Mediator;

import java.util.List;
import java.util.ArrayList;


public class ChatRoomMediator implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
