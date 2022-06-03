public class Dog {

    private double weight;
    private double height;
    private String name;
    private String colour;
    private int age;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    //constructor
    public Dog(double weight, double height, String name, String colour) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.colour = colour;
    }

    public Dog(String name, String colour){
        this(0, 0, name, colour);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Dog(){
        //this(8, 75, "Missy", "black");
        //age = 7;
        this("Missy", "black");
    }
}
