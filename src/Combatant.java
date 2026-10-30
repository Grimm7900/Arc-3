
public abstract class Combatant {
    private String name;
    private int health;
    private int level;

    public Combatant(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public abstract String attack();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
}
