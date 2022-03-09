package design.pattern.behavioral.strategy;

public class Ax implements Weapon {
    @Override
    public void attack() {
        System.out.println("ax attack()");
    }
}
