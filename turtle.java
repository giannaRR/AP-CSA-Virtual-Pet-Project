import java.util.Random;

public class turtle {
    private final int healthLevel;
    private int energyLevel;
    private final String name;
    private int happinessLevel;

    public turtle(int healthLevel, int energyLevel, String name, int happinessLevel) {
        this.healthLevel = healthLevel;
        this.energyLevel = energyLevel;
        this.name = name;
        this.happinessLevel = happinessLevel;
    }

    // Eat behavior
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        energyLevel += 10;
        happinessLevel += 5;
    }

    // Sleep behavior
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energyLevel += 20;
        happinessLevel += 2;
    }

    // Swim behavior with random event
    public void swim() {
        System.out.println(name + " is swimming.");
        energyLevel -= 10;
        happinessLevel += 15;

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name + " found a treasure while swimming!");
            happinessLevel += 10;
        }
    }

    // Hide in shell
    public void hideInShell() {
        System.out.println(name + " is hiding in its shell.");
        energyLevel += 15; // Restores energy
        happinessLevel -= 5; // Slightly reduces happiness
    }

    // Display turtle's current status
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health Level: " + healthLevel);
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Happiness Level: " + happinessLevel);
    }
}
