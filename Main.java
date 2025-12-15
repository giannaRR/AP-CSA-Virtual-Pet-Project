import java.util.Scanner;

/**
 * Main class for the Virtual Pet Simulator.
 */
public class main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Welcome message
        welcome();
        int choice = input.nextInt();
        input.nextLine();
        
        // declare variables for common objects & messages
        Animal pet = null;
        String petType = "";
        String petEmoji = "";
        String deathMessage = "";
        
        // determine pet type, emoji, and death message
        switch (choice){
            case 1:
                petType = "Turtle";
                petEmoji = "🐢";
                deathMessage = "You KILLED your turtle ☹️";
                break; 
            case 2: 
                petType = "Dolphin"; 
                petEmoji = "🐬"; 
                deathMessage = "You KILLED your dolphin 😠"; 
                break; 
            case 3: 
                petType = "Penguin"; 
                petEmoji = "🐧"; 
                deathMessage = "You KILLED your penguin 😠"; 
                break; 
            case 4:
                petType = "Otter"; 
                petEmoji = "🦦"; 
                deathMessage = "You KILLED your otter 😠"; 
                break; 
            default: 
                System.out.println("Invalid choice. Please restart the program and choose a valid option."); 
                return;
        }
        
        // name and instantiate the pet
        System.out.println("\nYou have chosen a " + petType + " " + petEmoji + " !");
        System.out.println("What do you want to name your " + petType.toLowerCase() + "?");
        System.out.print("Enter name: ");
        String petName = input.nextLine();
        
        // initalize the pet object & assign variables
        switch (choice) {
            case 1:
                pet = new Turtle(100, 100, 100, petName);
                break;
            case 2:
                pet = new Dolphin(100, 100, 100, petName);
                break;
            case 3:
                pet = new Penguin(100, 100, 100, petName);
                break;
            case 4:
                pet = new Otter(100, 100, 100, petName);
                break;
        }
        
        // run the game
        while (pet.getHealth() > 20 && pet.getEnergy() > 20 && pet.getHappiness() > 20) {
            petMenu();
            int choiceAction = input.nextInt();
            boolean keepPlaying = animalAction(choiceAction, pet); 
            if (!keepPlaying) {
                break;
            }
        }
        System.out.println(deathMessage);
        System.out.println("Thank you for playing. Goodbye!");
    }
    
    /**
     * Displays the welcome message and pet selection menu
     * at the start of the game.
     */
    public static void welcome(){
        System.out.println("Welcome to the Virtual Pet Simulator!\nYou will get to take care of a marine animal! 🌊 ˖𓇼 ⋆🐚");
        System.out.println("Please adopt a pet turtle, dolphin, penguin, or otter today!!");
        System.out.println("Which pet would you like to choose? (1-4)");
        System.out.println("1. Turtle 🐢");
        System.out.println("2. Dolphin 🐬");
        System.out.println("3. Penguin 🐧");
        System.out.println("4. Otter 🦦");
        System.out.println(" ");
        System.out.print("Enter number: ");
    }

     /**
     * Displays the action menu allowing the user
     * to choose how to interact with their pet.
     */
    public static void petMenu(){
        System.out.println(" ");
        System.out.println("What would you like to do with your pet? Please enter a number");
        System.out.println("1. Eat 🍽️");
        System.out.println("2. Sleep 💤");
        System.out.println("3. Play 🛝");
        System.out.println("4. Swim 🏊️");
        System.out.println("5. Unique Behavior 🎲");
        System.out.println("6. Do Nothing 😐");
        System.out.println("7. Display Status 🔢");
        System.out.println("8. Kill 💀");
         System.out.println(" ");
    }

    /**
     * Executes the selected action on the current pet.
     *
     * @param choiceAction the user's chosen action
     * @param currentPet the pet being interacted with
     * @return true to continue the game, false to end it
     */
    public static boolean animalAction(int choiceAction, Animal currentPet) {
        switch (choiceAction) {
            case 1:
                currentPet.eat();
                break;
            case 2:
                currentPet.sleep();
                break;
            case 3:
                currentPet.play();
                break;
            case 4:
                currentPet.swim();
                break;
            case 5:
                currentPet.uniqueBehavior();
                break;
            case 6:
                currentPet.nothing();
                break;
            case 7:
                currentPet.displayStatus(); 
                break;
            case 8:
                return false; //stop loop
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
        return true; //continue loop
    }
}
