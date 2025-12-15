/**
 * The Otter class represents a virtual pet otter with attributes for health,
 * energy, and happiness. It provides methods to simulate various actions
 * the otter can perform, such as eating, sleeping, playing, swimming, and doing nothing.
 * 
 * @author Kayla To
 * @collaborators Copilot
 * @version 12/11/25
 */
public class Otter implements Animal {
    // Attributes of the Otter
    private int health;
    private int energy;
    private int happiness;
    private String name;
    
    /**
     * Constructs a new Otter object with the specified name, health, energy, and happiness.
     *
     * @param name      name of the penguin.
     * @param health    initial health level of the penguin.
     * @param energy    initial energy level of the penguin.
     * @param happiness initial happiness level of the penguin.
     */
    public Otter(int health, int energy, int happiness, String name) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
        this.name = name;
    }

    /**
     * Constructs an Otter with the given name and initializes its attributes.
     * 
     * @param name The name of the otter.
     */
    public Otter(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }


    /**
     * Makes the otter eat, increasing energy and health.
     */
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        health += 5;
    }

    /**
     * Makes the otter sleep, increasing energy and happiness.
     */
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20;
        happiness += 5;
    }

    /**
     * Makes the otter play, increasing happiness but decreasing energy.
     */
    public void play() {
        System.out.println(name + " is playing.");
        energy -= 15;
        happiness += 20;
    }

    /**
     * Makes the otter swim, with a chance of finding a friend or getting injured.
     */
    public void swim() {
        System.out.println(name + " is swimming.");
        int random = (int)(Math.random() * (2-1+1) + 1);
        if (random == 0){
            System.out.println(name + " found a friend while swimming!");
            happiness += 15;
        }
        if (random == 1){
            System.out.println(name + " injured itself while swimming.");
            health -= 15;
            happiness -= 10;
        }
    }

    /**
     * Makes the otter do nothing, slightly decreasing energy.
     */
    public void nothing() {
        System.out.println(name + " is doing nothing...");
        energy -= 2;
    }

    /**
     * Makes the otter hangout with family, increasing happiness but decreasing energy.
     */
    public void uniqueBehavior() {
        System.out.println(name + " is spending time with family.");
        happiness += 15;
        energy -= 5;
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
    
    /**
     * Returns the health of the turtle.
     */
    public int getHealth() {
        return health;
    }
    
    /**
     * Returns the energy of the turtle.
     */
    public int getEnergy() {
        return energy;
    }
    
    /**
     * Returns the happiness of the turtle.
     */
    public int getHappiness() {
        return happiness;
    }

}
