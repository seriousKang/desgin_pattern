package design.pattern.behavioral.command;

public class StringPrintCommand implements Command {
    private String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println("string = " + string);
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand other = (StringPrintCommand) o;
        return this.string.length() - other.string.length();
    }
}
