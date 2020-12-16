import java.util.Random;

public class Character
{
    private String name;
    private String type;
    private int strength;
    private int toughness;
    private int intelligence;
    private int magic;
    private int influence;
    Random randomGenerator = new Random();

    //Creating new character
    public Character(String name, String type, int stat) {
        this.name = name;
        this.type = type;
        if (stat > 10) {
            stat = 10;
        } else if (stat < 7) {
            stat = 7;
        }
        if (type.equals("Knight")) {
            typeCreator(stat);
            this.strength = stat;
        }
        if (type.equals("Peasant")) {
            typeCreator(stat);
            this.toughness = stat;
        }
        if (type.equals("Cleric")) {
            typeCreator(stat);
            this.intelligence = stat;
        }
        if (type.equals("Mage")) {
            typeCreator(stat);
            this.magic = stat;
        }
        if (type.equals("Courtier")) {
            typeCreator(stat);
            this.influence = stat;
        }
    }

    public void typeCreator(int stat) {
        int total = 0;
        while (total > (28 - stat) || total < (8 - stat)) {
            this.strength = randomGenerator.nextInt(6);
            this.toughness = randomGenerator.nextInt(6);
            this.intelligence = randomGenerator.nextInt(6);
            this.magic = randomGenerator.nextInt(6);
            this.influence = randomGenerator.nextInt(6);
            total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
        }
    }

    //Loading existing Character
    public Character(String name, String type, int strength, int toughness, int intelligence, int magic, int influence) {
        this.name = name;
        this.type = type;
        this.strength = strength; 
        this.toughness = toughness; 
        this.intelligence = intelligence;
        this.magic = magic; 
        this.influence = influence;
    }

    public String toString() {
        return this.name + "," + this.type + "," + this.strength + "," 
        + this.toughness + "," + this.intelligence + "," + this.magic + ","
        + this.influence;
    }

}