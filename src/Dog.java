/**
 * Represents a dog
 * @author johns6971
 */
public class Dog extends Pet {
    
    public Dog (String name, int age, String gender) {
        //Give info to super class
        super(name, age, gender);
    }
    
    @Override
    public void speak() {
        System.out.println("WOOF WOOF BARK");
    }

    @Override
    public void move() {
        System.out.println("I walk on 4 legs");
    }
    
    public void howl() {
        System.out.println("HOWLLLLLLLL");
    }
    
    @Override
    public String toString() {
        String output = "DOG \n";
        output += "name: " + super.getName() + "\n";
        output += "Age: " + super.getAge() + "\n";
        output += "Gender: " + super.getGender() + "\n";
        return output;
    }
    
    
}
