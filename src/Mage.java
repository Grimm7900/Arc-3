
public class Mage extends Combatant implements Special {
    private int mana;

    public Mage(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " hurls a fireball!";
    }

    @Override
    public String useSpecialMove() {
        return getName() + " summons a powerful lightning storm!";
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
