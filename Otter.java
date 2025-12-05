public class Otter implements Animal {
    private int health;
    private int energy;
    private int happiness;
    private String name;

    public Otter(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        energy += 10;
        health += 5;
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy += 20;
        happiness += 5;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
        energy -= 15;
        happiness += 20;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
        energy -= 10;
        happiness += 10;
    }

    @Override
    public void nothing() {
        System.out.println(name + " is doing nothing...");
        // maybe energy slowly regenerates
        energy += 2;
    }
}
