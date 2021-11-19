package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public class ClearOOPAndPrinciples {

    public static void main(String[] args) {

        CraftsmanHuman craftsmanHuman = new CraftsmanHuman("Craftsman");

        craftsmanHuman.craftWeapon(WeaponType.riffle);

        Weapon weapon = craftsmanHuman.getWeapon();

        WarriorHuman warriorHuman = new WarriorHuman("Warrior", weapon);

        warriorHuman.useWeapon();
    }

}
