/**
 * @@Author: Elena Koleva
 * @Date: 12-09-2025
 * @Collaborator: Copilot
 */

import java.util.Random;

/**
 * The dolphin class represents a dolphin with attributes for health, energy,
 * happiness, and name. It implements the animal interface to define behaviors
 * such as eating, sleeping, swimming, playing, and doing nothing
 */

public class Dolphin implements Animal {
    // instance variables
    // health level of the dolphin
    private int health;
    // level of the dolphin's energy
    private int energy;
    // level of the dolphin's happiness
    private int happiness;
    // name of the dolphin
    private String name;

    /**
     * Constructor for the dolphin class.
     * 
     * @param healthLevel    initial health level of the dolphin
     * @param energyLevel    initial energy level of the dolphin
     * @param happinessLevel initial happiness level of the dolphin
     * @param dolphinName    name of the dolphin
     */
    public dolphin(int health, int energy, int happiness, String name) {
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
        this.name = name;
    }

    // getters and setters

    /**
     * gets the health level of the dolphin.
     * 
     * @return current health level.
     */
    public int getHealth() {
        return health;
    }

    /**
     * sets the health level of the dolphin.
     * 
     * @param health new health level.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * gets the energy level of the dolphin.
     * 
     * @return current energy level.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * sets the energy level of the dolphin.
     * 
     * @param energy new energy level.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * gets the happiness level of the dolphin.
     * 
     * @return current happiness level.
     */
    public int getHappiness() {
        return happiness;
    }

    /**
     * sets the happiness level of the dolphin.
     * 
     * @param happiness new happiness level.
     */
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    /**
     * gets the name of the dolphin.
     * 
     * @return dolphin's name.
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name of the dolphin.
     * 
     * @param name new name for the dolphin.
     */
    public void setName(String name) {
        this.name = name;
    }

    // methods

    /**
     * dolphin swims, decreasing energy and increasing happiness
     */
    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
        energy -= 10;
        happiness += 5;
    }

    /**
     * dolphin eats, increasing energy and health
     */
    @Override
    public void eat() {
        System.out.println(name + " is eating!");
        energy += 20;
        health += 10;
    }

    /**
     * dolphin plays, decreasing energy and increasing happiness
     */
    @Override
    public void play() {
        System.out.println(name + " is playing!");
        energy -= 15;
        happiness += 10;
    }

    /**
     * dolphin sleeps, restoring energy and slightly increasing health
     */
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping!");
        energy += 30;
        health += 5;
    }

    /**
     * dolphin does nothing, no changes to attributes
     */
    @Override
    public void nothing() {
        System.out.println(name + " is doing nothing.");
    }

    /**
     * dolphin makes a sound
     */
    public void makeSound() {
        System.out.println(name + " says: Click-click!");
    }

    /**
     * dolphin does a flip, increasing happiness but with a chance of injury
     */
    public void doFlip() {
        System.out.println(name + " is doing a flip!");
        happiness += 15;
        energy -= 20;

        Random random = new Random();
        if (random.nextInt(100) < 10) { // 10% chance to get injured
            System.out.println(name + " got injured while doing a flip!");
            health -= 20;
        }
    }

    /**
     * displays the current status of the dolphin
     */
    public void displayStatus() {
        System.out.println("Dolphin Name: " + name);
        System.out.println("Health Level: " + health);
        System.out.println("Energy Level: " + energy);
        System.out.println("Happiness Level: " + happiness);
    }
}

