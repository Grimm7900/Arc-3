public class Necromancer extends Combatant {
    private int mana;
    private int minions;

    public Necromancer(String name, int health, int level, int mana, int minions) {
        super(name, health, level);
        this.mana = mana;
        this.minions = minions;
    }

    @Override
    public String attack() {
        return getName() + " casts a dark magic spell!";
    }

    public void useMana(int amount) {
        if (amount > 0 && amount <= mana) {
            mana -= amount;
        }
    }

    public void summonMinion() {
        if (mana >= 10) {
            mana -= 10;
            minions++;
        }
    }

    public int getMana() {
        return mana;
    }

    public int getMinions() {
        return minions;
    }
}