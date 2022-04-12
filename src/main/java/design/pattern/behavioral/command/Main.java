package design.pattern.behavioral.command;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("abcd"));
        queue.add(new StringPrintCommand("a"));
        queue.add(new StringPrintCommand("abc"));
        queue.add(new StringPrintCommand("ab"));

        for(Command command: queue) {
            command.execute();
        }
    }
}
