// Abstract parent class shared by all combatant subclasses
public abstract class Combatant {
    // Shared information that every combatant has
    private String name;
    private int health;
    private int level;

    // Constructor that initializes the shared combatant information
    public Combatant(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    // Requires every subclass to create its own attack method
    public abstract String attack();

    // Requires every subclass to create its own CSV saving method
    public abstract String toCsv();

    // Returns the combatant's name
    public String getName() {
        return name;
    }

    // Returns the combatant's health
    public int getHealth() {
        return health;
    }

    // Returns the combatant's level
    public int getLevel() {
        return level;
    }
}