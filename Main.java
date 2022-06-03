import java.io.File;
import java.util.Scanner;

public class Main {

	public static void printHello(Cat cat){
		System.out.println("Hello");
		cat.introduce();
	}

    public static void main(String[] args) {


		System.out.println(Cat.description);


		Cat.numOfCats = 10000;


	  Cat cat1 = new Cat("Agnes","grey");
		printHello(cat1);
	  cat1.purr();
	  cat1.getColour();
	  System.out.println(cat1.getName());
	  System.out.println(Cat.numOfCats);


	  System.out.println(cat1.introduce());


	  Cat cat2 = new Cat();
	  //cat2.setName("Tom");
	  System.out.println(cat2.introduce());
		System.out.println(Cat.numOfCats);

	  Cat cat3 = new Cat(3.5, 50, "Blacky", "black");
	  cat3.purr(3.5);
	  System.out.println(Cat.numOfCats);



    }
}
