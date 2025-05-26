package main.java.io.nishandi.DesignPatterns.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoomMediator();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone!");
    }
}

