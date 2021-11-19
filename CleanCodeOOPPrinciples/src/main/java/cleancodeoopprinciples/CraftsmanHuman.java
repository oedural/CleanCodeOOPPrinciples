package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

import java.util.ArrayList;

public class CraftsmanHuman extends Human {

    private int type;

    public CraftsmanHuman(String humanName) {
        super(humanName, null);
    }

    @Override
    public void useWeapon() {

    }

    @Override
    public void craftWeapon(WeaponType type) {

        String weaponName = "undefined";

        if (type == WeaponType.knife) {
            weaponName = "knife";
        } else if (type == WeaponType.riffle) {
            weaponName = "riffle";
        } else if (type == WeaponType.sword) {
            weaponName = "sword";
        }

        weapon = new Weapon(weaponName, type);
        System.out.println(weaponName + " is created by " + getHumanName());
    }
}
