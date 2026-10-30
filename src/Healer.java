
public class Healer extends Combatant implements Special {
    private int mana;

    public Healer(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " strikes the enemy with holy light!";
    }

    @Override
    public String useSpecialMove() {
        return getName() + " casts a powerful healing spell!";
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
