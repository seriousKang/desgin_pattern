package design.pattern.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        WeaponUser weaponUser = new WeaponUser();
        weaponUser.attack();

        weaponUser.setWeapon(new Knife());
        weaponUser.attack();

        weaponUser.setWeapon(new Sword());
        weaponUser.attack();

        weaponUser.setWeapon(new Ax());
        weaponUser.attack();
    }
}
