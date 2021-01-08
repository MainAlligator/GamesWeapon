public class Troll extends Character {

    public static void main(String[] args) {


        Troll troll = new Troll();
        troll.setWeaponBehavior(new KnifeBehavior());
        troll.fight();
        troll.setWeaponBehavior(new SwordBehavior());
        troll.fight();
        troll.setWeaponBehavior(new AxeBehavior());
        troll.fight();
        troll.setWeaponBehavior(new BowandArrowBehavior());
        troll.fight();
    }
}
