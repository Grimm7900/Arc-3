public class Mage extends Combatant implements Special {
    // Stores the mage's available mana
    private int mana;

    // Constructor that sets the mage's information
    public Mage(String name, int health, int level, int mana) {
        super(name, health, level); // Passes shared information to Combatant
        this.mana = mana;
    }

    // Overrides the parent's attack method
    @Override
    public String attack() {
        return getName() + " hurls a fireball!";
    }

    // Implements the Special interface's special move
    @Override
    public String useSpecialMove() {
        return getName() + " summons a powerful lightning storm!";
    }

    // Uses mana if the requested amount is valid and available
    public void useMana(int amount) {
        if (amount > 0 && amount <= mana) {
            mana -= amount;
        }
    }

    // Returns the mage's current mana
    public int getMana() {
        return mana;
    }

    // Converts the mage's information into a CSV string for saving
    @Override
    public String toCsv() {
        return "Mage," + getName() + "," + getHealth() + "," + getLevel() + "," + mana;
    }
}