package design.pattern.structural.proxy;

public class Proxy implements Subject {
    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void action1() {
        System.out.println("[Proxy] simple task");
    }

    @Override
    public void action2() {
        real.action2();
    }
}
