public class Healer extends Combatant {
    private int mana;

    public Healer(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " strikes the enemy with holy light!";
    }

    public void useMana(int amount) {
        if (amount > 0 && amount <= mana) {
            mana -= amount;
        }
    }

    public int getMana() {
        return mana;
    }
}