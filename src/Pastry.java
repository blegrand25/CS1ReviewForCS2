public class Pastry {

    private int numberOfPastries;
    private String flavor;
    private String nameOfPastry;


    public Pastry(int paramNumberOfPastries, String type, String nameOfPastry){
        numberOfPastries = paramNumberOfPastries;
        this.flavor = type;
        this.nameOfPastry = nameOfPastry;

        pastries();
    }

    public void pastries(){
        numberOfPastries = 2;
        flavor = "chocolate";
        nameOfPastry = "croissants";

    }


    public String getType () {
        return flavor;
    }
    public void type(String type) {
        this.flavor = flavor;
    }

    // 3 private variables --> name, type, number
    // use getter and setter method for each variable
    // constructor that takes three parameters

    public void printInfo(){
        System.out.println("Your order ALSO includes " + numberOfPastries + flavor + nameOfPastry + "!!" );
    }


}
