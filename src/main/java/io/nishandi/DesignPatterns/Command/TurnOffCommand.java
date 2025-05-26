package main.java.io.nishandi.DesignPatterns.Command;

public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }

    public void undo() {
        light.turnOn();
    }

    public void redo() {
        light.turnOff();
    }
}
