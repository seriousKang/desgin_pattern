package design.pattern.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class SimpleMain {
    public static void main(String[] args) {
        List<SimpleCommand> queue = new LinkedList<>();
        queue.add(new SimpleCommand() {
            @Override
            public void execute() {
                System.out.println("task 1");
            }
        });

        queue.add(new SimpleCommand() {
            @Override
            public void execute() {
                System.out.println("task 2");
            }
        });

        queue.add(new SimpleCommand() {
            @Override
            public void execute() {
                System.out.println("task 3");
            }
        });

        for(SimpleCommand command: queue) {
            command.execute();
        }
    }
}
