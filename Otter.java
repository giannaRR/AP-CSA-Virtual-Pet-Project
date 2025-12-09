import java.util.Random;

/**
 * The Otter class represents a virtual pet otter with attributes for health,
 * energy, and happiness. It provides methods to simulate various actions
 * the otter can perform, such as eating, sleeping, playing, swimming, and doing nothing.
 * 
 * @author Kayla To
 * @collaborators Copilot
 * @version 12/8/25
 */
public class Otter implements Animal {
    private int health;
    private int energy;
    private int happiness;
    private String name;

    /**
     * Makes the otter eat, increasing energy and health.
     */
    public Otter(String name, int health, int energy, int happiness) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }

    /**
     * Makes the otter hangout with family, increasing happiness but decreasing energy.
     */
    public void familyTime() {
        System.out.println(name + " is spending time with family.");
        happiness += 15;
        energy -= 5;
    }

    /**
     * Makes the otter eat, increasing energy and health.
     */
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        health += 5;
    }

    /**
     * Makes the otter sleep, increasing energy and happiness.
     */
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20;
        happiness += 5;
    }

    /**
     * Makes the otter play, increasing happiness but decreasing energy.
     */
    @Override
    public void play() {
        System.out.println(name + " is playing.");
        energy -= 15;
        happiness += 20;
    }

    /**
     * Makes the otter swim, with a chance of finding a friend or getting injured.
     */
    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
        Random rand = new Random();
        int n = rand.nextInt(2); 
        if (n == 0){
            System.out.println(name + " found a friend while swimming!");
            happiness += 15;
        }
        if (n == 1){
            System.out.println(name + " injured itself while swimming.");
            health -= 15;
            happiness -= 10;
        }
    }

    /**
     * Makes the otter do nothing, slightly decreasing energy.
     */
    @Override
    public void nothing() {
        System.out.println(name + " is doing nothing...");
        energy -= 2;
    }
}
}
>>>>>>> e3d600ec5b22c1017c473d225b1bc042b17e77a8

