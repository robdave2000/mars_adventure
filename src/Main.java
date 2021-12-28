import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("The game is about to start....\n" +
                "Booting up....\n" +
                "....\n" +
                "....\n" +
                "....\n" +
                "Ready");

        System.out.println("\nWelcome. What is your name?");
        String name = input.nextLine();

        System.out.println("\nHello, " + name + " --- Welcome to the Mars Adventure Game.\n" +
                "Yesterday, you received a call from your good friend at NASA.\n" +
                "They need someone to go to Mars, and you have been selected.\n" +
                "\nAre you excited? Type Y or N");
        String excited = input.nextLine();
        if (excited.equals("Y") || excited.equals("y"))
        {
            System.out.println("I knew you would say it. It's gonna be an amazing trip to Mars!\n");
        }
        else
        {
            System.out.println("Not what I was excepting but you signed the contract. Your going to Mars!\n");
        }

        System.out.println("It's time to pack for your trip to Mars.\n" +
                "How many suitcases do you plan on bringing?");
        int suitcase = input.nextInt();
        input.nextLine();
        if (suitcase > 2)
        {
            System.out.println("That's way to many. You need to pack more lightly.\n" +
                    "Please bring only 2 bags.\n");
        }
        else if (suitcase == 2)
        {
            System.out.println("Your a perfect packer!\n");
        }
        else if (suitcase < 2)
        {
            System.out.println("You could have packed more.\n");
        }

        System.out.println("You are allowed to bring one pet with you.\n" +
                "What type of pet are you bringing with you?");
        String pet = input.nextLine();

        System.out.println("What is your pet's name?");
        String petName = input.nextLine();

        System.out.println("Cool, so your bringing " + petName + " the " + pet + "\n");

        System.out.println("NASA has a interior design team offering to outfit your spaceship." +
                "You have a couple of options for the interior decor of your ship.\n");
        System.out.println("Your options are:\n" +
                "A: Sleek, modern minimalism\n" +
                "B: Retro/vintage space age\n" +
                "C: SF Hippie chic");
        System.out.println("Which decor would you like? Choose A, B, C.");
        String interior = input.nextLine();

        if (interior.equals("A"))
        {
            interior = "modern";
        }
        else if (interior.equals("B"))
        {
            interior = "retro";
        }
        else if (interior.equals("C"))
        {
            interior = "hippie";
        }

        System.out.println("\nI can see it now:\n" +
                "" + name + " and " + petName + " surfing the celestial abyss ...\n" +
                "in a " + interior + " spaceship.\n" +
                "" + name + " -- the day is here!\n" +
                "You crawl into the spaceship with " + petName + "\n" +
                "Brace for take off!\n" +
                "5 ...\n" +
                "4 ...\n" +
                "3 ...\n" +
                "2 ...\n" +
                "1 ...\n" +
                "* LIFTOFF *");
    }
}
