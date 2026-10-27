public class Mage extends Combatant {
    private int mana;

    public Mage(String name, int health, int level, int mana) {
        super(name, health, level);
        this.mana = mana;
    }

    @Override
    public String attack() {
        return getName() + " hurls a fireball!";
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
