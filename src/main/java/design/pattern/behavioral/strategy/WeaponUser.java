package design.pattern.behavioral.strategy;

public class WeaponUser {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("hand attack()");
        } else {
            weapon.attack();
        }
    }
}
