package main.java.io.nishandi.DesignPatterns.Command;

public interface Command {
    public void execute();
    public void undo();
    public void redo();
}

