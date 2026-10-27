public static void main(String[] args) {
    ArrayList<Combatant> party = new ArrayList<>();
    Warrior Aragorn = new Warrior("Aragorn", 100, 20, 20);
    Mage Gandalf = new Mage("Gandalf", 70, 20, 20);
    Archer Legolas = new Archer("Legolas", 100, 20, 20);

    party.add(Aragorn);
    party.add(Gandalf);
    party.add(Legolas);

    for (Combatant c : party) {
        System.out.println(c.attack());
    }
}