import java.util.Scanner;

/**
 * Main class for the Virtual Pet Simulator.
 */
public class main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Virtual Pet Simulator!• 🌊˖°𓇼⋆🐋🐚 𓈒𓏸");
        System.out.println("Please adopt a pet turtle 🐢, dolphin 🐬, penguin 🐧, or otter 🦦 today!!");
        System.out.println("🌟 Which pet would you like to choose? (1-4) 🌟");
        System.out.println("1. Turtle 🐢");
        System.out.println("2. Dolphin 🐬");
        System.out.println("3. Penguin 🐧");
        System.out.println("4. Otter 🦦");
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("You have chosen a Turtle! 🐢");
            System.out.println("What do you want to name your turtle?");
            String turtleName = input.nextLine();
            Turtle turtlePet = new Turtle(turtleName, 100, 100, 100);
            

        }
        else if (choice == 2){
            System.out.println("You have chosen a Dolphin! 🐬");

        }
        else if (choice == 3){
            System.out.println("You have chosen a Penguin! 🐧");

        }
        else if (choice == 4){
            System.out.println("You have chosen an Otter! 🦦");

        }
        else {
            System.out.println("Invalid choice. Please restart the program and choose a valid option.");
        }

       
    }

    public static void menuTurtle(){
        System.out.println("What would you like to do with your pet?");
        System.out.println("1. Eat 🍽️");
        System.out.println("2. Sleep 💤");
        System.out.println("3. Play 🎾");
        System.out.println("4. Swim 🏊‍♂️");
        System.out.println("5. Hide in shell 🐢");
        System.out.println("6. Do Nothing 😐");
        System.out.println("7. Exit ❌");
    
        
    }
}
