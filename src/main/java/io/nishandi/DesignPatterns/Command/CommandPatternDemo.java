package main.java.io.nishandi.DesignPatterns.Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command onCommand = new TurnOnCommand(light);
        Command offCommand = new TurnOffCommand(light);

        CommandManager cm = new CommandManager();

        cm.executeCommand(onCommand);   // Light is ON
        cm.executeCommand(offCommand);  // Light is OFF

        cm.undo();  // Light is ON
        cm.undo();  // Light is OFF

        cm.redo();  // Light is ON
        cm.redo();  // Light is OFF
    }
}
