abstract class Character {

    WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }
    public void fight (){

        weapon.useWeapon();
    }
}
