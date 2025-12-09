/**
 * @Author Allison Ly
 * @Collaborator CoPilot
 * @Date 2025-12-09
 */

import java.util.Random;

/**
 * Represents a pet turtle with various attributes and behaviors.
 */
public class Turtle implements Animal {
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
    public Turtle(int healthLevel, int energyLevel, String name, int happinessLevel) {
        this.healthLevel = healthLevel;
        this.energyLevel = energyLevel;
        this.name = name;
        this.happinessLevel = happinessLevel;
    }

    /**
     * Simulates the turtle eating. Increases energy and happiness levels.
     */
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        energyLevel += 10;
        happinessLevel += 5;
    }

    /**
     * Simulates the turtle sleeping. Restores energy and slightly increases happiness.
     */
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energyLevel += 20;
        happinessLevel += 2;
    }

    /**
     * Simulates the turtle swimming. Decreases energy but increases happiness.
     * There is a random chance the turtle finds a treasure while swimming.
     */
    @Override
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
        System.out.println("Health Level: " + healthLevel);
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Happiness Level: " + happinessLevel);
    }
}
