public class GameSimulator extends Character {
    public static void main(String[] args) {
        Character king = new King("Король");
        Character knight = new Knight("Рыцарь");
        Character queen = new Queen("Королева");
        Character troll = new Troll("Тролль");


        knight.setWeapon(new SwordBehavior());
        knight.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
        queen.setWeapon( new BowandArrowBehavior());
        queen.fight();
        troll.setWeapon(new KnifeBehavior());
        troll.fight();
    }
}

