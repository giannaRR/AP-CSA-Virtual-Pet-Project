/** 
 * @Author Allison Ly
 *  @Collaborator CoPilot
 * @Date 2025-12-09
 */
import java.util.Random;

/**
 * Represents a pet turtle with various attributes and behaviors.
 */
public class Turtle {
    /**
     * The health level of the turtle.
     */
    private final int healthLevel;

    /**
     * The energy level of the turtle.
     */
    private int energyLevel;

    /**
     * The name of the turtle.
     */
    private final String name;

    /**
     * The happiness level of the turtle.
     */
    private int happinessLevel;

    /**
     * Constructs a new Turtle with the specified attributes.
     *
     * @param healthLevel    The health level of the turtle.
     * @param energyLevel    The energy level of the turtle.
     * @param name           The name of the turtle.
     * @param happinessLevel The happiness level of the turtle.
     */
    public turtle(int healthLevel, int energyLevel, String name, int happinessLevel) {
        this.healthLevel = healthLevel;
        this.energyLevel = energyLevel;
        this.name = name;
        this.happinessLevel = happinessLevel;
    }

    /**
     * Simulates the turtle eating. Increases energy and happiness levels.
     *
     * @param food The type of food the turtle is eating.
     */
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        energyLevel += 10; // Use energyLevel
        happinessLevel += 5; // Use happinessLevel
    }

    /**
     * Simulates the turtle sleeping. Restores energy and slightly increases happiness.
     */
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energyLevel += 20; // Use energyLevel
        happinessLevel += 2; // Use happinessLevel
    }

    /**
     * Simulates the turtle swimming. Decreases energy but increases happiness.
     * There is a random chance the turtle finds a treasure while swimming.
     */
    public void swim() {
        System.out.println(name + " is swimming.");
        energyLevel -= 10; // Use energyLevel
        happinessLevel += 15; // Use happinessLevel

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name + " found a treasure while swimming!");
            happinessLevel += 10; // Use happinessLevel
        }
    }

    /**
     * Displays the current status of the turtle.
     */
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health Level: " + healthLevel); // Use healthLevel
        System.out.println("Energy Level: " + energyLevel); // Use energyLevel
        System.out.println("Happiness Level: " + happinessLevel); // Use happinessLevel
    }
}


