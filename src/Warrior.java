public class Warrior extends Combatant {

    private int defense;


    public Warrior(String name, int health, int level, int defense) {
        super(name, health, level);
        this.defense = defense;
    }

    @Override
    public String attack() {
        return getName() + " slams down their sword!";
    }
}