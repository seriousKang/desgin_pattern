package design.pattern.structural.proxy;

public class RealSubject implements Subject {
    @Override
    public void action1() {
        System.out.println("[RealSubject] simple task");
    }

    @Override
    public void action2() {
        System.out.println("[RealSubject] complex task");
    }
}
