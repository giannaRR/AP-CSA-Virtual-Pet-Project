/**
 * The Penguin class represents a penguin with specific attributes and behaviors.
 * It implements the Animal interface and provides methods for various actions
 * such as eating, sleeping, and playing.
 * @author Gianna Rodriguez
 * @Collaborators: Copilot
 * @version 12/8/2025
 */
public class Penguin implements Animal {
    // Instance variables
    private int health;   
    private int energy;  
    private int happiness; 
    private String name; 
    
    /**
     * Constructs a new Penguin object with the specified name, health, energy, and happiness.
     *
     * @param name      name of the penguin.
     * @param health    initial health level of the penguin.
     * @param energy    initial energy level of the penguin.
     * @param happiness initial happiness level of the penguin.
     */
    public Penguin(String name, int health, int energy, int happiness) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /**
     * Simulates the penguin eating. Increases energy and health.
     */
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        health += 5;
    }

    /**
     * Simulates the penguin sleeping. Increases energy.
     */
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 10;
    }

    /**
     * Simulates the penguin playing. Decreases energy but increases happiness.
     */
    public void play() {
        System.out.println(name + " is playing.");
        energy -= 10;
        happiness += 5;
    }

    /**
     * Simulates the penguin swimming. Decreases energy but increases happiness.
     */
    public void swim() {
        System.out.println(name + " is swimming.");
        energy -= 5;
        happiness += 10;
    }

    /**
     * Simulates the penguin doing nothing. Slightly increases energy.
     */
    public void nothing() {
        System.out.println(name + " is doing nothing...");
        happiness -= 5;
    }

    /**
     * Simulates the penguin waddling away. Decreases energy but increases happiness.
     */
    public void waddleAway() {
        System.out.println(name + " is waddling away!");
        energy -= 5;
        happiness += 10;
    }

    /**
     * Displays the current status of the penguin, including its name, health, energy, and happiness.
     */
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
    }
}
