public class Cat {
    //instance variables
    private double weight;
    private double height;
    private String name;
    private String colour;

    public static int numOfCats= 0;

    public static String description = "This is a Cat class";

    public static void getNumOfCats(){
        System.out.println(numOfCats);
    }

    public Cat(double weight, double height, String name, String colour) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.colour = colour;
        numOfCats ++;
    }

    public Cat(){
        this("Kitty", "white"); //this() calls a different constructor
    }

    public Cat(String name, String colour){
        this(3.5, 50, name, colour);
    }

    //method overloading
    void purr(){
        System.out.println("Purr purr and my name is " + name);
    }

    public void purr(double time){
        purr();
        System.out.println("I'm going to purr for " + time + " seconds and my name is " + name);
    }

    public String getName(){
        return this.name;
    }

    String introduce(){
        return "My name is " + name;
    }
    String getColour(){
        return colour;
    }

}
