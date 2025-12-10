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
     * @param energy   The energy level of the turtle.
     * @param name           The name of the turtle.
     * @param happiness The happiness level of the turtle.
     */
    public Turtle(int health, int energy, String name, int happiness) {
        this.health = health;
        this.energy = energy;
        this.name = name;
        this.happiness = happiness;
    }

    /**
     * Simulates the turtle eating. Increases energy and happiness levels.
     */
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        happiness += 5;
    }

    /**
     * Simulates the turtle sleeping. Restores energy and slightly increases happiness.
     */
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20;
        happiness += 2;
    }

    /**
     * Simulates the turtle swimming. Decreases energy but increases happiness.
     * There is a random chance the turtle finds a treasure while swimming.
     */
    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
        energy -= 10;
        happiness += 15;

        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(name + " found a treasure while swimming!");
            happiness += 10;
        }
    }

    /**
     * Simulates the turtle playing. Decreases energy but significantly increases happiness.
     */
    @Override
    public void play() {
        System.out.println(name + " is playing.");
        energy -= 15;
        happiness += 20;
    }


    /**
     * Simulates the turtle hiding in its shell. 
     * This action increases the turtle's energy but decreases its happiness slightly.
     */
    public void hideInShell() {
        System.out.println(name + " is hiding in its shell.");
        energy += 10; // Hiding restores energy
        happiness -= 5; // Hiding reduces happiness slightly
    }
    
    /**
     * Simulates the turtle doing nothing. Prints a message indicating no action is taken.
     */
    @Override
    public void nothing() {
        System.out.println(name + " is doing nothing.");
    }

    /**
     * Gets the turtle's name.
     * @return The name of the turtle.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the turtle's name.
     * @param name The new name of the turtle.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the turtle's health level.
     * @return The health level of the turtle.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the turtle's health level.
     * @param health The new health level of the turtle.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the turtle's energy level.
     * @return The energy level of the turtle.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the turtle's energy level.
     * @param energy The new energy level of the turtle.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Gets the turtle's happiness level.
     * @return The happiness level of the turtle.
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * Sets the turtle's happiness level.
     * @param happiness The new happiness level of the turtle.
     */
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    
    /**
     * Displays the current status of the turtle, including its name, health, energy, and happiness levels.
     */
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health Level: " + health);
        System.out.println("Energy Level: " + energy);
        System.out.println("Happiness Level: " + happiness);
    }
}
