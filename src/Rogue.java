public class Rogue extends Combatant {
    // Stores the rogue's available energy
    private int energy;

    // Constructor that sets the rogue's information
    public Rogue(String name, int health, int level, int energy) {
        super(name, health, level); // Passes shared information to Combatant
        this.energy = energy;
    }

    // Overrides the parent's attack method
    @Override
    public String attack() {
        return getName() + " performs a sneak attack!";
    }

    // Uses energy if the requested amount is valid and available
    public void useEnergy(int amount) {
        if (amount > 0 && amount <= energy) {
            energy -= amount;
        }
    }

    // Returns the rogue's current energy
    public int getEnergy() {
        return energy;
    }

    // Converts the rogue's information into a CSV string for saving
    @Override
    public String toCsv() {
        return "Rogue," + getName() + "," + getHealth() + "," + getLevel() + "," + energy;
    }
}