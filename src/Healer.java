public class Healer extends Combatant implements Special {
    // Stores the healer's available mana
    private int mana;

    // Constructor that sets the healer's information
    public Healer(String name, int health, int level, int mana) {
        super(name, health, level); // Passes shared information to Combatant
        this.mana = mana;
    }

    // Overrides the parent's attack method
    @Override
    public String attack() {
        return getName() + " strikes the enemy with holy light!";
    }

    // Implements the Special interface's special move
    @Override
    public String useSpecialMove() {
        return getName() + " casts a powerful healing spell!";
    }

    // Uses mana if the requested amount is valid and available
    public void useMana(int amount) {
        if (amount > 0 && amount <= mana) {
            mana -= amount;
        }
    }

    // Returns the healer's current mana
    public int getMana() {
        return mana;
    }

    // Converts the healer's information into a CSV string for saving
    @Override
    public String toCsv() {
        return "Healer," + getName() + "," + getHealth() + "," + getLevel() + "," + mana;
    }
}