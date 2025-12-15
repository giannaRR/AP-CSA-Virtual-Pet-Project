/**
 * The dolphin class represents a dolphin with attributes for health, energy,
 * happiness, and name. It implements the animal interface to define behaviors
 * such as eating, sleeping, swimming, playing, and doing nothing
 * 
 * @author Elena Koleva
 * @version 12/12/25
 * @collaborator Copilot
 */
public class Dolphin implements Animal {
    // Attributes of the Dolphin
    private int health;
    private int energy;
    private int happiness;
    private String name;

    /**
     * Constructor for the dolphin class.
     * 
     * @param healthLevel    initial health level of the dolphin
     * @param energyLevel    initial energy level of the dolphin
     * @param happinessLevel initial happiness level of the dolphin
     * @param dolphinName    name of the dolphin
     */
    public Dolphin(int health, int energy, int happiness, String name) {
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
    public Dolphin(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }
    
    
    /**
     * Dolphin swims, decreasing energy and increasing happiness
     */
    public void swim() {
        System.out.println(name + " is swimming!");
        energy -= 10;
        happiness += 5;
    }

    /**
     * Dolphin eats, increasing energy and health
     */
    public void eat() {
        System.out.println(name + " is eating!");
        energy += 20;
        health += 10;
    }

    /**
     * Dolphin plays, decreasing energy and increasing happiness
     */
    public void play() {
        System.out.println(name + " is playing!");
        energy -= 15;
        happiness += 10;
    }

    /**
     * Dolphin sleeps, restoring energy and slightly increasing health
     */
    public void sleep() {
        System.out.println(name + " is sleeping!");
        energy += 30;
        health += 5;
    }

    /**
     * Dolphin does nothing, no changes to attributes
     */
    public void nothing() {
        System.out.println(name + " is doing nothing.");
    }

    /**
     * Dolphin does a flip, increasing happiness but with a chance of injury
     */
    public void uniqueBehavior() {
        System.out.println(name + " is doing a flip!");
        happiness += 15;
        energy -= 20;

        int random = (int)(Math.random()*(10-1+1)+1);
        if (random == 1) { // 10% chance to get injured
            System.out.println(name + " got injured while doing a flip!");
            health -= 20;
        }
    }
    
    
    /**
     * Displays the current status of the dolphin
     */
    public void displayStatus() {
        System.out.println("Dolphin Name: " + name);
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
