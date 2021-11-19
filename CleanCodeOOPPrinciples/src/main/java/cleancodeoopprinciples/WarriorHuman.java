package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public class WarriorHuman extends Human {

    public WarriorHuman(String humanName, Weapon weapon) {
        super(humanName, weapon);
    }

    private void printWeapon(Weapon weapon){
        System.out.println(weapon.getWeaponName());
    }

    @Override
    public void useWeapon() {

        WeaponType type = getWeapon().getType();
        if (type == WeaponType.knife) {
            System.out.println(getWeapon().getWeaponName() + " is used by " + humanName);
        } else if (type == WeaponType.riffle) {
            System.out.println(getWeapon().getWeaponName() + " is used by " + humanName);
        } else if (type == WeaponType.sword) {
            System.out.println(getWeapon().getWeaponName() + "is used by " + humanName);
        } else {
            System.out.println("Unknown weapon!");
        }
    }

    @Override
    public void craftWeapon(WeaponType type) {

    }
}
