package design.pattern.behavioral.command;

public interface Command extends Comparable<Command> {
    void execute();
}
