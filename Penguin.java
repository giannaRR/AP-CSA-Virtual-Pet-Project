public class Penguin implements Animal {
    // Instance variables
    private int health;
    private int energy;
    private int happiness;
    private String name;

    // Constructor
    public Penguin(String name, int health, int energy, int happiness) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    // Behaviors
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        health += 5;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20;
        happiness += 5;
    }

    public void play() {
        System.out.println(name + " is playing.");
        energy -= 15;
        happiness += 20;
    }

    public void swim() {
        System.out.println(name + " is swimming.");
        energy -= 10;
        happiness += 10;
    }

    public void nothing() {
        System.out.println(name + " is doing nothing...");
        energy += 5; // Energy regenerates slowly
    }

    // Unique behavior
    public void waddleAway() {
        System.out.println(name + " is waddling away!");
        energy -= 5;
        happiness += 15;
    }

    // Method to display the current state of the animal
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
    }
}

