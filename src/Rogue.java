public class Rogue extends Combatant {
    private int energy;

    public Rogue(String name, int health, int level, int energy) {
        super(name, health, level);
        this.energy = energy;
    }

    @Override
    public String attack() {
        return getName() + " performs a sneak attack!";
    }

    public void useEnergy(int amount) {
        if (amount > 0 && amount <= energy) {
            energy -= amount;
        }
    }

    public int getEnergy() {
        return energy;
    }
}