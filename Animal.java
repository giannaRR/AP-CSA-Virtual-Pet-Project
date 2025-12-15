/**
 * @author Kayla To
 * @version 12/15/25
 * Represents a generic Animal with basic behaviors and status attributes.
 * Classes that implement this interface define how the animal behaves
 */
public interface Animal {
    public void eat();
    public void sleep();
    public void swim();
    public void play();
    public void nothing();
    public void uniqueBehavior();
    public int getHealth();
    public int getEnergy();
    public int getHappiness();
    public void displayStatus();
}


