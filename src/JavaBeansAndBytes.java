import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    //double (another one for numbers, but decimals)

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes(); //creating a new class
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {// isOpen == true is also an option
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");


        yearFounded = 2007;
        System.out.println("SIKE! We were ACTUALLY founded in " + yearFounded + ":)");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("iced chai latte");
        countCups();
        baristasChoice();

        CoffeeDrink drink1 = new CoffeeDrink(7, " vanilla ", true);
        CoffeeDrink drink2 = new CoffeeDrink(3, "caramel", false);
        CoffeeDrink drink3 = new CoffeeDrink(1, " mocha ", true);


        drink1.printInfo();
        drink2.printInfo();
        drink3.printInfo();


    }

    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.

        int discount = (int)(Math.random()*31); //ask why is it a decimal again
        System.out.println("You got a discount of " + discount + "%!");
    }

    public void specialOfTheDay(String special) {//need to declare string if you want it to be called in a method
        // TODO
        System.out.println("Today's special is " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        for (int x=1; x < 6; x++){//or <=5 , start, condition, and increments are the three parts of for loops
            System.out.println(x);
        }

        for (int x = 2; x < 12; x = x+3){
            System.out.print(x + ",");
        }


        for (int x = 8; x > -1; x=x-1){
            System.out.println(x);
        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        double r = Math.random();// gives a decimal between 0 and 1
        if(r<0.25){
            System.out.println("the barista recommends a latte");
        }else if(r<.5){
            System.out.println("the barista recommends a cappuccino");
        }else if (r<.75){
            System.out.println("the barista recommends a steamer");
        }else{
            System.out.println("the barista recommends a dark roast");
        }

    }
}

