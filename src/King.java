public class King extends Character {

    public static void main(String[] args) {


        King king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
        king.setWeaponBehavior(new BowandArrowBehavior());
        king.fight();
    }
}
