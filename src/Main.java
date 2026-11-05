
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


        System.out.println(System.getProperty("user.dir"));

        try {
            FileWriter writer = new FileWriter("save.txt");
            for (Combatant c : party) {
                writer.write(c.toCsv() + "\n"); // one object per line
            }
            writer.close(); // CRITICAL — flushes and releases the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

// Reads the save file and rebuilds the party
public static void ReadFile() {

    // Creates a new party to hold the loaded characters
    ArrayList<Combatant> party = new ArrayList<>();

    try {
        // Opens the save file
        Scanner fileScanner = new Scanner(new File("save.txt"));

        // Reads the file one line at a time
        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();

            // Splits the line into individual pieces
            String[] split = line.split(",");

            // Gets the character type and shared information
            String type = split[0];
            String name = split[1];
            int health = Integer.parseInt(split[2]);
            int level = Integer.parseInt(split[3]);

            // Rebuilds the correct character based on its type
            if (type.equals("Warrior")) {

                int defense = Integer.parseInt(split[4]);

                party.add(new Warrior(name, health, level, defense));

            } else if (type.equals("Mage")) {

                int mana = Integer.parseInt(split[4]);

                party.add(new Mage(name, health, level, mana));

            } else if (type.equals("Archer")) {

                int arrows = Integer.parseInt(split[4]);

                party.add(new Archer(name, health, level, arrows));

            } else if (type.equals("Healer")) {

                int mana = Integer.parseInt(split[4]);

                party.add(new Healer(name, health, level, mana));

            } else if (type.equals("Necromancer")) {

                int mana = Integer.parseInt(split[4]);
                int minions = Integer.parseInt(split[5]);

                party.add(new Necromancer(name, health, level, mana, minions));

            } else if (type.equals("Rogue")) {

                int energy = Integer.parseInt(split[4]);

                party.add(new Rogue(name, health, level, energy));
            }
        }

        // Closes the scanner after reading the file
        fileScanner.close();

        // Displays all characters that were loaded
        for (Combatant c : party) {
            System.out.println(c.attack());
        }

        System.out.println("Party successfully loaded!");

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}