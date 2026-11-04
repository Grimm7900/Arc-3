
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Combatant> party = new ArrayList<>();

        // Create one character from each class
        Warrior Jimmy = new Warrior("Jimmy", 100, 20, 20);
        Mage Timmy = new Mage("Timmy", 70, 20, 20);
        Archer Bob = new Archer("Bob", 100, 20, 20);
        Healer Richard = new Healer("Sarah", 80, 20, 30);
        Necromancer Joe = new Necromancer("Jack", 80, 20, 30, 2);
        Rogue Rick = new Rogue("Alex", 90, 20, 30);

        // Add all six characters to the party
        party.add(Jimmy);
        party.add(Timmy);
        party.add(Bob);
        party.add(Richard);
        party.add(Joe);
        party.add(Rick);

        // Display each character's attack
        for (Combatant c : party) {
            System.out.println(c.attack());
        }

        // Add characters that have special moves
        ArrayList<Special> specialists = new ArrayList<>();

        specialists.add(Timmy);
        specialists.add(Richard);

        // Display special moves
        for (Special s : specialists) {
            System.out.println(s.useSpecialMove());
        }
    }
}
