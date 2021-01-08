public class Queen extends Character {
    public static void main(String[] args) {


        Queen queen = new Queen();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.fight();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.fight();
        queen.setWeaponBehavior(new BowandArrowBehavior());
        queen.fight();
    }
}
