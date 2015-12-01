/**
 * represents a cat
 * @author johns6971
 */
public class Cat extends Pet {
    
    private int lives;
    
    public Cat(String name, int age, String gender, int lives) {
        super(name, age, gender);
        this.lives = lives;
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("I walk on 4 legs");
    }
    
    public void purr() {
        System.out.println("PURRRRR....");
    }
    
    public int getNumLives() {
        return this.lives;
    }
    
    @Override
    public String toString() {
        String output = "CAT \n";
        output += "name: " + super.getName() + "\n";
        output += "Age: " + super.getAge() + "\n";
        output += "Gender: " + super.getGender() + "\n";
        output += "Lives: " + this.lives + "\n";
        return output;
    }
}
