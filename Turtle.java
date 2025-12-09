/** 
 * @Author Allison Ly
 * @Collaborator CoPilot
 * @version 2025-12-09
 */
import java.util.Random;

/**
 * Represents a pet turtle with various attributes and behaviors.
 */
public class Turtle {
    /**
     * The health level of the turtle.
     */
    private final int health;

    /**
     * The energy level of the turtle.
     */
    private int energy;

    /**
     * The name of the turtle.
     */
    private final String name;

    /**
     * The happiness level of the turtle.
     */
    private int happiness;

    /**
     * Constructs a new Turtle with the specified attributes.
     *
     * @param health    The health level of the turtle.
     * @param energy    The energy level of the turtle.
     * @param name           The name of the turtle.
     * @param happiness The happiness level of the turtle.
     */
    public Turtle(String name, int health, int energy, int happiness) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /**
     * Simulates the turtle eating. Increases energy and happiness levels.
     *
     * @param food The type of food the turtle is eating.
     */
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        energy += 10; // Use energyLevel
        happiness += 5; // Use happinessLevel
    }

    /**
     * Simulates the turtle sleeping. Restores energy and slightly increases happiness.
     */
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20; // Use energyLevel
        happiness += 2; // Use happinessLevel
    }

    /**
     * Simulates the turtle swimming. Decreases energy but increases happiness.
     * There is a random chance the turtle finds a treasure while swimming.
     */
    public void swim() {
        System.out.println(name + " is swimming.");
        energy -= 10; // Use energyLevel
        happiness += 15; // Use happinessLevel

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name + " found a treasure while swimming!");
            happiness += 10; // Use happinessLevel
        }
    }

    /**
     * Displays the current status of the turtle.
     */
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health Level: " + health); // Use healthLevel
        System.out.println("Energy Level: " + energy); // Use energyLevel
        System.out.println("Happiness Level: " + happiness); // Use happinessLevel
    }
}


