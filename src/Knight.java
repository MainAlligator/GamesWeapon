public class Knight extends Character {

    public static void main(String[] args) {


        Knight knight = new Knight();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.fight();
        knight.setWeaponBehavior(new SwordBehavior());
        knight.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();
        knight.setWeaponBehavior(new BowandArrowBehavior());
        knight.fight();
    }
}
