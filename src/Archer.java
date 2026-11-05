public class Archer extends Combatant {
    // Stores how many arrows the archer has available
    private int arrows;

    // Constructor that sets the archer's information
    public Archer(String name, int health, int level, int arrows) {
        super(name, health, level); // Passes shared information to Combatant
        this.arrows = arrows;
    }

    // Overrides the parent's attack method
    @Override
    public String attack() {
        return getName() + " fires an arrow!";
    }

    // Uses one arrow if any are available
    public void useArrow() {
        if (arrows > 0) {
            arrows--;
        }
    }

    // Returns the current number of arrows
    public int getArrows() {
        return arrows;
    }

    // Converts the archer's information into a CSV string for saving
    @Override
    public String toCsv() {
        return "Archer," + getName() + "," + getHealth() + "," + getLevel() + "," + arrows;
    }
}