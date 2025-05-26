package main.java.io.nishandi.DesignPatterns.Command;

public class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }

    public void undo() {
        light.turnOff();
    }

    public void redo() {
        light.turnOn();
    }
}
