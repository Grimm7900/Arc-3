public class Necromancer extends Combatant {
    // Stores the necromancer's mana and number of minions
    private int mana;
    private int minions;

    // Constructor that sets the necromancer's information
    public Necromancer(String name, int health, int level, int mana, int minions) {
        super(name, health, level); // Passes shared information to Combatant
        this.mana = mana;
        this.minions = minions;
    }

    // Overrides the parent's attack method
    @Override
    public String attack() {
        return getName() + " casts a dark magic spell!";
    }

    // Uses mana if the requested amount is valid and available
    public void useMana(int amount) {
        if (amount > 0 && amount <= mana) {
            mana -= amount;
        }
    }

    // Summons a minion if the necromancer has at least 10 mana
    public void summonMinion() {
        if (mana >= 10) {
            mana -= 10;
            minions++;
        }
    }

    // Returns the necromancer's current mana
    public int getMana() {
        return mana;
    }

    // Returns the current number of minions
    public int getMinions() {
        return minions;
    }

    // Converts the necromancer's information into a CSV string for saving
    @Override
    public String toCsv() {
        return "Necromancer," + getName() + "," + getHealth() + "," + getLevel() + "," + mana + "," + minions;
    }
}