// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;



    // Constructor for CoffeeDrink class
    public CoffeeDrink(int paramNumberOfCups, String flavor, boolean hasWhippedCream) {// accepting parameters, able to use this with coffee drinks
        // TODO
        numberOfCups = paramNumberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream; // two different scopes, filling in those variables
// if white, it will default to the parameter aka variable with the smallest scope only this method
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        if (hasWhippedCream){
            System.out.println("You order includes" + numberOfCups + "cups of" + flavor + "coffee with whipped cream!");

        }else {
            System.out.println("You order includes" + numberOfCups + "cups of" + flavor + "coffee without whipped cream!");
        }

        // Make this method print order details.
        // Include information stored in each variable.

    }
}
