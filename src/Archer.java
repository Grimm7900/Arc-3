public class Archer extends Combatant {
    private int arrows;

    public Archer(String name, int health, int level, int arrows) {
        super(name, health, level);
        this.arrows = arrows;
    }

    @Override
    public String attack() {
        return getName() + " fires an arrow!";
    }

    public void useArrow() {
        if (arrows > 0) {
            arrows--;
        }
    }

    public int getArrows() {
        return arrows;
    }
}
