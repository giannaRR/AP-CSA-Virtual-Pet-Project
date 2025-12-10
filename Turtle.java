/**
 * @Author Allison Ly
 * @Collaborator CoPilot
<<<<<<< HEAD
 * @version 2025-12-09
=======
 * @Date 2025-12-09
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
 */

import java.util.Random;

/**
 * Represents a pet turtle with various attributes and behaviors.
 */
public class Turtle implements Animal {
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
<<<<<<< HEAD
    public Turtle(String name, int health, int energy, int happiness) {
=======
    public Turtle(int healthLevel, int energyLevel, String name, int happinessLevel) {
        this.healthLevel = healthLevel;
        this.energyLevel = energyLevel;
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /**
     * Simulates the turtle eating. Increases energy and happiness levels.
     */
<<<<<<< HEAD
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
        energy += 10; // Use energyLevel
        happiness += 5; // Use happinessLevel
=======
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        energyLevel += 10;
        happinessLevel += 5;
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
    }

    /**
     * Simulates the turtle sleeping. Restores energy and slightly increases happiness.
     */
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
<<<<<<< HEAD
        energy += 20; // Use energyLevel
        happiness += 2; // Use happinessLevel
=======
        energyLevel += 20;
        happinessLevel += 2;
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
    }

    /**
     * Simulates the turtle swimming. Decreases energy but increases happiness.
     * There is a random chance the turtle finds a treasure while swimming.
     */
    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
<<<<<<< HEAD
        energy -= 10; // Use energyLevel
        happiness += 15; // Use happinessLevel
=======
        energyLevel -= 10;
        happinessLevel += 15;
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name + " found a treasure while swimming!");
<<<<<<< HEAD
            happiness += 10; // Use happinessLevel
=======
            happinessLevel += 10;
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
        }
    }

    /**
     * Simulates the turtle playing. Decreases energy but significantly increases happiness.
     */
    @Override
    public void play() {
        System.out.println(name + " is playing.");
        energyLevel -= 15;
        happinessLevel += 20;
    }

    /**
     * Simulates the turtle hiding in its shell.
     * Increases energy slightly but decreases happiness.
     */
    public void hideInShell() {
        System.out.println(name + " retreats into its shell for safety.");
        energyLevel += 5;
        happinessLevel -= 5;
    }

    /**
     * Simulates the turtle doing nothing. Prints a message indicating no action is taken.
     */
    @Override
    public void nothing() {
        System.out.println(name + " is doing nothing.");
    }

    /**
     * Displays the current status of the turtle, including its name, health, energy, and happiness levels.
     */
    public void displayStatus() {
        System.out.println("Name: " + name);
<<<<<<< HEAD
        System.out.println("Health Level: " + health); // Use healthLevel
        System.out.println("Energy Level: " + energy); // Use energyLevel
        System.out.println("Happiness Level: " + happiness); // Use happinessLevel
=======
        System.out.println("Health Level: " + healthLevel);
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Happiness Level: " + happinessLevel);
>>>>>>> 9f0d222719bccdc133eb766d2110eb17957a2709
    }
}
